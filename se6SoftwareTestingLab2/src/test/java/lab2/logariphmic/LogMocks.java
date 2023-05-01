package lab2.logariphmic;

import lab2.MockChain;

import static java.lang.Double.*;
import static java.lang.Math.PI;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LogMocks {
    public static LnCalculator getLnMock() {
        LnCalculator m = mock(LnCalculator.class);

        MockChain.when(m)
                .mock(1 * PI / 6, -0.6470295833786549)
                .mock(1 * PI / 4, -0.2415644752704905)
                .mock(2 * PI / 3, 0.7392647777412357)
                .mock(3 * PI / 4, 0.8570478133976193)
                .mock(5 * PI / 6, 0.9624083290554456)
                .mock(7 * PI / 6, 1.2988805656766584)
                .mock(5 * PI / 4, 1.3678734371636099)
                .mock(4 * PI / 3, 1.432411958301181)
                .mock(5 * PI / 3, 1.6555555096153909)
                .mock(7 * PI / 4, 1.7043456737848228)
                .mock(11 * PI / 6, 1.7508656894197157)
                .mock(-PI / 4, NaN)
                .mock(-PI / 2, NaN)
                .mock(-3 * PI / 4, NaN)
                .mock(-PI, NaN)
                .mock(-5 * PI / 4, NaN)
                .mock(-7 * PI / 4, NaN)
                .mock(-4 * PI / 3, NaN)
                .mock(-2 * PI, NaN)
                .mock(PI / 8, -0.93471165583043575411)
                .mock(3 * PI / 16, -0.5292465477222714)
                .mock(PI / 3, 0.0461175971812904827)
                .mock(PI / 2, 0.4515827052894548647)
                .mock(PI, 1.1447298858494001741)
                .mock(2 * PI, 1.83787706640934548356)
                .mock(3 * PI, 2.2433421745175099)
                .mock(2, 0.6931471805599453094)
                .mock(3, 1.0986122886681096914)
                .mock(5, 1.6094379124341003746)
        ;

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static LogBaseCalculator getLog3Mock() {
        LogBaseCalculator m = mock(LogBaseCalculator.class);

        MockChain.when(m)
                .mock(PI / 8, -0.850811214722186)
                .mock(3 * PI / 16, -0.481740968293644)
                .mock(PI / 3, 0.041978045992186)
                .mock(PI / 2, 0.411048292420728)
                .mock(PI, 1.041978045992186)
                .mock(2 * PI, 1.672907799563643)
                .mock(3 * PI, 2.041978045992186)
        ;

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static LogBaseCalculator getLog10Mock() {
        LogBaseCalculator m = mock(LogBaseCalculator.class);

        MockChain.when(m)
                .mock(PI / 8, -0.40594011429780974)
                .mock(3 * PI / 16, -0.229848855242128)
                .mock(PI / 3, 0.020028617974471417056)
                .mock(PI / 2, 0.1961198770301526591)
                .mock(PI, 0.49714987269413)
                .mock(2 * PI, 0.798179868358115)
                .mock(3 * PI, 0.974271127413796)
        ;

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }
}
