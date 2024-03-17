package com.stackroute.strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    //write logic to check given two phrases are anagrams or not and return result
    public String checkAnagrams(String phraseOne, String phraseTwo) {
        if(phraseOne.isEmpty() || phraseTwo.isEmpty()){
            return "Give proper input not empty phrases";
        }
        //Split the words in to char sort and check if equal
        if(phraseOne.length() != phraseTwo.length()) return "Given phrases are not anagrams";
        phraseOne = phraseOne.replace(" ", "");
        phraseTwo = phraseTwo.replace(" ", "");

        if(!check(phraseOne, phraseTwo)){
                return "Given phrases are not anagrams";
        }


        return "Given phrases are anagrams";
    }
    public boolean check(String w1, String w2){
        if(w1.length() != w2.length()){
            return false;
        }
        char[] temp1 = w1.toCharArray();
        char[] temp2 = w2.toCharArray();
        Arrays.sort(temp2);
        Arrays.sort(temp1);
        for(int i=0; i< temp1.length; i++){
             if(temp1[i] != temp2[i]) return false;
        }
        return true;
    }
}
