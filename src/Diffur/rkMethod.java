package Diffur;

public abstract class rkMethod {
    int h;// размерность
    double yy[];
    double y[];

    double k1[];
    double k2[];
    double k3[];
    double k4[];


    public double T;
    public double[] fy;
    public rkMethod(int N){
        this.h = N;
        InitArrays(N);
    }

    protected rkMethod() {
    }

    private void InitArrays(int N) {
        k1 = new double[N];
        k2 = new double[N];
        k3 = new double[N];
        k4 = new double[N];
        yy = new double[N];
        y = new double[N];
    }

    public void SetInit(double y0[],double t0){
        this.T = t0;
        for (int i = 0;i<y.length;i++)
            y[i] = y0[i];

    }
    abstract double[] F(double y[],double t);
    public void NextStep(double dt){
        int i;
        k1 = F(y,T);
        for (i = 0; i < y.length; i++)
            yy[i] = y[i] + k1[i] * (dt / 2.0);


        k2 = F(yy,T+dt/2.0);

        for (i = 0; i <  y.length; i++)
            yy[i] = y[i] + k2[i] * (dt / 2.0);

        k3 = F(yy,T+dt/2.0);

        for (i = 0; i <  y.length; i++)
            yy[i] = y[i] + k3[i] * (dt / 2.0);


        k4 = F(yy,T+dt);


        for (i = 0; i < y.length; i++)
            y[i] = y[i] + dt / 6.0 * (k1[i] + 2.0 * k2[i] + 2.0 * k3[i] + k4[i]);

        // рассчитать текущее время
        T+= dt;

    }



}
