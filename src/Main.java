import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] userList = new int[20];
        int numElements = s.nextInt();

        for(int i = 0; i < numElements; i++) {
            userList[i] = s.nextInt();

        }

        for(int i = numElements - 1; i >= 0; i--) {
            System.out.print(userList[i] + ",");
        }




        // Add more variables as needed


        /* Type your code here. */
    }
}