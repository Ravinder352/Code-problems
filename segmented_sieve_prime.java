import java.util.*;
public class segmented_sieve_prime{
    public static void main(String[] args){
        //segmented sieve - to find all prime numbers between two given positive numbers
        int l,h;
        System.out.println("Enter the range (k,l) as k l : ");
        Scanner sc = new Scanner(System.in);
        l=sc.nextInt();
        h=sc.nextInt();

        primes_seg(l,h);
        sc.close();

    }
    private static void primes_seg(int a,int b){
        boolean prime[]=new boolean[b+1];
        Arrays.fill(prime,true);
        if(a<=1) a=2;

        for(int i=2;i*i<=b;i++){
            // int k=(a/i)*i;
            // if(k<a) k+=i;
            int k=Math.max(i*i,(a+i-1)/i*i);// change is here and remaining everything is same
            for(int j=k;j<=b;j+=i){
                if(prime[j]) prime[j]=false;
            }
        }
        System.out.printf("The prime numbers between %d and %d are ",a,b);
        for(int i=a;i<=b;i++){
            if(prime[i]) System.out.print(i+" ");
        }
    }
}