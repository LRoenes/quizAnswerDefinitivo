package slopeMath;

public class SlopeMath {
    /** We have the following equation ax+by+c=0 that's 
     * define a line in the plane, where a is not equal to zero,
     * b is not equal to zero, and a, b, and c are all integers. 
     * The slope of a line is defined to be the double value -a/b.
     * A point (represented by integers x and y) is on a Line if the
     * equation of the line is satisfied when those x and y values are
     * substitued into the equation. That is, a point represented by x
     * and y is on the line if ax + by + c is equal to 0. Examples
     * of two line equations are shown in the following table.
     * Equation | Slope (-a / b) | Is point (5, -2) on the line?
     * 5x+4y-17=0 | -5/4 = -1.25 | Yes, because 5(5) + 4(-2) + (-17) = 0
     * -25x+40y+30=0 | 25/40 = 0.625 | No, because -25(5) + 40(-2) + (30) != 0
     *
     * Write three functions:
     * * getSlope(a, b)
     * * isOnLine(x, y, a, b, c)
     */ 

    public static double getSlope(int a, int b){
     
        double newA = a;
        double newB = b;

        
        double slope = newA/newB;
        
        return slope;


    }

    public static boolean isOnLine(int x, int y,
            int a, int b, int c) {
                
                
                if(((a * x) + (b * y ) + c) == 0){

                    return true;

                }else{

                    return false; 

                }

    }
}
