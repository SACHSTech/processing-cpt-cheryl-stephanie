import processing.core.PApplet;
import processing.core.PImage;


public class Sketch1 extends PApplet {
	
	//variables for the playing screen 
  int cellSize = 40;
  int rowNum = 12;
  int columnNum = 20;
  int screenHeight;
  int screenWidth;

  boolean menu = true;

  boolean drawMenu = true;
  boolean drawMap = false;
  boolean drawEnd1 = false;
  boolean drawEnd2 = false;
 
  

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

 

 

  public void drawMenu(){
    PImage starsGround = loadImage("Pics/BackgroundStars.jpg");
    starsGround.resize(800, 480); 
    image(starsGround, 0, 0);
    textSize(40); 
    text("Press s!", 300, 300);

    if(keyPressed){
      if(key == 's'){
       drawMap = true;
       drawMenu = false;
       
      }
 
     }

  

    
   
    
  }

  public void drawMap() {
    background(13, 37, 145);
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
         image(moonBlock, column * cellSize, row * 40);
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

        //int secondTicks = second();

       
      }
    }

  
    
   
 
     
    
      
  
  } 
 
  public void Timer() {
    //int secondTicks = 60;
    for(int secondTicks = second(); secondTicks > 0; secondTicks++){
      secondTicks++;
      
      fill(125);
      textSize(30);
      text(secondTicks, 760, 470);
      
    }

  }
   
  public void draw() {


    if(drawMenu = true){
      drawMenu();
    }

    else if(drawMap = true) {
      
      drawMap();
      Timer();
      
    }

    else if(drawEnd1 = true) {

    }

    else if(drawEnd2 = true) {

    }

    
  }
  

  
 
}
