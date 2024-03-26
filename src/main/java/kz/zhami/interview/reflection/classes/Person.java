package kz.zhami.interview.reflection.classes;

public class Person {
    public String name;
    public int age;

//    public Person() {
//        this.age = 1;
//        this.name = "DEFAULT_NAME";
//    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
