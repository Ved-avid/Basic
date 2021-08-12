import java.io.*;
import java.util.*;
public class Test {
    static public void main(String[] args){
        Square s = new Square();
        Cube c = new Cube();
        s.start();
        try{
            s.join();
        }
        catch(InterruptedException e){}
        c.start();
    }
}

class Square extends Thread{

    public void run(){
        try{
            FileWriter f = new FileWriter("square.txt");
            for(int i = 1;i<2000;i++){
                f.write("Square of "+i+" -----> "+(i*i)+"\n");
            }
            f.close();
        }catch(IOException e){

        }
    }
}

class Cube extends Thread{
    public void run(){
        try{
            FileWriter f = new FileWriter("cube.txt");
            for(int i = 1;i<500;i++){
                f.write("Cube of "+i+" -----> "+(i*i*i)+"\n");
            }
            f.close();
        }catch(IOException e){

        }
    }
}
