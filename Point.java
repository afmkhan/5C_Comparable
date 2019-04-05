/**
  Represent a point, using Cartesian coordinates
 */
public class Point{
    private double xcor;
    private double ycor;
    
    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer, 
      equidistant, or farther than the Point referred to
      by the parameter.
     */
    public int compareTo( Object otherObj){
        double distanceOrig = this.xcor * this.xcor + this.ycor * this.ycor;
        Point p = (Point) otherObj;
        double distanceParam = p.xcor * p.xcor + p.ycor * p.ycor;
        if (distanceOrig > distanceParam) {return 1;}
        else if (distanceOrig < distanceParam) {return -1;}
        return 0;
    } 

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")"; 
    }

}