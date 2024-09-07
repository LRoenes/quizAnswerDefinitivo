import integerAnalysis.*;
import slopeMath.*;
import appleBag.*;
import digitAnalysis.*;
import hailstoneSequence.*;
import primeNumbers.*;
import numberOfProperties.*;

public class Main {
    public double analyzeInts(int max, int n, int[] data) {
        IntegerAnalysis.testIndex = 0;
        IntegerAnalysis.data = data;
        return IntegerAnalysis.analyzeInts(max, n);
    }

    public double slopeMathGetSlope(int a, int b) {
        return SlopeMath.getSlope(a, b);
    }

    public boolean slopeMathIsOnLine(int x, int y, int a, int b, int c) {
        return SlopeMath.isOnLine(x, y, a, b, c);
    }

    public int bagApples(double targetWeight, double allowedVariation,
            double[] appleWeights) {
        AppleBag.testIndex = 0;
        AppleBag.applesWeight = appleWeights;
        return AppleBag.bagApples(targetWeight, allowedVariation);
    }

    public int getCheck(int num){
        return DigitAnalysis.getCheck(num);
    }

    public static int getNumberOfDigits(int num){
        return DigitAnalysis.getNumberOfDigits(num);
    }

    public static int getDigit(int num, int n){
        return DigitAnalysis.getDigit(num, n);
    }

    public static boolean isValid(int numWithCheckDigit){
        return DigitAnalysis.isValid(numWithCheckDigit);
    }
    
    public static int hailstoneLength(int n) {
        return HailStone.hailstoneLength(n);
    }

    public static boolean isLongSeq(int n) {
        return HailStone.isLongSeq(n);
    }

    public static double propLong(int n) {
        return HailStone.propLong(n);
    }

    public static boolean isPrimeNumber(int num) {
        return PrimeNumbers.isPrimeNumber(num);
    }

    public static double propOfPrimes(int start, int end) {
        return PrimeNumbers.propOfPrimes(start, end);
    }

    public static boolean isSquare(int num) {
        return NumberOfProperties.isSquare(num);
    }

    public static boolean isCube(int num) {
        return NumberOfProperties.isCube(num);
    }

    public static double ratioOfCubeSumsToSquareSums(int start, int end) {
        return NumberOfProperties.ratioOfCubeSumsToSquareSums(start, end);
    }
}