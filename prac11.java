import java.util.*;

public class prac11{
    public static void main(String[] args){
        long n;

        System.out.println("Enter Pounds to convert in Rupees: ");
        Scanner a= new Scanner(System.in);
        n=a.nextLong();

        System.out.println("USING USER INPUT : ");
        convert(n);

        System.out.println("USING COMMAND LINE ARGUEMENT : ");
        convert(50);
    }

    static void convert(long n){
        long a;
        a=n;

        long r = n * 100;
        System.out.println(r+" Rupees");
    }
}
