package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet {

    
    
	public void settings()
	{
		// If you want to use the width and 
		// height variables, they have to be after settings 
		// is called
		size(500, 500);
	}

	
	public void setup() {
		playerX = width/2 - 10;
        playerY = height - 40;
	}
    
	float x = 300;
	int i;
	String s;
    boolean b;
    float playerX;
    float playerY;
    float playerWidth = 20;
    
    void drawPlayer(float x, float y, float w)
    {
        
        fill(0, 255, 0);
        square(x, y, w);
    }

	public void draw()
	{	// Takes 1 or 3 parameters. 1 is greyscale, 3 is RGB
        background(0);   
        
        noStroke();

        drawPlayer(playerX, playerY, playerWidth);
	}
}
