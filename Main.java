package com.company;

class Two{
    private char ch1;
    private char ch2;

    Two (char ch1, char ch2){
        this.ch1 = ch1;
        this.ch2 = ch2;
    }

    void printChar(){
        int ch1Code = (int) ch1;
        int ch2Code = (int) ch2;

        for (int i = ch1; i<ch2; i++){
            System.out.println((char)i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Two example = new Two('A','G');
        example.printChar();

    }
}
