import java.util.Scanner;

public class Calculator_Loop {

    public static void main(String[] args) {                  // main() → entry point (program starts here)           // {} → block where code will run


        Scanner sc = new Scanner(System.in);                              // input from keyboard         sc = object (tool to read input)


        while (true) {                                       // Infinite loop
            
            System.out.println("Enter first number: ");
            double num1 = sc.nextDouble();                                        // Takes integer input from user                            

            System.out.println("Enter second number: ");
            double num2 = sc.nextDouble();
            // System.out.println("You entered numbers: " + num1 + " and " + num2);              // Prints output on screen

            System.out.println("Enter operation (+, -, *, /): ");
            char op = sc.next().charAt(0);                          // sc.next() → takes input as String   // .charAt(0) → takes first character

            System.out.println("You entered: " + num1 + " " + op + " " + num2);              // Prints output on screen


            double result = 0;

            if (op == '+') {
                result = num1 + num2;
            }
            else if (op == '-') {
                result = num1 - num2;
            }
            else if (op == '*') {
                result = num1 * num2;
            }
            else if (op == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero!");
                    return;
                }
            } else {
                System.out.println("Invalid operator!");
                continue;                                                 // Skip current iteration, go to next loop
            }


            System.out.println("Result: " + result);



            // Ask user to continue
            System.out.println("Do you want to continue: (yes/no): ");
            String choice = sc.next();

            if(choice.equalsIgnoreCase("no")) {              // Compares string ignoring case 👉 YES, yes, Yes all same
                break;                                                    // Exit loop completely
            }

        }


        System.out.println("Calculator closed.");


    }

}
