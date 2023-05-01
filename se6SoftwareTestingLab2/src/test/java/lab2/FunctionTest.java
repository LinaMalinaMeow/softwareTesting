package lab2;

import lab2.logariphmic.LnCalculator;
import lab2.logariphmic.LogBaseCalculator;
import lab2.logariphmic.LogMocks;
import lab2.trigonometric.*;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value = PER_CLASS)
public class FunctionTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.00001;

    private final SinCalculator sinMock = TrigonometryMocks.getSinMock();
    private final CosCalculator cosMock = TrigonometryMocks.getCosMock();
    private final CosecCalculator cosecMock = TrigonometryMocks.getCosecMock();
    private final CotCalculator cotMock = TrigonometryMocks.getCotMock();
    private final LnCalculator lnMock = LogMocks.getLnMock();
    private final LogBaseCalculator log3Mock = LogMocks.getLog3Mock();
    private final LogBaseCalculator log10Mock = LogMocks.getLog10Mock();
    private final SinCalculator sin = new SinCalculator(ACCURACY);
    private final CosCalculator cos = new CosCalculator(ACCURACY, sin);
    private final CosecCalculator cosec = new CosecCalculator(ACCURACY, sin);
    private final CotCalculator cot = new CotCalculator(ACCURACY, sin, cos);
    private final LnCalculator ln = new LnCalculator(ACCURACY);
    private final LogBaseCalculator log3 = new LogBaseCalculator(ACCURACY, 3, ln);
    private final LogBaseCalculator log10 = new LogBaseCalculator(ACCURACY, 10, ln);

    private Function function;


    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void allMockTest(double expected, double num, double den) {
        function = new Function(ACCURACY,
                sinMock, cosecMock, cotMock, lnMock, cosMock, log3Mock, log10Mock
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void sinStubTest(double expected, double num, double den) {
        function = new Function(ACCURACY,
                sin, cosecMock, cotMock, lnMock, cosMock, log3Mock, log10Mock
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void cosecStubTest(double expected, double num, double den) {
        function = new Function(ACCURACY,
                sinMock, cosec, cotMock, lnMock, cosMock, log3Mock, log10Mock
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void cotStubTest(double expected, double num, double den) {
        function = new Function(ACCURACY,
                sinMock, cosecMock, cot, lnMock, cosMock, log3Mock, log10Mock
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void lnStubTest(double expected, double num, double den) {
        function = new Function(ACCURACY,
                sinMock, cosecMock, cotMock, ln, cosMock, log3Mock, log10Mock
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void cosStubTest(double expected, double num, double den) {
        function = new Function(ACCURACY,
                sinMock, cosecMock, cotMock, lnMock, cos, log3Mock, log10Mock
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void log3StubTest(double expected, double num, double den) {
        function = new Function(ACCURACY,
                sinMock, cosecMock, cotMock, lnMock, cosMock, log3, log10Mock
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void log10StubTest(double expected, double num, double den) {
        function = new Function(ACCURACY,
                sinMock, cosecMock, cotMock, lnMock, cosMock, log3Mock, log10
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void allStubTest(double expected, double num, double den) {
        function = new Function(ACCURACY,
                sin, cosec, cot, ln, cos, log3, log10
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }
}
