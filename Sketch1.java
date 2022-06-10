import processing.core.PApplet;


public class Sketch1 extends PApplet {
	
	//Variables for the playing screen 
  int cellSize = 40;
  int rowNum = 12;
  int columnNum = 20;
  int screenHeight;
  int screenWidth;
  int screenData [] = new int [(rowNum - 1) * (columnNum - 1)];

  public void settings() {
	 
   //calculatint the size of the screen
   screenHeight = rowNum * cellSize;
   screenWidth = columnNum * cellSize;
    size(screenWidth, screenHeight);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {

    background(116, 118, 242);
 
  }

 //include Pics/
  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
   
   int levelData []= {
      3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 6,
      1, 19, 26, 26, 22, 0, 19, 26, 26, 26, 26, 26, 26, 22, 0, 19, 26, 26, 22, 4,
      1, 21, 0, 0, 21, 0, 21, 0, 0, 0, 0, 0, 0, 21, 0, 21, 0, 0, 21, 4,
      1, 21, 0, 19, 24, 26, 16, 26, 26, 18, 18, 26, 26, 16, 26, 24, 22, 0, 21, 4,
      1, 21, 0, 21, 0, 0, 21, 0, 0, 101, 101, 0, 0, 21, 0, 0, 21, 0, 21, 4,
      1, 17, 26, 16, 26, 26, 20, 0, 99, 100, 100, 100, 0, 17, 26, 26, 16, 26, 20, 4,
      1, 21, 0, 21, 0, 0, 21, 0, 0, 0, 0, 0, 0, 21, 0, 0, 21, 0, 21, 4,
      1, 21, 0, 25, 18, 26, 16, 26, 26, 26, 26, 26, 26, 16, 26, 18, 28, 0, 21, 4,
      1, 21, 0, 0, 21, 0, 21, 0, 0, 0, 0, 0, 0, 21, 0, 21, 0, 0, 21, 4,
      1, 25, 26, 26, 28, 0, 25, 26, 26, 26, 26, 26, 26, 28, 0, 25, 26, 26, 28, 4,
      9, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 12,
    };
  
   

    int x;
    int y;
  for (y = 0; y < screenHeight; y += cellSize) {
    for (x = 0; x < screenWidth; x += cellSize) {
      for ( int i = 0; i < rowNum * columnNum ; i++){
        screenData [i] = levelData [i];
        if (levelData [i] == 0 ) {
          noStroke();
          fill(101, 111, 117);
          rect( x, y, cellSize, cellSize);
        }
       }
    }
  }
   
  }
    //0 = rectangle, 1 = left border, 2 = top border, 4 = right border, 8= bottom border, 16 = pellets
 
  
  // define other methods down here.

  
 
}
