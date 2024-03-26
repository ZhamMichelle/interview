package kz.zhami.interview.patterns.builder;

import java.util.Date;

public class Person {
    private String name;
    private String surname;
    private Date birthDate;
    private int age;

    public static class Builder {
        private String name;
        private String surname;
        private Date birthDate;
        private int age;

        public Builder setName(String name){
            this.name=name;
            return this;
        }

        public Person build(){
            return new Person(this);
        }


    }
    private Person(Builder b){
        name=b.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return age;
    }
}
