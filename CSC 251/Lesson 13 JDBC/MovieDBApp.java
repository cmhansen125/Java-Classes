import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MovieDBApp 
{
	private static final int SELECTION_FIND_MOVIE = 1;
	private static final int SELECTION_WRITE_REVIEW = 2;
	private static final int SELECTION_VIEW_REVIEWS = 3;
	private static final int SELECTION_EXIT = 4;


	public static void main(String[] args) throws Exception {
		
		
		
		Scanner in = new Scanner(System.in);
		int selection = getMenuSelection(in);
		
		while(selection != SELECTION_EXIT)	{
			
			String driver = "org.apache.derby.jdbc.EmbeddedDriver";
			String url = "jdbc:derby:Lab13DB;create=true";
			String username = "";
			String password = "";
			
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			
			if(selection == SELECTION_FIND_MOVIE)
			{
				System.out.print("ENTER RATING>> ");
				String rating = in.nextLine();
				rating = rating.trim();
				
				try
				{
					Statement stat = conn.createStatement();

					ResultSet result = stat.executeQuery("Select * From MOVIE WHERE RATED='" + rating + "'");
					System.out.println("Movies:");
					while (result.next()) {
						System.out.println(result.getString("MOVIE_NAME"));
					}

				}
				finally
				{
					conn.close();
				}
				
			}
			else if(selection == SELECTION_WRITE_REVIEW) {
				
				
				
				System.out.print("ENTER MOVIE NAME>> ");
				String movieName = in.nextLine();
				movieName = movieName.trim();
				
				System.out.print("ENTER NUMBER OF STARS (1 - 5)>> ");
				int stars = in.nextInt();
				in.nextLine();
				
				System.out.print("ENTER MOVIE REVIEW TEXT>> ");
				String reviewText = in.nextLine();
				
				try {
					Statement stat = conn.createStatement();
					
					ResultSet result = stat.executeQuery("Select MOVIE_ID from MOVIE WHERE MOVIE_NAME like '%" + movieName + "%'");
					result.next();
					int movieID = result.getInt("MOVIE_ID");
					stat.execute("INSERT INTO MOVIE_REVIEW (MOVIE_ID, REVIEW, STARS) values ("+ movieID + ", '" + reviewText + "', " + stars + ")");
				}
				
				finally {
					conn.close();
				}
				

			}
			else if(selection == SELECTION_VIEW_REVIEWS)
			{
				System.out.print("ENTER MOVIE NAME>> ");
				String movieName = in.nextLine();
				
				try {
					Statement stat = conn.createStatement();
					
					ResultSet result = stat.executeQuery("Select MOVIE_ID from MOVIE WHERE MOVIE_NAME like '%" + movieName + "%'");
					result.next();
					int movieID = result.getInt("MOVIE_ID");
					
					ResultSet reviewResult = stat.executeQuery("Select REVIEW, STARS from MOVIE_REVIEW WHERE MOVIE_ID=" + movieID);
					int count = 0;
					int averageStars = 0;
					while (reviewResult.next()) {
						System.out.println(reviewResult.getString("REVIEW") +"\n" + reviewResult.getInt("STARS"));
						averageStars = averageStars + reviewResult.getInt("STARS");
						count++;
					}
					averageStars = averageStars / count;
					System.out.println("Average Stars for this film " + averageStars);
				}
				
				finally {
					conn.close();
				}
				
			}
			else
			{
				System.out.println("INVALID MENU OPTION");
			}
			selection = getMenuSelection(in);
		}
		in.close();
		try
		{
			DriverManager.getConnection("jdbc:derby:;shutdown=true");
		}
		catch (SQLException se)
		{
			if(se.getErrorCode() == 50000 && se.getSQLState().equals("XJ015"))
			{
				System.out.println("Derby was shutdown normally.");
			}
			else
			{
				se.printStackTrace();
			}
		}
	}
	
	
	public static int getMenuSelection(Scanner in)
	{
		int selection = 0;
		
		System.out.println("\n--- MAIN MENU ---");
		System.out.println("(1) Find Movie");
		System.out.println("(2) Write Review");
		System.out.println("(3) View Movie Reviews");
		System.out.println("(4) Exit");
		System.out.print("\nENTER MENU SELECTION>> ");

		if(in.hasNextInt())
		{
			selection = in.nextInt();
			in.nextLine();
		}
		else
		{
			in.nextLine();
		}
		
		System.out.println();

		return selection;
	}

}
