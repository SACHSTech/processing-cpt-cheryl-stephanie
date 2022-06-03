import processing.core.PApplet;
import processing.core.PImage; // import the PImage library

//Stephanie's Sketch2.java

public class Sketch2 extends PApplet {

  PImage imgSpace;
	PImage imgRocket;
  PImage imgMaze;
  PImage imgEarth;
  PImage imgHeart1;
  PImage imgHeart2;
  PImage imgHeart3;
  PImage imgAstro;
	

  /**
   * Called once at the beginning of execution, put your size all in this method
   */

  public void settings() {
	// put your size call here
    size(800, 550);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    
    // load images
    imgSpace = loadImage("Pics/BackgroundMenuscreen.jpg");
    imgRocket = loadImage("Pics/rocket.png");
    imgMaze = loadImage("Pics/mazeoutline.png");
    imgEarth = loadImage("Pics/earth.png");
    imgHeart1 = loadImage("Pics/heart1.png");
    imgHeart2 = loadImage("Pics/heart2.png");
    imgHeart3 = loadImage("Pics/heart3.png");
    imgAstro = loadImage("Pics/astronaut.png");

    imgSpace.resize(imgSpace.width, imgSpace.height); //resize Space
    imgRocket.resize((int)(imgRocket.width * 0.4) , (int)(imgRocket.height * 0.4)); //resize Rocket
    imgMaze.resize(800, 500); //resize Maze
    imgEarth.resize((int)(imgEarth.width * 0.5) , (int)(imgEarth.height * 0.5)); //resize Earth
    imgHeart1.resize(50, 50); //resize Heart1
    imgHeart2.resize(50, 50); //resize Heart2
    imgHeart3.resize(50, 50); //resize Heart3
    imgAstro.resize(50, 50); //resize Astronaut
  

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    // draw background
    image(imgSpace, 0, 0);

    //rocket
    image(imgRocket, 130, 140);

    // maze outline
    image(imgMaze, 0, 0);

    // earth
    image(imgEarth, 360, 210);


    fill(0, 0, 250);
    rect(350, 198, 100, 10);
    
    fill(0, 0, 0);
    rect(0, 485, 800, 64);

    // heart health
    image(imgHeart1, 630, 490);
    image(imgHeart2, 680, 490);
    image(imgHeart3, 730, 490);

    image(imgAstro, 50, 490);
    

  }
  
  // define other methods down here.
}
