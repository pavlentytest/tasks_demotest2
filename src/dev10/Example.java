package dev10;

class Father {
    public String name = "Father name";
    public void car() {
        System.out.println("Father Car");
    }
}

class Child extends Father {
    public String name = "Child name";
    public void car() {
        System.out.println("Child Car");
    }
}

public class Example {
    public static void main(String[] args) {
       // Child son = new Child();
       // son.car();
        Father son2 = new Child();
        son2.car();
        System.out.println(son2.name);
    }
}