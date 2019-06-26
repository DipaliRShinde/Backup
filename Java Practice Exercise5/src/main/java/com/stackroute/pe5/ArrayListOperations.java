/*  Write a Java program to update specific array element by given element and empty the array list.
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
Array list after removing all elements []   */

package com.stackroute.pe5;

import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayListOperations.addRemoveArrayListElements();
    }

    //Method to add, replace and remove elements from ArrayList
    public static void addRemoveArrayListElements() {
        //ArrayList of String type
        ArrayList<String> arrayList = new ArrayList<>();

        //Adding elements to ArrayList
        arrayList.add("Apple");
        arrayList.add("Grape");
        arrayList.add("Melon");
        arrayList.add("Berry");
        System.out.println(arrayList);

        //Replacing ArrayList elements
        arrayList.set(0, "Kiwi");
        arrayList.set(2, "Mango");
        System.out.println(arrayList);

        //Removing all elements from ArrayList
        arrayList.removeAll(arrayList);
        System.out.println("Array list after removing all elements " + arrayList);
    }
}
