import java.util.*;

public class Two{
    static public void main(String[] args){
        int l = 479325;
        int km = l/100000;
        int m = (l%100000)/100;
        int cm = (l%100000)%100;
        System.out.println(l+" cm is equivalent to "+km+" km "+m+" m "+cm+" cm");
    }
}