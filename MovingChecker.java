/** UPI:ywu509  Author: Yulun Wu
*/
import java.awt.*;
public class MovingChecker extends MovingShape {
	/** default value constructor
	*/
	
	public int xNumBlock;
	public int yNumBlock;
	
	public MovingChecker() {
		super();
	}
	
	/** given value constructor
	*/
	public MovingChecker(int x, int y, int w, int h, int mw, int mh, Color c, Color fc, int pathType) {
		super(x, y, w, h, mw, mh, c, fc, pathType);
	}

    /** draw method implementation
     * draw the shape with fill color and border color
     * @param g     the Graphics control
     */
    public void draw(Graphics g){

    }
    /** return true if the mouse point is in the rectangle otherwise return false
	 */
    public boolean contains(Point p){

        return true;
    }
}