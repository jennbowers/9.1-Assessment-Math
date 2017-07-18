import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Give me a number");
        Scanner scanner = new Scanner(System.in);
        String userFirstInput = scanner.nextLine();
        Double operand1 = Double.parseDouble(userFirstInput);

        System.out.println("Give me a second number");
        String userSecondInput = scanner.nextLine();
        Double operand2 = Double.parseDouble(userSecondInput);

        Double sum = operand1 + operand2;
        Double difference = operand1 - operand2;
        Double division = operand1 / operand2;
        Double multiplication = operand1 * operand2;
        Double remainder = operand1 % operand2;

        showResults(sum, difference, division, multiplication, remainder);

    }
    public static void showResults ( double sum, double difference, double division, double multiplication, double remainder) {
        System.out.println("The sum of your chosen numbers is " + sum);
        System.out.println("The difference between your chosen numbers is " + difference);
        System.out.println("The dividend of your chosen numbers is " + division);
        System.out.println("The product of your chosen numbers is " + multiplication);
        System.out.println("The remainder of your chosen numbers is " + remainder);

    }
}
