import processing.core.PApplet;
import processing.core.PImage;


public class Sketch extends PApplet {
	
	//variables for the playing screen 
  int cellSize = 40;
  int rowNum = 12;
  int columnNum = 20;
  int screenHeight;
  int screenWidth;

  int imgRocketY = 40;
  int imgRocketX = 40;


  //boolean values for screen switching
  boolean drawMenu;
  boolean drawMap;
  boolean drawEnd1;
  boolean drawEnd2;
  
  
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

    drawMenu = true;
    background(13, 37, 145);
   
  }

  public void draw() {

    //using if() to figure out which screen is needed while playing th game
    if(drawMenu){
     
      drawMenu();
    }

    else if(drawMap) {
     
     drawMap();
     Timer();
    }

    else if(drawEnd1) {
     drawEnd1();
    }

    else if(drawEnd2) {
      drawEnd2();
    }

    PImage imgRocket = loadImage("Pics/rocket.png");
    imgRocket.resize(40, 40);
    image(imgRocket, imgRocketX, imgRocketY);

 }
 

  public void drawMenu(){

    //menu screen
    PImage starsGround = loadImage("Pics/BackgroundStars.jpg");
    starsGround.resize(800, 480); 
    image(starsGround, 0, 0);

    PImage Earth = loadImage("Pics/BigEarth.png");
    Earth.resize(600, 600);
    image(Earth, 400, 300);

    PImage Sat = loadImage("Pics/satellite.png");
    Sat.resize(50,50);
    image(Sat, 600, 200);

    PImage Rocket = loadImage("Pics/rocket.png");
    Rocket.resize(200,200);
    image(Rocket, 60, 130);

    fill(247, 249, 252);
    textSize(60);
    text("Back to Earth", 235, 200);
    textSize(40); 
    text("Press s to start!", 260, 300);

    if(key == 's'){
     drawMap = true;
     drawMenu = false;
    } 
  }

  public void drawMap() {

    //playing level screen
    background(13, 37, 145);
    PImage mapBackground = loadImage("Pics/BackgroundStars.jpg");
    mapBackground.resize(800, 435); 
    image(mapBackground, 0, 0);

    PImage astroP = loadImage("Pics/astronaut.png");
    astroP.resize(40, 40);
    image(astroP, 0, 440);

    PImage imgRocket = loadImage("Pics/rocket.png");
    imgRocket.resize(40, 40); //resize Alien
    
    
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
         image(moonBlock, column * cellSize, row * 40);
        }

       if(cell == 0){
         noStroke();
         fill(251, 255, 13);
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

        if(cell == 9) {
          image(imgRocket, column*40, row*40);
        }
      }
    }
  } 

  public void keyPressed() {

    int speed = 40;
    //int stepCount = 0;
     // circle moves accordingly to what arrow directions user presses
    if (keyPressed) {
      
      if (keyCode == UP) {
      
        if(imgRocketY < 80){
          speed = 0;
        }
        else{
          speed = 40;
          imgRocketY -= speed;
          //stepCount += 1;
        }
        
      }

      // if ship lands flag at corner, collect all the rectangle should open
       
      
        else if (keyCode == DOWN) {
          if(imgRocketY > 320){
            speed = 0;
          }

          else{
            speed = 40;
            imgRocketY += speed;
            //stepCount += 1;
          }
        } 

        else if(keyCode == LEFT){
          imgRocketX -= speed;
        }

        else if(keyCode == RIGHT){
          imgRocketX += speed; 
        }

        //text("Steps travelled: " + stepCount, 45, 60 );
      
    } 
  }
 
  private final long createdMillis = System.currentTimeMillis();
  public void Timer() {
  
    //counts current time in milliseconds and converts to seconds. 
    long nowMillisecond = System.currentTimeMillis();
    int nowSecond = (int) (nowMillisecond -createdMillis) / 1000;
    fill(125);
    textSize(30);
    text(nowSecond, 760, 470);

    //Based on a certain time, you get certain endings of the game
    if (nowSecond < 20){
      fill(237, 234, 69);
      textSize(15);
      text("<(Use arrows keys to navigate the spaceship.Collect all of the fuel to go back to Earth)", 45, 460);
      text("**Hurry! you only have 60sec!!", 45, 474);
    }

    if (nowSecond > 30 && nowSecond < 35){
      fill(237, 234, 69);
      textSize(15);
      text("<(less than 30 seconds left... Speed up!)", 45, 460);
      
    }

    if (nowSecond > 50 && nowSecond < 56){
      fill(237, 234, 69);
      textSize(15);
      text("<(The spaceship is breaking apart.. oxygen is depleting...)", 45, 460);
    }

    if (nowSecond == 58 || nowSecond == 59 || nowSecond == 57){
      fill(237, 234, 69);
      textSize(15);
      text("<(Is this the end?)", 45, 460);
    }
    
    if(nowSecond == 60) {
      drawEnd1 = true;
      drawMap = false;
    }
  }
  
  public void drawEnd1() {

    //bad end
    background(145, 41, 20);
    fill(242, 238, 237);
    textSize(40);
    text("You are trapped in space and died suffocation.", 20, 80);

    PImage xFace = loadImage("Pics/melt.png");
    xFace.resize(200, 200);
    image(xFace, 300, 150);

    fill(242, 238, 237);
    textSize(30);
    text("'Press r to go back to the main menu'", 160, 420);

    //return to menu screen
    if(keyPressed){
      if(key == 'r'){
        drawMenu = true;
        drawEnd1 = false;
      }
    }
  }

  public void drawEnd2 () {

    //Happy end
    background(62, 114, 237);
    fill(0);
    textSize(30);
    text("The spaceship landed on earth safely. Yay!", 20, 200);

    textSize(20);
    text("'Press r to go back to the main menu'", 20, 250);
  
    PImage landRock = loadImage("Pics/clipart63877.png");
    landRock.resize(150, 300);
    image(landRock, 600, 130);

    PImage astroJump = loadImage("Pics/PinClipart.com_astronaut-clipart_311716.png");
    astroJump.resize(100, 100);
    image(astroJump, 520, 335);

    noStroke();
    fill(33, 102, 50);
    rect(0, 430, 800, 800);

    noStroke();
    fill(235, 228, 40);
    ellipse(50, 60, 80, 80);

    //return to menu screen
    if(keyPressed){
      if(key == 'r'){
        drawMenu = true;
        drawEnd1 = false;
      }
    }
  }
  
 
}
