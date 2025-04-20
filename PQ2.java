//     1
//    21
//   321
//  4321
// 54321
public class PQ2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int space = n-i;
            for(int s=1;s<=space;s++)
            {
                System.out.print(" ");
            }
            int temp = i;
            for (int j = 1; j <=i; j++) {
                System.out.print(temp);
                temp--;

            }
            System.out.println();
        }
    }
}

