package com.company;

class first{
    private char a;

    public void Set(){
        this.a = a;
    }
    public int vozvrat (){
        return a;
    }
    public void showsymbol(){

        System.out.println("Символ " + 'a');
        String a = Integer.toBinaryString('a');
        System.out.println("Код символа " + a);
    }
}
public class Main {
    public static void main(String[] args) {
        first frs = new first();

        frs.Set();
        frs.vozvrat();
        frs.showsymbol();
    }
}