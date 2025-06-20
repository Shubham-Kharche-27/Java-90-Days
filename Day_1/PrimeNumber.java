//Check if a number is prime
import java.util.Scanner;
class PrimeNumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number::");
        int num=sc.nextInt();
        boolean isPrime=false;
        for(int i=1;i<num/2;i++){
            if(num%i==0){
                isPrime=true;
            }
        }
        if(isPrime){
            System.out.println("It is a Prime Number!");
        }
        else{
            System.out.println("It is not a Prime Number!");
        }
    }
}