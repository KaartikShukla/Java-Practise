//import java.util.*;

public class Encapsulation{
    double x,y;
    double r;

    double circumfrence(){
        return 2*3.14*r;
    }

    double area(){
        return (22/7)*r*r;
    }

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        Encapsulation e = new Encapsulation();
        e.x = 0.0;
        e.y = 0.0;
        e.r = 5.0;
        
        System.out.println("Circumfrence ="+ e.circumfrence());
        System.out.println("Circumfrence ="+ e.area());

        //sc.close();
    }
}