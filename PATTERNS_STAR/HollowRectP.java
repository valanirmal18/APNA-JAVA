public class HollowRectP {
    public static void hollow_rect(int totRows, int totColumns) {
        for (int i = 0; i < totRows; i++) /* i=1 easy*/{
            for (int j = 0; j < totColumns; j++) {
                // cell(i, j)
                if (i == 0 || i == totRows - 1 || j == 0 || j == totColumns - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rect(4, 5);
    }
}
