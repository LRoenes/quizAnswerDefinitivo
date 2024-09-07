package integerAnalysis;

public class IntegerAnalysis {
    /* Don't delete this code */
    public static int testIndex = 0;
    public static int [] data = null;
    /** Returns an int from simulated user input */
    public static int getInt() {
        /* Don't delete this code */
        int result = 0;
        result = data[testIndex];
        testIndex++;
        return result;
    }

    /** Analyzes n values obtained from the getInt method and returns
     * the proportion of these values that meet the criteria described
     * in part (a)
     * Precondition: max > 0, n > 0
     */
    public static double analyzeInts(int max, int n){
        /* to be implemented in part (a) */
       
        int contador = 0;

        for(int i = 0 ; i < n; i++){

            int x = getInt();

            if(x > 0 && max > x && x % 3 == 0){

                contador = contador + 1;  

            }

        }

       double newContador = contador;

       double newN = n;

       double numeroProporcion = newContador/newN;

        return numeroProporcion;

    }

    /** Write a method analyzeInts, which obtains n values using the getInt 
     * and return the proportion of the obtained values that meet all the following
     * criteria
     * * The value is grather than 0
     * * The value is less tha max
     * * The value is divisible by 3
     * For example, if max is 10 and n is 8 and the 8th values obtained by
     * getInt are 6, -3, 5, 0, 12, 3, 3, and 9, then analyzeInts should return 0.5
     * because four of the eight values (6, 3, 3, and 9) meet all the criteria.
     * Complete method analyzeInts.
     * * Remenber Casting *
     */
}
