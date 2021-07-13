import java.util.*;

public class One{
    static public void main(String[] args){
        int a = 10, b= 5, c =2;
        int ans1 = exp1(a,b,c);
        int ans2 = exp2(a,b,c);
        
        System.out.println("Ans - 1  is "+ans1);
        System.out.println("Ans - 2  is "+ans2);
    }
    static int exp1(int a, int b,int c){
        return ((a+b)/2*a*b);
    }
    static int exp2(int a, int b,int c){
        return ((a*b+b*c+c*a)/(a+b+c));
    }
}