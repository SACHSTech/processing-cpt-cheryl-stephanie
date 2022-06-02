import processing.core.PApplet;
import processing.core.PImage; // import the PImage library

//Stephanie's Sketch2.java

public class Sketch2 extends PApplet {

  PImage imgSpace;
	PImage imgRocket;
	

  /**
   * Called once at the beginning of execution, put your size all in this method
   */

  public void settings() {
	// put your size call here
    size(800, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    
    // load images
    imgSpace = loadImage("Pics/BackgroundMenuscreen.jpg");
    imgRocket = loadImage("Pics/rocket.png");

    imgSpace.resize(imgSpace.width, imgSpace.height); //resize Space

    imgRocket.resize(imgRocket.width*2, imgRocket.height*2); //resize Rocket

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    // draw background
    image(imgSpace, 0, 0);

    //rocket
    image(imgRocket, 0, 0);

  }
  
  // define other methods down here.
}
