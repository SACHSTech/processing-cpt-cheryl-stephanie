import processing.core.PApplet;
import processing.core.PImage;


public class Sketch1 extends PApplet {
	
	//variables for the playing screen 
  int cellSize = 40;
  int rowNum = 12;
  int columnNum = 20;
  int screenHeight;
  int screenWidth;
 
  public void settings() {
	 
   //calculating the size of the screen
   screenHeight = rowNum * cellSize;
   screenWidth = columnNum * cellSize;
    size(screenWidth, screenHeight);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {

    background(13, 37, 145);
 
  }


  public void draw() {
    drawMap();
  }

  public void drawMap() {

    //background for the map
    PImage mapBackground = loadImage("Pics/BackgroundStars.jpg");
    mapBackground.resize(800, 435); 
    image(mapBackground, 0, 0);
   
    
    int levelData [] [] = {
      
      //rectangle = 1, pellets = 0, 5 = empty space, final destination = 3, barricade = 2
      {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
      {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
      {1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1},
      {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
      {1, 0, 1, 0, 1, 1, 0, 1, 1, 2, 2, 1, 1, 0, 1, 1, 0, 1, 0, 1},
      {1, 0, 0, 0, 0, 0, 0, 1, 3, 5, 5, 5, 1, 0, 0, 0, 0, 0, 0, 1},
      {1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1},
      {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
      {1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1},
      {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
      {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    };
   
  
   for(int row = 0; row < levelData.length; row++) {
     for(int column = 0; column < levelData [row].length; column++) {
       int cell = levelData[row] [column];


       //using the numbers on the 2D array to determine where each items is placed
       if(cell == 1) {
         PImage moonBlock = loadImage("Pics/moonBlock.png"); 
         moonBlock.resize(40, 40);
         //image(moonBlock, (column * 40 - column) + 10 , (row * 40  - row) + 5);
         image(moonBlock, column * 40, row * 40);
        }

       if(cell == 0){
         noStroke();
         fill(251, 255, 13);
         //ellipse((column * 40 - column) + 30, (row * 40 - row) + 25, 20, 20);
         ellipse((column * 40) + 20, (row * 40) + 20 , 20, 20);
        }

        if (cell == 3){
         PImage Earth = loadImage("Pics/BigEarth.png");
          Earth.resize(40, 40);
          image(Earth, (column * 40), (row * 40));
        } 

        if (cell == 2){
          noStroke();
          fill(184, 111, 17);
          rect((column * 40) , (row * 40), 40, 40);
        }
      }
    }
  }
 

  
 
}
