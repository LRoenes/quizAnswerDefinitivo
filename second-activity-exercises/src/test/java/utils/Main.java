package utils;

public class Main extends ReflectionProxy {
    @Override
    public String getTargetClassName() {
        return "Main";
    }

    public double analyzeInts(int max, int n, int [] data) {
        return invokeMethod("analyzeInts", new Class[] { int.class,
             int.class, int[].class }, max, n, data);
    }
    
    public double slopeMathGetSlope(int a, int b) {
        return invokeMethod("slopeMathGetSlope", new Class[] { int.class,
             int.class }, a, b);
    }

    public boolean slopeMathIsOnLine(int x, int y, int a, int b, int c) {
        return invokeMethod("slopeMathIsOnLine", new Class[] { int.class,
             int.class, int.class, int.class, int.class }, x, y, a, b, c);
    }

    public int bagApples(double targetWeight, double allowedVariation,
            double[] appleWeights) {
        return invokeMethod("bagApples", new Class[] { double.class,
             double.class, double[].class }, targetWeight, allowedVariation,
              appleWeights);
    }

    public int getCheck(int num){
        return invokeMethod("getCheck", new Class[] { int.class }, num);
    }
    
    public int getNumberOfDigits(int num){
        return invokeMethod("getNumberOfDigits", new Class[] { int.class }, num);
    }

    public int getDigit(int num, int n){
        return invokeMethod("getDigit", new Class[] { int.class, int.class }, num, n);
    }

    public boolean isValid(int numWithCheckDigit){
        return invokeMethod("isValid", new Class[] { int.class }, numWithCheckDigit);
    }

    public int hailstoneLength(int n) {
        return invokeMethod("hailstoneLength", new Class[] { int.class }, n);
    }

    public boolean isLongSeq(int n) {
        return invokeMethod("isLongSeq", new Class[] { int.class }, n);
    }

    public double propLong(int n) {
        return invokeMethod("propLong", new Class[] { int.class }, n);
    }

    public boolean isPrimeNumber(int num) {
        return invokeMethod("isPrimeNumber", new Class[] { int.class }, num);
    }

    public double propOfPrimes(int start, int end) {
        return invokeMethod("propOfPrimes", new Class[] { int.class, int.class }, start, end);
    }

    public boolean isSquare(int num) {
        return invokeMethod("isSquare", new Class[] { int.class }, num);
    }

    public boolean isCube(int num) {
        return invokeMethod("isCube", new Class[] { int.class }, num);
    }

    public double ratioOfCubeSumsToSquareSums(int start, int end) {
        return invokeMethod("ratioOfCubeSumsToSquareSums", new Class[] { int.class, int.class }, start, end);
    }
}
