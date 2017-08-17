package skill.test;

import java.util.*;

public class FactorialGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(factorial(n));
    }//main
    
    public static int factorial(int n) {
        if(n <= 1) return 1;
        return n * factorial(n-1);
    }//factorial
}//FactorialGenerator