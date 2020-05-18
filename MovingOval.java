/** UPI:ywu509  Author: Yulun Wu
*/
import java.awt.*;
public class MovingOval extends MovingShape {
	/** default value constructor
	*/
	public MovingOval() {
		super();
	}
	
	/** given value constructor
	*/
	public MovingOval(int x, int y, int w, int h, int mw, int mh, Color c, Color fc, int pathType) {
		super(x, y, w, h, mw, mh, c, fc, pathType);
	}

    /** draw method implementation
     * draw the shape with fill color and border color
     * @param g     the Graphics control
     */
    public void draw(Graphics g){
    	g.setColor(fillColor);
    	g.fillOval(topLeft.x, topLeft.y, width, height);
    	g.setColor(borderColor);
    	g.drawOval(topLeft.x, topLeft.y, width, height);
    	drawHandles(g);	
    }
    /** return true if the mouse point is in the rectangle otherwise return false
	 */
    public boolean contains(Point p){
        Point center;
        center = new Point(0, 0);

        double majorRadius = (topLeft.x + width)/2;
        double minorRadius =  (topLeft.y + height)/2;
        center.setLocation(topLeft.x + majorRadius, topLeft.y + minorRadius);

        if (Math.pow(p.x - center.x, 2)/Math.pow(majorRadius, 2) + Math.pow(p.y - center.y, 2)/Math.pow(minorRadius, 2) <= 1){
            return true;
        }
        return false;
    }
}