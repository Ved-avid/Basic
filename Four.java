import java.util.*;

public class Four{
    static public void main(String[] args){
        double BS = 9600;
        double DA = 0.2*BS;
        double HRA = 0.1*BS;
        double CTA = 0.12*BS;
        double salary = BS+DA+HRA+CTA;
        System.out.println("Gross Salary -> "+salary);
    }
}