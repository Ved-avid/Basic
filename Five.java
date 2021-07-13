import java.util.*;

public class Five{
    static public void main(String[] args){
        int cp = 3100;
        int sp = 2870;
        int loss = (cp-sp);
        double lossCent = (loss*100)/cp;
        System.out.println("Loss -> "+loss+" Loss PerCent ->"+lossCent);
    }
}