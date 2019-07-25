import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s", pi);

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scan.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");
    }
}

