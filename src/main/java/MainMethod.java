import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();

        Model model = new Model();
        model.setFirstNumber(firstNumber);
        model.setSecondNumber(secondNumber);

        Calculation calculation = new Calculation();

        System.out.println("Addition Result = " + calculation.add(model.getFirstNumber(), model.getSecondNumber()));
        System.out.println("Subtraction Result = " + calculation.subtract(model.getFirstNumber(), model.getSecondNumber()));
        System.out.println("Multiplication Result = " + calculation.multiply(model.getFirstNumber(), model.getSecondNumber()));
        System.out.println("Division Result = " + calculation.divide(model.getFirstNumber(), model.getSecondNumber()));
    }
}
