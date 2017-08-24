/**
 * Created by jc428352 on 25/08/17.
 */
public class Factorials {
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        else return (n*factorial(n-1));
    }

    public static void main(String[] args) {
       for (int i=10; i>0; i--){
           int fact = factorial(i);
           System.out.println("Factorial of " + i + " is " + fact);
       }

    }
}


