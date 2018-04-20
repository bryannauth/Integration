
public class NavigationGame {
  // We need our 2d array 4x4
  // One method that take in a string and moves Up,Down,Left,Right
  // We need a random coordinate stored as the location for x stored in two
  // seperate variables
  // We need our player pos stored in two seperate variables

  private int playerX, playerY;
  private int randX, randY;

  private boolean play = true;

  private String[][] board = new String[4][4];

  public NavigationGame() {
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        board[i][j] = "O";
      }
    }
    playerX = 0;
    playerY = 0;
    randX = 3;
    randY = 3;
  }

  public void move(String Direction) {
    switch (Direction) {
      case "UP":
       // if (playerX != 0)
          playerX -= 1;
        if (playerX == randX && playerY == randY) {
          play = false;
        }
        break;

      case "DOWN":
        //if (playerX != 3)
          playerX += 1;
        if (playerX == randX && playerY == randY) {
          play = false;
        }
        break;

      case "LEFT":
        //if (playerY != 0)
          playerY -= 1;
        if (playerX == randX && playerY == randY) {
          play = false;
        }
        break;

      case "RIGHT":
        //if (playerY != 3)
          playerY += 1;
        if (playerX == randX && playerY == randY) {
          play = false;
        }
        break;

      default:
        System.out.println("No input");
        break;
    }
  }

  public boolean isPlay() {
    return play;
  }

  public void display() {
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        board[i][j] = "O";
      }
    }
    System.out
        .println("Move P to the X with the directions: up, down, left, right.");
    try {
    board[playerX][playerY] = "P";
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("You tried moving the player off the grid!");
      if(playerX < 0)
        playerX = 0;
      else if (playerX > 3)
        playerX = 3;
      
      if(playerY < 0)
        playerY = 0;
      else if (playerY > 3)
        playerY = 3;
      board[playerX][playerY] = "P";
    }
    board[randX][randY] = "X";
    System.out.println(board[0][0] + board[0][1] + board[0][2] + board[0][3]);
    System.out.println(board[1][0] + board[1][1] + board[1][2] + board[1][3]);
    System.out.println(board[2][0] + board[2][1] + board[2][2] + board[2][3]);
    System.out.println(board[3][0] + board[3][1] + board[3][2] + board[3][3]);

  }
}
