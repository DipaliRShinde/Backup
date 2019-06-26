package com.stackroute.hackathon;

public class PrintText {
    public static void main(String[] args) {
        Text text=new Text();
        text.allLettersToUpperCase();
        text.findSubTextAndDelete("find");
        Printer printer=new Printer(text);

        printer.printText();
    }
}