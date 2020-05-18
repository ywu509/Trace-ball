/** UPI:ywu509  Author: Yulun Wu
*/
import java.awt.*;
public class MovingRectangle extends MovingShape {
	/** default value constructor
	*/
	public MovingRectangle() {
		super();
	}
	
	/** given value constructor
	*/
	public MovingRectangle(int x, int y, int w, int h, int mw, int mh, Color c, Color fc, int pathType) {
		super(x, y, w, h, mw, mh, c, fc, pathType);
	}

    /** draw method implementation
     * draw the shape with fill color and border color
     * @param g     the Graphics control
     */
    public void draw(Graphics g){
    	g.setColor(fillColor);
    	g.fillRect(topLeft.x, topLeft.y, width, height);
    	g.setColor(borderColor);
    	g.drawRect(topLeft.x, topLeft.y, width, height);
    	drawHandles(g);	
    }
    /** return true if the mouse point is in the rectangle otherwise return false
	 */
    public boolean contains(Point mousePoint){
    	return (topLeft.x <= mousePoint.x && topLeft.y <= mousePoint.y && mousePoint.x <= (topLeft.x + width) && mousePoint.y <= (topLeft.y + height));
    }
}