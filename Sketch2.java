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
  PImage imgAlien;
  PImage imgEx;
	

  /**
   * Called once at the beginning of execution, put your size all in this method
   */

  public void settings() {
	// put your size call here
    size(900, 550);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    
    // load images
    imgSpace = loadImage("Pics/BackgroundStars.jpg");
    imgRocket = loadImage("Pics/rocket.png");
    imgMaze = loadImage("Pics/mazeoutline.png");
    imgEarth = loadImage("Pics/earth.png");
    imgHeart1 = loadImage("Pics/heart1.png");
    imgHeart2 = loadImage("Pics/heart2.png");
    imgHeart3 = loadImage("Pics/heart3.png");
    imgAstro = loadImage("Pics/astronaut.png");
    imgAlien = loadImage("Pics/alien.png");

    imgEx = loadImage("Pics/maze.png");

    imgSpace.resize(imgSpace.width, imgSpace.height); //resize Space
    imgRocket.resize(50, 50); //resize Alien
    imgMaze.resize(900, 500); //resize Maze
    imgEarth.resize((int)(imgEarth.width * 0.5) , (int)(imgEarth.height * 0.5)); //resize Earth
    imgHeart1.resize(50, 50); //resize Heart1
    imgHeart2.resize(50, 50); //resize Heart2
    imgHeart3.resize(50, 50); //resize Heart3
    imgAstro.resize(50, 50); //resize Astronaut
    imgAlien.resize(50, 50); //resize Alien

    imgEx.resize(900, 500); //resize Maze
  

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    // draw background
    image(imgSpace, 0, 0);

    // maze outline
    image(imgMaze, 0, 0);

    // Ex maze outline
    image(imgEx, 0, 0);

    // earth
    image(imgEarth, 410, 210);

    //rocket
    image(imgRocket, 130, 140);

    fill(0, 0, 250);
    rect(390, 198, 120, 10);
    
    fill(0, 0, 0);
    rect(0, 485, 900, 64);

    // heart health
    image(imgHeart1, 660, 490);
    image(imgHeart2, 720, 490);
    image(imgHeart3, 780, 490);

    // astronaut
    image(imgAstro, 50, 490);

    // alien
    image(imgAlien, 133, 225);
    

  }
  
  // define other methods down here.
}
