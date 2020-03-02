import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaDBTest
{

	public static void main(String[] args) throws Exception
	{
		String driver = "org.apache.derby.jdbc.EmbeddedDriver";
		String url = "jdbc:derby:CSC251;create=true";
		String username = "";
		String password = "";
		
		Class.forName(driver);
		
		Connection conn = DriverManager.getConnection(url, username, password);
		
		try {
			Statement stat = conn.createStatement();

			stat.execute("CREATE TABLE SimpleTest (Name CHAR(20))");
			stat.execute("INSERT INTO SimpleTest VALUES ('Juliet')");

			ResultSet result = stat.executeQuery("SELECT * FROM SimpleTest");
			result.next();
			System.out.println(result.getString("Name"));

			stat.execute("DROP TABLE SimpleTest");
		}
		finally
		{
			conn.close();
		}
		
		
		//SINCE WE ARE USING THE EMBEDDED DB IT NEEDS TO BE SHUTDOWN
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

}
