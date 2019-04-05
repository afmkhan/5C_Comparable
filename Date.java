/**
  Represent a date
 */
public class Date{
    private int y,m,d;
    

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }
    
    public int compareTo( Object otherObj){
        Date newD = (Date) otherObj;
        if (y > newD.y) {return 1;}
        else if (newD.y > y) {return -1;}
        else if (m > newD.m) {return 1;}
        else if (newD.m > m) {return -1;}
        else if (d > newD. d) {return 1;}
        else if (newD.d > d) {return -1;}
        return 0;

        
    }

}