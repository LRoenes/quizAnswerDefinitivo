package numberOfProperties;

public class NumberOfProperties {
    /** Returns true if num is a perfect square and false otherwise */
    // Write the method isSquare, which returns true if num is a perfect square and false otherwise.
    //
    // A perfect square is an integer that is the square of an integer.
    // In other words, if there exists some integer x such that x * x = num, then
    // num is a perfect square.
    //
    // Example:
    // - The number 16 is a perfect square because 4 * 4 = 16.
    // - The number 20 is not a perfect square because there is no integer x such
    // that x * x = 20.
    //
    // Complete the method isSquare:
    public static boolean isSquare(int num) {
        
        double newNum = (double) Math.sqrt(num);

        int newNum2 = (int) newNum;

        if(newNum-newNum2 != 0){
        
            return false;

        }else{

            return true;

        }
        
    }

    /** Returns true if num is a perfect cube and false otherwise */
    // Write the method isCube, which returns true if num is a perfect cube and false otherwise.
    //
    // A perfect cube is an integer that is the cube of an integer.
    // In other words, if there exists some integer x such that x * x * x = num,
    // then num is a perfect cube.
    //
    // Example:
    // - The number 27 is a perfect cube because 3 * 3 * 3 = 27.
    // - The number 20 is not a perfect cube because there is no integer x such that
    // x * x * x = 20.
    //
    // Complete the method isCube:
    public static boolean isCube(int num) {
       
        int y;
        int x = 0;

        for(int i = num; i>=0; i--){

            y = i;

            if(y * y * y == num){

                x = 1;

                break; 

            }else{

                x = 0;

            }

        }

       if(x == 1){

        return true;

       }else{

        return false;

       }

    }

    /**
     * Returns the ratio of the sum of all the perfect cubes between start and end,
     * inclusive, to the sum of all the perfect squares between start and end,
     * inclusive, as described in part (a)
     * Precondition: 1 <= start <= end <= Integer.MAX_VALUE
     * There is at least one perfect square between start and end, inclusive.
     */
    // (a) Write the method ratioOfCubeSumsToSquareSums, which returns the ratio of
    // the sum of all perfect cubes
    // between start and end, inclusive, to the sum of all perfect squares between
    // start and end, inclusive.
    //
    // Example:
    // Of the numbers between 5 and 30, inclusive, two are perfect cubes (8 and 27)
    // and three are perfect squares (9, 16, and 25).
    // The sum of the two perfect cubes is 35, and the sum of the three perfect
    // squares is 50.
    // The method call NumberProperties.ratioOfCubeSumsToSquareSums(5, 30) returns
    // the ratio of the sums 35 and 50, which is 0.7.
    //
    // Complete the method ratioOfCubeSumsToSquareSums:
    public static double ratioOfCubeSumsToSquareSums(int start, int end) {
         
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;

        for(int i = start; i<= end; i++){

            if(isSquare(i) == true){

                num1 = i;
                num2 = num2 + num1;

            }

            if(isCube(i) == true){

                num3 = i;
                num4 = num3 + num4;

            }

        }

        double prop = (double) num4/num2;
        return prop;
    }
}
