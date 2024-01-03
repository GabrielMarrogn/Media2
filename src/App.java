import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       double a = sc.nextDouble() *2 ;
       double b = sc.nextDouble() *3;
       double c = sc.nextDouble() *5;
       double calculo = (a+b+c)/10;
       DecimalFormat media = new DecimalFormat("0.0");

       System.out.println("MEDIA = "+media.format(calculo));
       sc.close();
       
    }
}
