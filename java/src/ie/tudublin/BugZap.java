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
    float fireX;
    float fireY;
    boolean f;
    
    void drawPlayer(float x, float y, float w)
    {
        
        fill(0, 255, 0);
        square(x, y, w);
    }

    void fire(float x, float y)
    {

        fill(255, 255, 255);
        square(x, y, 6);
       
        

    }

	public void draw()
	{	// Takes 1 or 3 parameters. 1 is greyscale, 3 is RGB
        background(0);   
        
        noStroke();

        drawPlayer(playerX, playerY, playerWidth);
        
        if(f == true)
        {
            fire(fireX, fireY);
            fireY = fireY - 10;

            if(fireY < 0)
            {
                f = false;
            }
        }

        
    }
    
    public void keyPressed()
	{
		if (keyCode == LEFT)
		{
            if (playerX > 0)
            {
                playerX = playerX - 5;
            }
		}
		if (keyCode == RIGHT)
		{
            if (playerX < 500)
            {
                playerX = playerX + 5;
            }
		}
		if (key == ' ')
		{
            fireX = playerX + 8;
            fireY = playerY + 8;
            f = true;
		}
	}	
}

