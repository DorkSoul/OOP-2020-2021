package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing2 extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		
	}
	
	public void draw()
	{	
		if (mouseY < 250){
			background(255,0,0);
		
			noStroke();

			fill(255,255,0);
			circle(250, 300, 400);

			fill(0, 255, 255);
			triangle(250, 50, 50, 450, 450, 450);
		
			fill(255,255,255);
			ellipse(250, 250, 180, 100);
		
			fill(0,0,0);
			circle(250, 250, 70);
		}
		
		else{
			background(255,0,0);
		
			noStroke();

			fill(255,255,0);
			circle(250, 300, 400);

			fill(0, 255, 255);
			triangle(250, 50, 50, 450, 450, 450);
		
			
		}
		
	}
}
