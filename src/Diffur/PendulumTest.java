package Diffur;


public class PendulumTest extends rkMethod {



    public PendulumTest(int Dimension)
    {

    }

    public PendulumTest() {

    }

    public void IterationStart(){

        //while ()
    }
    @Override
   public double[] F(double[] y, double t) {

        fy[0] = y[1];
        fy[1] = -y[0];
        return fy;
    }
}
