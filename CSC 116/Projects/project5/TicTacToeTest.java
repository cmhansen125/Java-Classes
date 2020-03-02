public class TicTacToeTest {

  public static void main(String[] args) {
  
    char[][] game = {{'O','X','O'},
                     {'_','X','X'},
                     {'O','X','O'}};
    
    char[][] badGame = {{'O','X','W'},
                        {'_','X','X'},
                        {'O','X','O'}};
    
    
    boolean valid = TicTacToe.isValid(game);
    System.out.println("Expected: true \tActual: " + valid);
    
    valid = TicTacToe.isValid(badGame);
    System.out.println("Expected: false \tActual: " + valid); 

    //Add 3 more invalid testcases here for isValid() method
    
    String g = TicTacToe.toString(game);
    System.out.println("Expected: ");
    System.out.println("O X O");
    System.out.println("_ X X");
    System.out.println("O X O");
    System.out.println("Actual: ");
    System.out.println(g);
    
    char winner = TicTacToe.getWinner(game);
    System.out.println("Expected: X\tActual: " + winner);
    
    //Add 7 more valid testcases here for getWinner() method. 
    
    //Invalid test cases are provided for you below - You do NOT
    //need to add additional invalid tests.  Just make sure these
    //pass!
    try {
      System.out.print("Expected: class java.lang.IllegalArgumentException \tActual: ");
      g = TicTacToe.toString(badGame);
    }
    catch (IllegalArgumentException e) {
      System.out.println(e.getClass());
    }

    try {
      System.out.print("Expected: class java.lang.IllegalArgumentException \tActual: ");
      winner = TicTacToe.getWinner(badGame);
    }
    catch (IllegalArgumentException e) {
      System.out.println(e.getClass());
    }
  }
}

