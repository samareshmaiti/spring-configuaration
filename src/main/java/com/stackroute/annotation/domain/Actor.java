package com.stackroute.annotation.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor  {

    @Value("10")
    private int age;
    @Value("samaresh")
    private String name;
    @Value("Male")
    private String gender;

@Autowired
    public Actor(int age, String name, String gender) {

        this.age = age;
        this.name = name;
        this.gender = gender;
    }


    public Actor() {
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }


}
