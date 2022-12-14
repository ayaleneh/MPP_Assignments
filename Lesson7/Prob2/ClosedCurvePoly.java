package MPP.Prob2;

public interface ClosedCurvePoly extends ClosedCurve{

    @Override
    public default double computePerimeter() {
        double v = 0;
        for (double length : getLengths()) {
            v = length + v;
        }
        return v;
    }
    public double[]getLengths();
}
