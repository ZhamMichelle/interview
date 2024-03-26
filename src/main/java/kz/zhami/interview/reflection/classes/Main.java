package kz.zhami.interview.reflection.classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        String className = scanner.next();
        Class aClass = Class.forName(className);

//        Object object = aClass.newInstance();
//        System.out.println(object);

        Field[] fields = aClass.getFields();
        Class[] types = new Class[aClass.getFields().length];
        for (int i = 0; i < fields.length; i++) {
            types[i] = fields[i].getType();
        }

        Constructor constructor = aClass.getDeclaredConstructor(types);
        for (Class type : constructor.getParameterTypes())
            System.out.println(type.getName());

        int intValue = 0;
        String stringValue = "";
        for (int i = 0; i < fields.length; i++) {
            if (types[i].getName().equals("int")) {
                intValue = scanner.nextInt();
            } else if (types[i].getName().equals("java.lang.String")) {
                stringValue = scanner.next();
            }
        }

        Object[] arguments={stringValue,intValue};
        Object object=constructor.newInstance(arguments);
        System.out.println(object);

    }
}
