package org.example;

import java.util.Arrays;
//задание 4.1.1
public class QuadraticTrinomial
{
    double[] x;

    public QuadraticTrinomial(double a, double b, double c)
    {
        double discriminant;
        if(a != 0)
        {
            discriminant = Math.sqrt((b * b) - (4 * a * c));

            if (discriminant >= 0)
            {
                if(discriminant > 0)
                {
                    x = new double[2];
                    x[0] = (-b - discriminant) / (2 * a);
                    x[1] = (-b + discriminant) / (2 * a);
                    //System.out.println("Roots of an equation: X1 = " + x1 + "X2 = " + x2);
                }
                else
                {
                    x = new double[1];
                    x[0] = -b / (2 * a);
                    //System.out.println("Root of an equation: X = " + x1);
                }
            }
            else
            {
                x = new double[0];
                //System.out.println("No roots. Discriminant < 0");
            }
        }
        else
        {
            if(b != 0)
            {
                x = new double[1];
                x[0] = (-c) / b;
                //System.out.println("Root of an equation: X = " + x1);
            }
            else
            {
                if(c != 0)
                {
                    x = new double[0];
                    //System.out.println("No roots. A and B = 0, C != 0");
                }
                else
                {
                    x = new double[1];
                    x[0] = 1.0 / 0.0;
                    //System.out.println("Any root is suitable. A, B, C = 0");
                }
            }
        }
    }

    public double[] getRoots()
    {
        return x;
    }

    @Override
    public String toString() {
        return "Корни уравнения: " + Arrays.toString(x);
    }
}
