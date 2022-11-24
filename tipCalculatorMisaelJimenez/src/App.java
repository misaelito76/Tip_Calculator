import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter the subtotal :");
        try (Scanner input = new Scanner(System.in)) {
            double subtotal = input.nextDouble();
            System.out.print("Enter the gratuity rate :");
            double gratuity = input.nextDouble();
            double finalGratuity = (subtotal * gratuity) / 100;
            double total=subtotal+finalGratuity;
            System.out.println("The gratuity is $" + (double) finalGratuity + " " + "and total is $" + (double) total);
        }
    }
}
