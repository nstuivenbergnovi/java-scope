package nl.novi.javaprogrammeren.one;

public class MainOne {

    public static void main(String[] args) {

        Person sjaak = new Person("Nick");
        System.out.println(sjaak.getAge());
        sjaak.ageOneYear();
        System.out.println(sjaak.getAge());
    }
}
