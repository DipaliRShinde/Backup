package com.stackroute.hackathon;

class Text {
    private String text;
    private String author;
    private int length;

    String getText() {
        return text;
    }

    void setText(String s) {
        s="The Secret";
    }

    String getAuthor() {
        return author;
    }

    void setAuthor(String s) {
        s="Rhonda Byrne";
    }

    int getLength() {
        return length;
    }

    void setLength(int k) {
        k=200;
    }

    /*methods that change the text*/
    void allLettersToUpperCase() {
        System.out.println("Uppercase");
    }

    void findSubTextAndDelete(String s) {
        System.out.println("Text Delete");
    }
}
