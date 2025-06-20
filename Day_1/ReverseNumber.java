//Reverse a number

import java.util.Scanner;
class ReverseNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number::");
        int num=sc.nextInt();
        int reverseNumber=0;
        while(num!=0){
            int digit=num%10;
            reverseNumber=reverseNumber*10+digit;
            num/=10;
        }
        System.out.println("The Reverse Number::"+reverseNumber);
    }
}