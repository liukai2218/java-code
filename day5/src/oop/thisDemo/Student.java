package oop.thisDemo;

public class Student {
    String name;
    public void print(){
            System.out.println(this);
            System.out.println(this.name);
        //哪个对象调用方法，this就代表哪个对象
    }
}
