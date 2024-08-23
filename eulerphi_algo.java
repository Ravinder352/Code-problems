import java.util.*;

public class eulerphi_algo {
    private static int phi(int n) {
        int result=n;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                while(n%i==0){
                    n/=i;
                }
                result-= result / i;
            }
        }
        if(n>1){
            result-=result/n;
        }
        return result;
        // int result = n;
        // for (int p = 2; p * p <= n; p++) {
        //     // Check if p is a factor of n
        //     if (n % p == 0) {
        //         // Remove all factors of p from n
        //         while (n % p == 0) {
        //             n /= p;
        //         }
        //         // Apply the formula: result = result * (1 - 1/p)
        //         result -= result / p;
        //     }
        // }
        // // If n is greater than 1, then it is a prime number
        // // Apply the formula for the last prime factor
        // if (n > 1) {
        //     result -= result / n;
        // }
        // return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int phi_n = phi(n);
        System.out.println("phi(" + n + ") = " + phi_n);
        sc.close();
    }
}
