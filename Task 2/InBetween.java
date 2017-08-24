/**
 * Created by jc428352 on 25/08/17.
 */
import java.util.Scanner;
public class InBetween {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if ((num2 - num1) <=1){
            System.out.println("Error nothing in between");
        }
        else
            for(int i = num1 + 1; i<num2; i++){
                System.out.println(i + " ");
            }
    }
}
