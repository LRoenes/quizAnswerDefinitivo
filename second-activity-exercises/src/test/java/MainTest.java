import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import utils.Main;

public class MainTest {
    @Test
    @Tag("task:1")
    @DisplayName("Implemented the analyzeInts method")
    public void implemented_expected_analyzeInts() {
        assertThat(
            new Main()
            .analyzeInts(
                10, 8, new int [] {6, -3, 5, 0, 12, 3, 3, 9}))
                .isEqualTo(0.5);
        assertThat(
            new Main()
            .analyzeInts(
                28, 12, new int [] {6, -3, 5, 0, 12, 3, 3, 9, 10, 9, 6, 25}))
                .isEqualTo(7.0/12.0);
        assertThat(
            new Main()
            .analyzeInts(
                6, 12, new int [] {6, -3, 5, 0, 12, 3, 3, 9, 10, 9, 6, 25}))
                .isEqualTo(2.0/12.0);
    }

    @Test
    @Tag("task:2")
    @DisplayName("Implemented the getSlope method")
    public void implemented_expected_getSlope() {
        assertThat(
            new Main()
            .slopeMathGetSlope(5, 4))
                .isEqualTo(5.0/4.0);
        assertThat(
            new Main()
            .slopeMathGetSlope(2, 4))
                .isEqualTo(2.0/4.0);
        assertThat(
            new Main()
            .slopeMathGetSlope(-2, 4))
                .isEqualTo(-2.0/4.0);
    }

    @Test
    @Tag("task:2")
    @DisplayName("Implemented the isOnLine method")
    public void implemented_expected_isOnLine() {
        assertThat(
            new Main()
            .slopeMathIsOnLine(5, -2, 5, 4, -17))
                .isEqualTo(true);
        assertThat(
            new Main()
            .slopeMathIsOnLine(5, -2, -25, 40, 30))
                .isEqualTo(false);
    }

    @Test
    @Tag("task:3")
    @DisplayName("Implemented the bagApples method")
    public void implemented_expected_bagApples() {
        assertThat(
            new Main()
            .bagApples(
                10.0, 0.5, new double [] {6.0, 3.0, 5.0, 0.4, 12.0, 3.0, 3.0, 9.0}))
                .isEqualTo(2);
        assertThat(
            new Main()
            .bagApples(
                28.0, 1.2, new double [] {6.0, 3.0, 5.0, 0.2, 12.0, 3.0, 3.0, 9.0, 10.0, 9.0, 6.0, 25.0}))
                .isEqualTo(5);
        assertThat(
            new Main()
            .bagApples(
                6.0, 12.0, new double [] {6.0, 0.03, 5.0, 0.2, 12.0, 3.0, 3.0, 9.0, 10.0, 9.0, 6.0, 25.0}))
                .isEqualTo(0);
        assertThat(
            new Main()
            .bagApples(
                42.0, 12.0, new double [] {6.0, 0.03, 5.0, 0.2, 12.0, 3.0, 3.0, 9.0, 10.0, 9.0, 6.0, 25.0}))
                .isEqualTo(7);
    }

    @Test
    @Tag("task:4")
    @DisplayName("Implemented the getCheck method")
    public void implemented_expected_getCheck() {
        assertThat(
            new Main()
            .getCheck(159))
                .isEqualTo(2);
        assertThat(
            new Main()
            .getCheck(283415))
                .isEqualTo(6);
        assertThat(
            new Main()
            .getCheck(28341))
                .isEqualTo(6);
        assertThat(
            new Main()
            .getCheck(123123))
                .isEqualTo(0);
        assertThat(
            new Main()
            .getCheck(2415))
                .isEqualTo(3);
    }

    @Test
    @Tag("task:4")
    @DisplayName("Implemented the getNumberOfDigits method")
    public void implemented_expected_getNumberOfDigits() {
        assertThat(
            new Main()
            .getNumberOfDigits(159))
                .isEqualTo(3);
        assertThat(
            new Main()
            .getNumberOfDigits(12324))
                .isEqualTo(5);
        assertThat(
            new Main()
            .getNumberOfDigits(1000))
                .isEqualTo(4);
        assertThat(
            new Main()
            .getNumberOfDigits(1))
                .isEqualTo(1);
        assertThat(
            new Main()
            .getNumberOfDigits(14))
                .isEqualTo(2);
        assertThat(
            new Main()
            .getNumberOfDigits(123323))
                .isEqualTo(6);
    }

    @Test
    @Tag("task:4")
    @DisplayName("Implemented the getDigit method")
    public void implemented_expected_getDigit() {
        // Test with a positive number
        assertThat(
                new Main()
                        .getDigit(159, 1))
                .isEqualTo(1);
        assertThat(
                new Main()
                        .getDigit(159, 2))
                .isEqualTo(5);
        assertThat(
                new Main()
                        .getDigit(159, 3))
                .isEqualTo(9);

        // Test with a single-digit number
        assertThat(
                new Main()
                        .getDigit(7, 1))
                .isEqualTo(7);

        // Test with a multi-digit number
        assertThat(
                new Main()
                        .getDigit(987654321, 1))
                .isEqualTo(9);
        assertThat(
                new Main()
                        .getDigit(987654321, 9))
                .isEqualTo(1);
        assertThat(
                new Main()
                        .getDigit(987654321, 5))
                .isEqualTo(5);

        assertThat(
                new Main()
                        .getDigit(159, 3))
                .isEqualTo(9);

        // Test with the last digit
        assertThat(
                new Main()
                        .getDigit(123456, 6))
                .isEqualTo(6);

        // Test with the first digit of a larger number
        assertThat(
                new Main()
                        .getDigit(1020302, 1))
                .isEqualTo(1);

        // Test with zero
        assertThat(
                new Main()
                        .getDigit(0, 1))
                .isEqualTo(0);
    }

