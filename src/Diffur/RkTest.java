package Diffur;

public class RkTest extends rkMethod {

    RkTest(int N)
    {

    }
    public void IterationStart(){

        //while ()
    }
    @Override
    double[] F(double[] y, double t) {

        fy[0] = y[1];
        fy[1] = y[0];
        return fy;
    }
}
