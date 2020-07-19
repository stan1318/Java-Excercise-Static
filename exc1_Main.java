package com.excercises.exc1;
//EXCERCISE TESTING STATIC//
public class Main {

    public void non_statictest(){
        System.out.println("Yo Yo!");
    }
    public static void statictest(){
        System.out.println("Yo Yo!");
    }
    public static void main(String[] args) {
        System.out.println("Undertale is awesome!");
        statictest();
        Main num1main = new Main();
        num1main.non_statictest();

    }
}
