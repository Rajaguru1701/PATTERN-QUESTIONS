//     0
//    101
//   21012
//  3210123
// 432101234
public class PQ3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int space = n-i-1;
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            int temp = i;
            for (int j = 0; j <=i; j++) {
                System.out.print(temp);
                temp--;
            }
            for (int k = 0; k < i; k++) {
                System.out.print(k+1);
            }
            System.out.println();
        }
    }
}
