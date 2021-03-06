package MMAPRIL15LinkedAndHashMap;

import java.util.Arrays;
import java.util.LinkedList;

public class L1LinkedListNumbersQ {
    public static void main(String[] args) {
        LinkedList<String > myList = new LinkedList<>(Arrays.asList("Banana 6"," Apple 8", " Plum 4"));
        findDigits(myList);
        findDigits(myList,true);
    }
    public static void findDigits(LinkedList<String > arr){
        int total=0;
        int value;
        String x="";
        for(String word: arr){
            for (int i = 0; i < word.length(); i++) {
                if(Character.isDigit(word.charAt(i))){
                    x+=word.charAt(i);
                    System.out.println(x);
                    value=Integer.parseInt(x);
                    total+=value;
                    x="";
                }
            }
        }
        System.out.println("total : "+total);
    }
    public static void findDigits(LinkedList<String > arr, boolean x){
        int total=0;
        int value;
        for (String word:arr){  //fetch words
            for (int i = 0; i < word.length(); i++) {   //to fetch chars
                if (Character.isDigit(word.charAt(i))){
                    value=word.charAt(i)-48;            //ASCII LIST 48=0
                    total+=value;
                }
            }
        }
        System.out.println(total);
    }
}
