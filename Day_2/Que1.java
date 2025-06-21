//Create a class Person with name and age as private fields. Use getter and setter methods to access them. (→ Encapsulation) 

class Que1{
    public static void main(String[] args) {
        Person person = new Person();
        person.setter("Shubham", 21);
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }
}

class Person{
    private String name;
    private int age;
    public void setter(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}