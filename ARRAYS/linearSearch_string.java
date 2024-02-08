public class linearSearch_string {
    public static int linearSearch(String str[],String key){
        for(int i = 0; i<str.length; i++){
            if(key == str[i]){
                System.out.println("Key found at index : " + i);
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String str[] = {"abc", "def", "xyz", "pQr"};
        String key = "pqr";
        int i = linearSearch(str, key);
        if(i == -1){
            System.out.println("Key Not Found");
        }
    }
}
