package com.company;

class Four{
    private int one;
    private char two;

    Four (int one, char two){
        this.one = one;
        this.two = two;
    }

    Four (double a){
        String numStr = String.valueOf(a);
        String[] Parts = numStr.split("\\.");

        int charCode = Integer.parseInt(Parts[0]);

        String numPartStr = Parts[1];
        String numPart = numPartStr.length() > 2 ? numPartStr.substring(0, 2) : numPartStr;

        this.one = Integer.parseInt(numPart);
        this.two = (char) charCode;
    }

    void print(){
        System.out.println("one = " + one);
        System.out.println("two = " + two);
    }
}

public class Main {

    public static void main(String[] args) {
        Four four = new Four(5,'C');
        four.print();

        four = new Four(65.1267);
        four.print();
    }
}
