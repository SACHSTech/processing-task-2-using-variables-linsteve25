import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Drawing of a car with variables height and width
   * @linsteve25:
   */
  public void settings() {
	
    // size call
    size(800, 800);
  }

  
  public void setup() {

    // intital background and stroke
    background(81, 201, 245);
    stroke(18, 18 ,18);
  }

  public void draw() {

  // declare variables
  
  double dblWidthMultilier = ((double)(width) / 400);
  double dblHeightMultiplier = ((double)(height) / 400);

	// print the window of the car
    
  fill(255, 0, 0);
  ellipse((float) (215 * dblWidthMultilier), (float) (173 * dblHeightMultiplier), (float) (180 * dblWidthMultilier), (float) (145 * dblHeightMultiplier));
  fill(92, 237, 225);
  ellipse((float) (215 * dblWidthMultilier), (float) (180 * dblHeightMultiplier), (float) (150 * dblWidthMultilier), (float) (130 * dblHeightMultiplier));
  line((float) (250 * dblWidthMultilier), (float) (175 * dblHeightMultiplier), (float) (250 * dblWidthMultilier), (float) (123 * dblHeightMultiplier));
  line((float) (236 * dblWidthMultilier), (float) (175 * dblHeightMultiplier), (float) (236 * dblWidthMultilier), (float) (118 * dblHeightMultiplier));

  // print rectangle body of the car 

  fill(255, 0, 0);
  rect((float) (60 * dblWidthMultilier), (float) (175 * dblHeightMultiplier), (float) (265 * dblWidthMultilier), (float) (75 * dblHeightMultiplier), (float) (30 * dblWidthMultilier));

  // print wheels of the car

  fill(0);
  ellipse((float) (110 * dblWidthMultilier), (float) (250 * dblHeightMultiplier), (float) (60 * dblWidthMultilier), (float) (60 * dblHeightMultiplier));
  ellipse((float) (275 * dblWidthMultilier), (float) (250 * dblHeightMultiplier), (float) (60 * dblWidthMultilier), (float)(60 * dblHeightMultiplier));

  // print headlights

  fill(230, 226, 37);
  rect((float) (60 * dblWidthMultilier), (float) (190 * dblHeightMultiplier), (float) (25 * dblWidthMultilier), (float) (25 * dblHeightMultiplier), (float) (55 * dblWidthMultilier));

  // print doorhandles 

  fill(0);
  rect((float) (200 * dblWidthMultilier), (float) (190 * dblHeightMultiplier), (float) (30 * dblWidthMultilier), (float) (10 * dblHeightMultiplier), (float) (10 * dblWidthMultilier));

  // print door

  line((float) (236 * dblWidthMultilier), (float) (175 * dblHeightMultiplier), (float) (236 * dblWidthMultilier), (float) (250 * dblHeightMultiplier));
  line((float) (141 * dblWidthMultilier), (float) (175 * dblHeightMultiplier), (float) (140 * dblWidthMultilier), (float) (250 * dblHeightMultiplier));

  // print foreground

  fill(121, 141, 143);
  rect(0, (float) (dblHeightMultiplier * 280), (float) (400 * dblWidthMultilier), (float) (280 * dblHeightMultiplier));  
  }
}