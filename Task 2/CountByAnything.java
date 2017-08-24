import java.util.Scanner;
public class CountByAnything {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = 3, end = 301, count = 1;
        System.out.println("Enter number to increment: ");
        int increment = input.nextInt();
        for(int i= start; i < end; i += increment){
            System.out.print(i + " ");
            if(count%10 == 0){
                System.out.println();
            }
            count++;
        }
    }
}
