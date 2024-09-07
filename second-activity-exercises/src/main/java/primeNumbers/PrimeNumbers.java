package primeNumbers;

public class PrimeNumbers {
    /** Returns true if num is a prime number and false otherwise */
    // Write the method isPrime, which returns true if a number is prime and false
    // otherwise.
    //
    // A prime number is a natural number greater than 1 that has no positive
    // divisors other than 1 and itself.
    //
    // Example:
    // - The number 2 is prime because its only divisors are 1 and 2.
    // - The number 4 is not prime because it has divisors 1, 2, and 4.
    //
    // Complete the method isPrime:
    public static boolean isPrimeNumber(int num) {
       

        int contador = 0;

        for(int i = 1; i <= num; i ++){ 

            if(num % i == 0 ){

                contador++;

             }


        }

        if(contador == 2){

            return true;

         }else{

            return false;

         }


    }

    /**
     * Returns the proportion of numbers between start and end, inclusive, that are
     * prime, as described in part (a)
     * Precondition: 1 < start <= end <= Integer.MAX_VALUE
     */
    // (a) Write the method propOfPrimes, which returns the proportion of numbers
    // between start and end, inclusive, that are prime.
    // A helper method, isPrimeNumber. The isPrimeNumber method
    // returns true if its parameter is a prime number and returns false otherwise.
    //
    // Example:
    // There are 10 numbers between 5 and 14, inclusive, and 4 of them are prime (5,
    // 7, 11, and 13).
    // So, the method call PrimeNumber.propOfPrimes(5, 14) returns 0.4.
    //
    // Complete the method propOfPrimes:
    public static double propOfPrimes(int start, int end) {
        /* to be implemented in part (a) */

        int contador = 0;

        for(int i = start; i<= end; i++){

            if(isPrimeNumber(i) == true){

                contador++;

            }

        }

        double prop = (double) contador/(end-start+1);
        return prop;
    }
}
