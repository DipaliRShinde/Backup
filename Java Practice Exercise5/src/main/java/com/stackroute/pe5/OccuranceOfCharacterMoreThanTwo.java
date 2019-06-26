/*   Write a program where an array of strings is input and output is a Map<String,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array
Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false}   */

package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccuranceOfCharacterMoreThanTwo {
    public static void main(String[] args) {
        OccuranceOfCharacterMoreThanTwo.checkOccuarance();
    }

    //Method to check if the occurances of character is more than two or not
    public static void checkOccuarance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String string = scanner.nextLine();
        String[] arrayString = string.split(" ");

        //Map to count occurances
        Map<String, Integer> map = new HashMap<>();
        for (String character : arrayString) {
            if (map.containsKey(character)) {
                map.replace(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }

        //Map to return boolean values
        Map<String, Boolean> keyMap = new HashMap<>();
        for (String character : map.keySet()) {
            if (map.get(character) >= 2) {
                keyMap.put(character, true);
            } else {
                keyMap.put(character, false);
            }
        }
        //print both number of occurances and boolean values
        System.out.println(map);
        System.out.println(keyMap);
    }
}
