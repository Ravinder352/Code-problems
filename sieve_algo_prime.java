import java.util.*;
public class sieve_algo_prime{
    public static void main(String[] args){
        //Sieve algorith for prime numbers
        int a,j;
        System.out.println("Enter a number to print all the prime numbers from 0 to the number :");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();

        boolean ref[] = new boolean[a+1];
        for(int i=2;i<=a;i++){
            ref[i]=true;
        }
        for(int i=2;i<=a;i++){
            if(ref[i]=true){
                j=i*i;
                while(j<=a){
                    if(ref[j]) ref[j]=false;
                    j+=i;
                 }
            // for(int j=i*i;i<a;j=j+i){
            //     if(j%i==0){
            //         if(ref[j]) ref[j]=false;
            //     }
            // }
            }
        }
        System.out.printf("The prime numbers from 0 to %d are ",a);
        for(int i=0;i<=a;i++){
            if(ref[i]) System.out.print(i+" ");
        }
    }
}