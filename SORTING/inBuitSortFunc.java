import java.util.*; // * = all packages

public class inBuitSortFunc {
    public static void prirntArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {4,1,8,6,45,23};
        Arrays.sort(arr);
        prirntArr(arr);
    }
}
