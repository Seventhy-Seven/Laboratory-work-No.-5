package com.company;


class Five{
    private int one;

    Five(int one){
        this.one = one;
    }

    public void assign(int one){
        this.one = Math.min(one, 100);
    }

    public void assign(){
        this.one = 0;
    }

    void print(){
        System.out.println("one = " + one);
    }
}
public class Main {

    public static void main(String[] args) {
        Five five = new Five(3);
        five.print();

        five.assign();
        five.print();

        five.assign(150);
        five.print();

    }
}
