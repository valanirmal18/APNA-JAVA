public class linearSearch {
    public static int linearSearch(int num[], int key){
        for(int i = 0; i < num.length; i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int num[] = { 35,56,54,44,77,67};
        int key = 54;

        int i = linearSearch(num, key);
        if(i == -1){
            System.out.println("Not found");
        } else {
            System.out.println("Key is at index " + i);
        }
    }
}
