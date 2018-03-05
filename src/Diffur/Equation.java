package Diffur;

import java.util.ArrayList;
import java.util.List;

public class Equation {
    List<Double> coordinates = new ArrayList<>();
    PendulumTest r = new PendulumTest(2);
    public Equation(int dimm)
    {

    }
    public void SetInit()
    {
        double y[] = {1,-1};
        double t0 = 0;
        r.SetInit(y,t0);
    }
    public void Solve()
    {
        while (r.T < 10) {
            r.NextStep(0.1);
            coordinates.add(r.y[0]);
        }
    }
}
