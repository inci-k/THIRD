package MMAPRIL15LinkedAndHashMap;

import java.util.HashSet;

public class L28EdabitUnique {
    public static void main(String[] args) {
        int arr1[] = {1,3,4,4};
        int arr2[] = {2,5,7};
        System.out.println(hasEqualUnique(arr1,arr2));
    }
    public static boolean hasEqualUnique(int arr1[],int arr2[]){
        boolean result;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        //adding elements of the arr1
        for(int num :arr1){
            set1.add(num);
        }
        //adding elements of the arr2
        for (int num :arr2){
            set2.add(num);
        }
        if (set1.size()==set2.size()){
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
}
