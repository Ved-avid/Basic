import java.util.*;

class Three{
    static public void main(String[] args){
        double p = 10000;
        double r = 0.02;
        double t = 2;
        double SI = simpleInterest(p,r,t);
        double A = amount(p,SI);
        System.out.println("Amount -> "+A+" Simple Interest ->"+SI);
    }
    static double simpleInterest(double p,double r,double t){
        return p*r*t;
    }
    static double amount(double p, double si){
        return (p+si);
    }
}