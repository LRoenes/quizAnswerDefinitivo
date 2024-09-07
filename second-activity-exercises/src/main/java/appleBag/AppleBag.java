package appleBag;

public class AppleBag {
    /** This exercise involves adding apples to a bag until the weight
     * of the bag is within a specified range. The weight of each apple
     * is obtained using the getApple method.
     */

    /** Returns the weight of the next apple to be added to
     * the bag, with a different weight
     *  being returned with each call
     */

    /** Don't delete this code this return the weight of an apple */
    public static int testIndex = 0;
    public static double [] applesWeight = null;

    public static double getApple(){
        double result = applesWeight[testIndex];
        testIndex++;
        return result;
    }

    /** Returns the number of apples that are added to a bag,
     * as described in part (a)
     * Precondition: 0 < allowedVariation < targetWeight
     */
    public static int bagApples(double targetWeight,
        double allowedVariation){
        
            double peso = targetWeight - allowedVariation;

            double pesoTotal = 0;

            double peso1;

            int contador = 0;

        if(allowedVariation>targetWeight){

            return contador;

        }

            
       while(pesoTotal<peso){
        
        peso1 = getApple();

        pesoTotal = pesoTotal + peso1;

        contador++;

       }


       return contador-1;

    }
    /** Write the method bagApples, which obtains the weights of apples
     * to be added to a bag using calls to getApple method and returns
     * the number of apples that are added to the bag until the combined
     * weight exceeds targetWeight minus allowedVariation
     * 
     * For example, if targetWeight is 10.0 and allowedVariation is 0.5,
     * the bagApples method will return the number of apples that are added
     * until the combined weight of the apples exceeds 9.5.
     */
}
