
import java.util.*;
public class hollowpattern {
    
    public static void hollow(int totrows, int totcols) {
        for (int i = 1; i <= totrows; i++) {
            for (int j = 1; j <= totcols; j++) {
                if (i == 1 || i == totrows || j == 1 || j == totcols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move this outside of the inner loop
        }
    }

    public static void main(String[] args) {
        hollow(4, 4);
    }
}

