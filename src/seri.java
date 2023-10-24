import java.util.Scanner;
public class seri {
    public static void main(String[] args) {
        Scanner tuba = new Scanner(System.in);
        System.out.print("sayıyı giriniz:");
        int n = tuba.nextInt();
        double result = 0.0 ;

        for (double i = 1; i <= n; i++){
            result += (1/i);

        }
        System.out.print(result);
    }
}
