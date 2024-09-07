package digitAnalysis;

public class DigitAnalysis {
    /** This question involves the use of check digits, which
     * can be used to help detect if an error has occurred
     * when a number is entered or transmitted electronically
     * An algorithm for computing a check digit, based on the digits
     * of a number, is provided in part (a).
     */
    /** Returns the check digit for num, as described in part (a).
     * Precondition: The number of digits in num is between one and six,
     * inclusive.
     * num >= 0.
     * Write the getCheck method, which computes the check digit for a number
     * according to the following rules:
     * * Multiply the first digit by 7, the second digit (if one exists) by 6,
     *   the third digit (if one exists) by 5, and so on. The lenght of the
     *   method's int parameter is at most six; therefore, the last digit of a 
     *   six-digit number will be multiplied by 2.
     * * Add the products calculated in the previous step.
     * * Extract the check digit, which is the rightmost digit of the sum
     *   calculated in the previous step.
     * 
     * Examples:
     * * Number is 283415
     * * The sum to calculate is:
     *   * (2x7) + (8x6) + (3x5) + (1x3) + (5x2) = 14 + 48 + 15 + 16 + 3 + 10 = 106
     * * The check digit is the rightmost digit of 106, or 6, and getCheck returns the integer
     *   value 6.
     * * Number is 2183
     * * The sum to calculate is:
     *   * (2x7) + (1x6) + (8x5) + (3x4) = 14 + 6 + 40 + 12 = 72
     * * The check digit is the rightmost digit of 72, or 2, and getCheck returns
     *   the integer value 2.
     */
    public static int getCheck(int num){
       
        int y = getDigit(num, 1) * 7 + getDigit(num,2) * 6 + getDigit(num, 3) * 5 + getDigit(num, 4) * 4 +  getDigit(num, 5) * 3 + getDigit(num, 6) * 2;

        int z = y % 10;
 
        return z;
    }

    /** Returns the number of digits is num
     * Example:
     * * 123213 = getNumberOfDigits(123213) = 6
     */
    public static int getNumberOfDigits(int num){
        

        int contador = 0;

        while(num>0){

            num = Math.floorDiv(num, 10);
            contador = contador + 1;

        }

        return contador; 

    }

    /** Returns the nth digit of num.
     * Precondition: n >= 1 and n <= the number of digits in num.
     * Example:
     * * 123213 = getDigit(123213, 1) = 1
     */
    public static int getDigit(int num, int n){

        int numberOfDigits = getNumberOfDigits(num);
        int x = 0;
        int y = numberOfDigits - n;

        if(numberOfDigits < n){

           return x;

        }

        for(int i = 0; i<y; i++){

            num = Math.floorDiv(num, 10);


        }

        x = num % 10;

        return x; 
    }

    /** Returns true if num  numWithCheckDigit is valid, or false otherwise
     * as described in part (b).
     * * Precondition: The number of digits in numWithCheckDigit is between two and
     * seven, inclusive.
     * numWithCheckDigit >= 0
    */
    /** Write the isValid method. The method returns true if its parameter numWithCheckDigit,
     * which represents a number containing a check digit, is valid, and false otherwise.
     * The check digit is always the rightmost digit of numWithCheckDigit.
     * Examples:
     * * getCheck(159) = 2, the check digit for 159 is 2.
     * * isValid(1592) true, the number 1592 is a valid combination of a number
     *   (159) and its check digit (2)
     * * isValid(1593) false, the number 1594 is not a valid combination of a number
     *   (159) and its check digit (3) because 2 is the check digit for 159.
     */
    public static boolean isValid(int numWithCheckDigit){

           int x = Math.floorDiv(numWithCheckDigit, 10);

        if(getCheck(x) == numWithCheckDigit % 10){

            return true;

        }else{

            return false;

        }

    }
    }