    @Test
    @Tag("task:4")
    @DisplayName("Implemented the isValid method")
    public void implemented_expected_isValid() {
        assertThat(
            new Main()
            .isValid(159))
                .isEqualTo(false);
        assertThat(
            new Main()
            .isValid(1952))
                .isEqualTo(false);
        assertThat(
            new Main()
            .isValid(1592))
                .isEqualTo(true);
        assertThat(
            new Main()
            .isValid(1953))
                .isEqualTo(false);
    }

    @Test
    @Tag("task:5")
    @DisplayName("Implemented the hailstoneLength method")
    public void implemented_expected_hailstoneLength() {
        assertThat(
                new Main()
                        .hailstoneLength(5))
                .isEqualTo(6);
        assertThat(
                new Main()
                        .hailstoneLength(8))
                .isEqualTo(4);
    }

    @Test
    @Tag("task:5")
    @DisplayName("Implemented the isLongSeq method")
    public void implemented_expected_isLongSeq() {
        assertThat(
                new Main()
                        .isLongSeq(5))
                .isEqualTo(true);
        assertThat(
                new Main()
                        .isLongSeq(8))
                .isEqualTo(false);
    }

    @Test
    @Tag("task:5")
    @DisplayName("Implemented the propLong method")
    public void implemented_expected_propLong() {
        assertThat(
                new Main()
                        .propLong(10))
                .isEqualTo(0.5);
        assertThat(
                new Main()
                        .propLong(5))
                .isEqualTo(0.4);
        assertThat(
                new Main()
                        .propLong(100))
                .isEqualTo(0.26);
    }

    @Test
    @Tag("task:6")
    @DisplayName("Implemented the isPrimeNumber method")
    public void implemented_expected_isPrimeNumber() {
        assertThat(
                new Main()
                        .isPrimeNumber(10))
                .isEqualTo(false);
        assertThat(
                new Main()
                        .isPrimeNumber(11))
                .isEqualTo(true);
        assertThat(
                new Main()
                        .isPrimeNumber(7))
                .isEqualTo(true);
        assertThat(
                new Main()
                        .isPrimeNumber(2))
                .isEqualTo(true);
        assertThat(
                new Main()
                        .isPrimeNumber(8))
                .isEqualTo(false);
        assertThat(
                new Main()
                        .isPrimeNumber(1))
                .isEqualTo(false);
    }

    @Test
    @Tag("task:6")
    @DisplayName("Implemented the propOfPrimes method")
    public void implemented_expected_propOfPrimes() {
        assertThat(
            new Main().propOfPrimes(5, 14)
        ).isEqualTo(0.4d);
        assertThat(
            new Main().propOfPrimes(1, 14)
        ).isCloseTo(0.428, within(0.005));
        assertThat(
            new Main().propOfPrimes(25, 40)
        ).isCloseTo(0.1875, within(0.005));
    }

    @Test
    @Tag("task:7")
    @DisplayName("Implemented the isSquare method")
    public void implemented_expected_isSquare() {
        assertThat(
            new Main().isSquare(5)
        ).isEqualTo(false);
        assertThat(
            new Main().isSquare(4)
        ).isEqualTo(true);
        assertThat(
            new Main().isSquare(16)
        ).isEqualTo(true);
        assertThat(
            new Main().isSquare(14)
        ).isEqualTo(false);
        assertThat(
            new Main().isSquare(1)
        ).isEqualTo(true);
        assertThat(
            new Main().isSquare(0)
        ).isEqualTo(true);
    }

    @Test
    @Tag("task:7")
    @DisplayName("Implemented the isCube method")
    public void implemented_expected_isCube() {
        assertThat(
            new Main().isCube(5)
        ).isEqualTo(false);
        assertThat(
            new Main().isCube(1)
        ).isEqualTo(true);
        assertThat(
            new Main().isCube(0)
        ).isEqualTo(true);
        assertThat(
            new Main().isCube(27)
        ).isEqualTo(true);
    }

    @Test
    @Tag("task:7")
    @DisplayName("Implemented the ratioOfCubeSumsToSquareSums method")
    public void implemented_expected_ratioOfCubeSumsToSquareSums() {
        assertThat(
            new Main().ratioOfCubeSumsToSquareSums(5, 30)
        ).isEqualTo(0.7);
        assertThat(
            new Main().ratioOfCubeSumsToSquareSums(5, 100)
        ).isCloseTo(0.2605, within(0.005));
        assertThat(
            new Main().ratioOfCubeSumsToSquareSums(40, 100)
        ).isCloseTo(0.2176, within(0.005));
    }
}
