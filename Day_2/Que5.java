//Write a program to demonstrate method overriding using Animal → Dog and call the method from both classes. (→ Runtime Polymorphism) 

class Que5{
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.canWalk();
        animal.canWalk();
        dog.bark();
    }
}

class Animal{
    public void canWalk(){
        System.out.println("Animal can Walk!");
    }
}

class Dog extends Animal{
    @Override
    public void canWalk(){
        System.out.println("Dog can walk!");
    }
    public void bark(){
        System.out.println("woof!");
    }
}