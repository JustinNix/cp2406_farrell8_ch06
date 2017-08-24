/**
 * Created by jc428352 on 25/08/17.
 */
import java.util.Scanner;
public class EvenEntryLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an even number or 999 to stop the program");
        int num = input.nextInt();
        while (num != 999){
            if (num%2 == 0){
                System.out.println("Good Job! \n Enter another one: ");
            }
            else
                System.out.println("Error not an even number \n Try again ");
            num = input.nextInt();
        }
    }
}
