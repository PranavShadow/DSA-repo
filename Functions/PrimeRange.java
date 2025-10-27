package Functions;

import java.util.Scanner;

public class PrimeRange {

    public static boolean isPrime(int n){
        if (n <= 1) return false;
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if ((n%i==0)) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n){
        for (int i = 1; i <=n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            } 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        primeInRange(sc.nextInt());
        sc.close();
    }
}
