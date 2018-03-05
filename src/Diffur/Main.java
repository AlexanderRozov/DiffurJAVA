package Diffur;

import javax.print.DocFlavor;

public class Main {

    public static void main(String[] args) {
	System.out.println("Test");
	int a  = 5;
	Equation e = new Equation(2);
	e.SetInit();
	e.Solve();
	for(int i = 0;i<e.coordinates.size();i++)
        System.out.println("x = " + e.coordinates.get(i).toString());
    }
}
