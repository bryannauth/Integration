
public class NavigationGame {
  //We need our 2d array 4x4
  //One method that take in a string and moves Up,Down,Left,Right
  //We need a random coordinate stored as the location for x stored in two seperate variables
  //We need our player pos stored in two seperate variables
  
  private int playerX, playerY;
  private int randX, randY;
  
  private boolean play = true;
  
  private String[][] board = new String[4][4];
  
  
  
  public NavigationGame()
  {
    for(int i = 0; i < 4; i++)
    {
      for(int j = 0; j < 4; j++)
      {
        board[i][j] = "O";
      }
    }
    playerX = 0;
    playerY = 0;
    randX = (int)Math.random() % 4;
    randY = (int)Math.random() % 3 + 1;
  }
  
  public void move(String Direction) {
    switch (Direction) {
      case "UP":
        playerX -= 1;
        if (playerX == randX && playerY == randY) {
          play = false;
        }
        break;
        
      case "DOWN":
        playerX += 1;
        if (playerX == randX && playerY == randY) {
          play = false;
        }
        break;
        
      case "LEFT":
        playerY -= 1;
        if (playerX == randX && playerY == randY) {
          play = false;
        }
        break;
        
      case "RIGHT":
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

}
