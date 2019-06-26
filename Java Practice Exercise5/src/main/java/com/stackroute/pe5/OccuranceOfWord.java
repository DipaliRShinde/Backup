/* Write a program to find the number of counts in the following String. Store the output in
Map<String,Integer> as key value pair.
Input : String str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}   */

package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWord {
    public static void main(String args[])
    {
        OccuranceOfWord.countWord();
    }

    //Method to count the occurances of word in given String
    public static void countWord()
    {
        String string="one one -one___two,,three,one @three*one?two";
        String array[]=string.split(" |-|___|,,|,|@|[*]|[?]");

        //HashMAp to count occurances of word
        Map<String ,Integer> map=new HashMap<>();
        for(String word: array)
        {
            if(map.containsKey(word))
            {
                map.put(word,map.get(word)+1);
            }
            else
            {
                map.put(word,1);
            }
        }
        map.remove("");
        System.out.println(map);
    }
}