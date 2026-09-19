import java.util.Scanner;

public class IT26102214Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];

        int i = 0;
        while (i < 6) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int value = input.nextInt();

            if (value <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numbers[i] = value;
                i++;
            }
        }

        System.out.println("Array Contents:");
        int max = numbers[0];
        for (int n : numbers) {
            System.out.print(n + " ");
            if (n > max) {
                max = n;
            }
        }

        System.out.println();
        System.out.println("The Maximum Number Entered: " + max);
        
    }
}