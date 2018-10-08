package com.codegym.test;

import com.codegym.Person;
import com.codegym.Staff;
import com.codegym.Student;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Tien","BacTuLiem");
        System.out.println(person.toString());

        Student student = new Student("Tien","BacTuLiem","Toanroirac",5,2000000);
        System.out.println(student.toString());

        Staff staff = new Staff("Thanh","Quan1","LyThaiTong",300000);
        System.out.println(staff.toString());
    }
}
