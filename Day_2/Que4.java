//Create an abstract class Shape with an abstract method area() and concrete method display(). Extend it in Circle and Rectangle. 

class Que4{
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle=new Rectangle();
        circle.area(5);
        rectangle.area(5,4);
        System.out.println(circle.display());
        System.out.println(rectangle.display());
    }
}

abstract class Shape{
    abstract void area();
    abstract double display();
}

class Circle extends Shape{
    private double area;
    public void area(double radius){
        area=3.14*radius*radius;
    }
    public double display(){
        return area;
    }
    public void area(){

    }
}

class Rectangle extends Shape{
    private double area;
    public void area(double length,double breath){
        area=length*breath;
    }
    public double display(){
        return area;
    }
    public void area(){
        
    }
}