package matcomp.e1.ejerciciosclases.cuaderno3;

public class LineSub extends Point4{
    // A line needs two points: begin and end.
    // The begin point is inherited from its superclass Point.
    // Private variables
    Point4 end; // Ending point

    // Constructors
    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY); // construct the begin Point
        this.end = new Point4(endX, endY); // construct the end Point
    }
    public LineSub (Point4 begin, Point4 end) { // caller to construct the Points
        super(begin.getX(), begin.getY()); // need to reconstruct the begin Point
        this.end = end;
    }

    // Public methods
    // Inherits methods getX() and getY() from superclass Point
    @Override
    public String toString() {
        return "LineSub[begin=" + super.toString() + ",end=" + end + "]";
    }

    public  Point4 getBegin() {
        return new Point4(getX(), getY());
    }
    public Point4 getEnd() {
        return end;
    }
    public void setBegin(Point4 begin) {
        setXY(begin.getX(), begin.getY());
    }
    public void setEnd(Point4 end) {
        this.end = end;
    }

    public int getBeginX() {
        return getX();
    }
    public int getBeginY() {
        return getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        setX(x);
    }
    public void setBeginY(int y) {
        setY(y);
    }
    public void setBeginXY(int x, int y) {
        setXY(x, y);
    }
    public void setEndX(int x) {
        end.setX(x);
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public int getLength() {
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return (int) Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double getGradient() {
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return Math.atan2(yDiff, xDiff);
    }   //considero que la mejor forma es la composición, porque es menos liosa que teniendo uno de los puntos heredados
        //además, una línea tiene 2 puntos, no es un punto
}
