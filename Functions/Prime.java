import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = false;
        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                isPrime = true;
            }
        }
        if (!isPrime) {
            System.out.println(n + " is Prime");
        }
        else{
            System.out.println(n + " is Not Prime");
        }
    }
}