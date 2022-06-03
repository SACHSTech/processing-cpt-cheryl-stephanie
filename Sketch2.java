import processing.core.PApplet;
import processing.core.PImage; // import the PImage library

//Stephanie's Sketch2.java

public class Sketch2 extends PApplet {

  PImage imgSpace;
	PImage imgRocket;
  PImage imgMaze;
  PImage imgEarth;
	

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

    imgSpace.resize(imgSpace.width, imgSpace.height); //resize Space
    imgRocket.resize((int)(imgRocket.width * 0.4) , (int)(imgRocket.height * 0.4)); //resize Rocket
    imgMaze.resize(800, 500); //resize Maze
    imgEarth.resize((int)(imgEarth.width * 0.5) , (int)(imgEarth.height * 0.5)); //resize Earth

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

    rect(350, 198, 100, 10);
    fill(0, 0, 255);

  }
  
  // define other methods down here.
}
