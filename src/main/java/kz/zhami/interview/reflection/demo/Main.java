package kz.zhami.interview.reflection.demo;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        SomeClass someObject = new SomeClass();
        Class<SomeClass> someClassAsClass = (Class<SomeClass>) someObject.getClass();
        Field someField = someClassAsClass.getField("someField");
        System.out.println(someField.getType());

        Field[] fields = someClassAsClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getType() + " " + field.getName());
        }

        System.out.println(someObject.someField);
        someField.set(someObject, 777);
        System.out.println(someObject.someField);

        Field privateField = someClassAsClass.getDeclaredField("somePrivateField");
        privateField.setAccessible(true);
        privateField.set(someObject,"private-private");
        System.out.println(someObject.getSomePrivateField());
    }
}
