package GMB05_lab05;

import java.io.Serializable;
import static java.lang.Math.pow;

// Класс "Персона" с сериализацией для поддержки RMI
public class Solve implements Serializable {
    private static final long serialVersionUID = 1L;

    private double x;
    private double a;
    private double b;
    private double y;

    public Solve(double a, double b, double x) {
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
        if (x >= 8){
            y = (pow(a,2)+ 4 * pow(x,2) +b) / (a * b);
        }
        else{
            y = pow(a,2) - 2 * pow(x,2); 
        }
    }

    public double getX() {
        return x;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }


    public double getY() {
        return y;
    }
    
    

    @Override
    public String toString() {
        return String.format("Ответ = " + y);
    }

}
