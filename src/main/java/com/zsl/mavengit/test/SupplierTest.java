package com.zsl.mavengit.test;

import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {
        Supplier<Student> supplier = () -> new Student();

        Supplier<Student> supplier2 = Student::new;

        supplier.get().sayHello();
    }
}

class Student {

    public void sayHello() {
        System.out.println("hello");
    }

}
