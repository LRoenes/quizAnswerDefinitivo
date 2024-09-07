package hailstoneSequence;

public class HailStone {
    // A mathematical sequence is an ordered list of numbers. This code involves a
    // sequence called a hailstone sequence.
    // If n is the value of a term in the sequence, then the following rules are
    // used to find the next term, if one exists:
    //
    // 1. If n is 1, the sequence terminates.
    // 2. If n is even, then the next term is n / 2.
    // 3. If n is odd, then the next term is 3n + 1.
    //
    // For this sequence, assume that when the rules are applied, the sequence will
    // eventually terminate with the term 1.
    //
    // Examples of hailstone sequences:
    //
    // Example 1:
    // 5, 16, 8, 4, 2, 1
    // The first term is 5, so the second term is 5 * 3 + 1 = 16.
    // The second term is 16, so the third term is 16 / 2 = 8.
    // The third term is 8, so the fourth term is 8 / 2 = 4.
    // The fourth term is 4, so the fifth term is 4 / 2 = 2.
    // The fifth term is 2, so the sixth term is 2 / 2 = 1, and the sequence
    // terminates.
    //
    // Example 2:
    // 8, 4, 2, 1
    // The first term is 8, so the second term is 8 / 2 = 4.
    // The second term is 4, so the third term is 4 / 2 = 2.
    // The third term is 2, so the fourth term is 2 / 2 = 1, and the sequence
    // terminates.

    // Write the method hailstoneLength(int n), which returns the length of a
    // hailstone sequence that starts with n.
    //
    // Example:
    //
    // The hailstone sequence 5, 16, 8, 4, 2, 1 has a length of 6.
    // The hailstone sequence 8, 4, 2, 1 has a length of 4.
    //
    // Complete the method hailstoneLength(int n):
    /**
     * Returns the length of a hailstone sequence that starts with n, as described
     * in part (a).
     * Precondition: n > 0
     */
    public static int hailstoneLength(int n) {
        /* to be implemented in part (a) */ 

        double nNew = (double) n;

        int contador = 0;
        int x = 0;

        while(x == 0){

        if(nNew % 2 == 0){

            nNew = nNew/2;

            contador++;
             
        }if(nNew == 1){

            contador++;

            break;

         } if(nNew % 2 != 0){


            nNew = 3 * nNew + 1;

            contador++;

         }
        
       

        }



        return contador;
    }

    /**
     * Returns true if the hailstone sequence that starts with n is considered long
     * and false otherwise, as described in part (b).
     * Precondition: n > 0
     */
    // A hailstone sequence is considered long if its length is greater than its starting value.
    // For example, the hailstone sequence 5, 16, 8, 4, 2, 1 is considered long
    // because its length (6) is greater than its starting value (5).
    // The hailstone sequence 8, 4, 2, 1 is not considered long because its length
    // (4) is less than or equal to its starting value (8).
    //
    // Write the method isLongSeq(int n), which returns true if the hailstone
    // sequence starting with n is considered long and returns false otherwise.
    //
    // Complete the method isLongSeq(int n):
    public static boolean isLongSeq(int n) {
        /* to be implemented in part (b) */
        
        if(hailstoneLength(n) > n){

            return true;

        }else{

            return false;

        }



    }

    /**
     * Returns the proportion of the first n hailstone sequences that are considered
     * long, as described in part (c).
     * Precondition: n > 0
     */
    // The method propLong(int n) returns the proportion of long hailstone sequences
    // with starting values between 1 and n, inclusive.
    //
    // Example:
    // Consider the following table, which provides data about the hailstone
    // sequences with starting values between 1 and 10, inclusive.
    //
    // Starting Value: 1 2 3 4 5 6 7 8 9 10
    // Terms in Sequence: 1 2 8 3 6 9 17 4 20 7
    // Length of Sequence: 1 2 8 3 6 9 17 4 20 7
    // Long?: No No Yes No Yes Yes Yes No Yes No
    //
    // The method call Hailstone.propLong(10) returns 0.5 since 5 of the 10
    // hailstone sequences shown in the table are considered long.
    //
    // Complete the method propLong(int n):

    public static double propLong(int n) {
        /* to be implemented in part (c) */

        int contador = 0;

        for(int i = n; i>= 1; i--){

            if(isLongSeq(i) == true){

            contador++;

            }

        }

        
        double result = (double) contador/n;
        return result;

    }
}
