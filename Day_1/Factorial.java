//Find the factorial of a number using loop

import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number::");
        int num=sc.nextInt();
        int temp=1;
        for(int i=num;i>0;i--){
            temp*=i;
        }
        System.out.println("Factorial is "+ temp);
    }
}