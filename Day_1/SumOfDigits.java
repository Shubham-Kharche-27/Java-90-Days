//Sum of digits in a number
import java.util.*;
class SumOfDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number::");
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
            int temp=num%10;
            sum+=temp;
            num/=10;
        }
        System.out.println("Sum is "+sum);
    }
}