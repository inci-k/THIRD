package MMAPRIL6Collections;

import java.util.ArrayList;

public class C4ArrayListReview {
    public static void main(String[] args) {
        ArrayList<String> myArr = new ArrayList<>();
        System.out.println(myArr);

        String [] arr = new String[0];
        String [] arr2 = {"q","e","r"};
        arr=arr2;
        System.out.println(arr[0]);

        myArr.add("Java");
        myArr.add("is");
        myArr.add("fun");
        System.out.println(myArr);

        myArr.remove("Java");
        System.out.println(myArr);

        myArr.set(0,"Java");
        System.out.println(myArr);
    }
}
