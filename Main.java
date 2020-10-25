package com.company;

class Six{
    private int min;
    private int max;

    Six(int a, int b){
        System.out.println();
        this.assign(a,b);
    }

    public void assign(int a, int b){
        this.min = Math.min(a,b);
        this.max = Math.max(a,b);
    }

    public void assign(int c){
        this.min = Math.min(this.min,c);
        this.max = Math.max(this.max,c);
    }

    public void print(){
        System.out.printf("min = %d, max = %d\n", min, max);
    }
}

public class Main {

    public static void main(String[] args) {

        Six six = new Six(3,5);
        six.print();

        six.assign(7);
        six.print();

        six.assign(23,75);
        six.print();
    }
}
