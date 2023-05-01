package lab2;

import lab2.logariphmic.LnCalculator;
import lab2.logariphmic.LogBaseCalculator;
import lab2.trigonometric.*;

public class Function extends Calculator {
    private final SinCalculator sin;
    private final CosecCalculator cosec;
    private final CotCalculator cot;
    private final LnCalculator ln;
    private final LogBaseCalculator log3;
    private final LogBaseCalculator log10;
    private final CosCalculator cos;

    public Function(double accuracy, SinCalculator sin, CosecCalculator cosec,
                    CotCalculator cot, LnCalculator ln, CosCalculator cos,
                    LogBaseCalculator log3, LogBaseCalculator log10) {
        super(accuracy);
        this.sin = sin;
        this.cosec = cosec;
        this.cot = cot;
        this.ln = ln;
        this.log3 = log3;
        this.log10 = log10;
        this.cos = cos;
    }

    public double calculate(double x) {
        if (x <= 0)
            return Math.pow(((Math.pow(((Math.pow((cos.calculate(x)+ cot.calculate(x)), 2)) - (((cot.calculate(x) * cosec.calculate(x))))), 3))), 2);

        else
            return (((((log3.calculate(x) * ln.calculate(x)) + ln.calculate(x)) * (log3.calculate(x) / log10.calculate(x) / log3.calculate(x)))
                    - ((ln.calculate(x) * log3.calculate(x)) + (log10.calculate(x) + log3.calculate(x))))
                    / (ln.calculate(x) * ((ln.calculate(x) * ln.calculate(x)) - ln.calculate(x))));
    }

}
