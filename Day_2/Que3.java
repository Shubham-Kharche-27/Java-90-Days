//Implement method overloading in a Calculator class with two add() methods – one for integers, one for doubles. (→ Compile-time Polymorphism) 

class Que3{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(10,20);
        calculator.add(10.25,15.30);
    }
}

class Calculator{
    public void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    public void add(double num1,double num2){
        System.out.println(num1+num2);
    }
}