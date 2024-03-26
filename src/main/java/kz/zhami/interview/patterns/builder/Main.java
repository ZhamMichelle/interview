package kz.zhami.interview.patterns.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder().setName("OKR").build();
        System.out.println(person.getName());
    }
}
