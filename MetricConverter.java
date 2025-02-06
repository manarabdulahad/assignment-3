import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to metric converter!");
        System.out.println("Please input your query. For example, '1 kg = lb'.");
        System.out.println("Enter 'exit' or '-1' to exit the program.");

        while (true) {
            System.out.print("Enter your query: ");
            String input = scanner.nextLine();

            // Exit condition
            if (input.equals("exit") || input.equals("-1")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            // Handle different metric conversions
            if (input.contains("kg") && input.contains("lb")) {
                try {
                    double value = Double.parseDouble(input.split(" ")[0]);
                    double result = value * 2.20462;
                    System.out.println(value + " kg = " + result + " lb");
                } catch (Exception e) {
                    System.out.println("Invalid input format, please try again.");
                }
            } else if (input.contains("g") && input.contains("oz")) {
                try {
                    double value = Double.parseDouble(input.split(" ")[0]);
                    double result = value * 0.035274;
                    System.out.println(value + " g = " + result + " oz");
                } catch (Exception e) {
                    System.out.println("Invalid input format, please try again.");
                }
            } else if (input.contains("km") && input.contains("mile")) {
                try {
                    double value = Double.parseDouble(input.split(" ")[0]);
                    double result = value * 0.621371;
                    System.out.println(value + " km = " + result + " miles");
                } catch (Exception e) {
                    System.out.println("Invalid input format, please try again.");
                }
            } else if (input.contains("mm") && input.contains("inch")) {
                try {
                    double value = Double.parseDouble(input.split(" ")[0]);
                    double result = value * 0.0393701;
                    System.out.println(value + " mm = " + result + " inches");
                } catch (Exception e) {
                    System.out.println("Invalid input format, please try again.");
                }
            } else {
                System.out.println("Your input is not currently handled by this app, please input another query.");
            }
        }

        scanner.close();
    }
}