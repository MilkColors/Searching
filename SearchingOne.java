import java.util.*;

public class SearchingOne {

    public static <T> int linear(ArrayList<T> arr, T target)
    {
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).equals(target)){
                return i;
            }
        }
    }

    public static <T extends Comparable<T>> int binary(T[] arr, T target){
        int j = 0;
        int mid = arr.length/2;
        for(int one = arr.length; one >= 0; one/=2){
        for(int i = 0; i < mid; i++){
            if(arr[i] == target) {
                j = i;
                }
            }
            mid = arr.length/2;
        }
        return j;
    }
    public static void main(String[] args){

    }
}
