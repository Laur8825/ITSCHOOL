package session10.practice.inheritance;

public class MultilevelInheritance {
}

class GrandParent{
    void dance(){
        System.out.println("Grandpa shout not dance");
    }
}

class Parent extends GrandParent{
    @Override
    void dance() {
        System.out.println("Parent can dance");
    }
}

class Child extends Parent{
    @Override
    void dance() {
        System.out.println("Child can dance too");
    }
}
