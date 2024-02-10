public class selectionSort {
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i =0; i < n-1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min!=i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
    
    public static void prirntArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {2,8,4,9,7,1};
        System.out.println("Given array");
        prirntArr(arr);
        System.out.println("\nSorted array");
        selectionSort(arr);
        prirntArr(arr);
    }
}
