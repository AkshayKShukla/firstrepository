import java.util.Scanner;
import java.text.*;
import java.util.Locale;
public class LocaleCurrency {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat ob=NumberFormat.getInstance(Locale.CHINA);
        String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String india=NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
        String us=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
