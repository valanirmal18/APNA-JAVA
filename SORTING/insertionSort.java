public class insertionSort {
    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i =1; i < n; i++){
            int temp = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev] > temp){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = temp;
        }
    }
        
    public static void prirntArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        prirntArr(arr);
    }    
}
