//              1
//           6  2
//       10  7  3
//   13  11  8  4
//15 14  12  9  5

public class PQ5 {
    public static void main(String[] args) {
        int n = 5;
        int val = 1,inc = 5;
        for (int i = 1; i <= n ; i++) {
            int space = n-i;
            int temp = val;
            for (int s = 1; s <= space; s++) {
                System.out.print("   ");
            }
            int k = n-i+1;
            for (int j = 1; j <=i ; j++) {
                System.out.print(temp+" ");
                temp-=k;
                k++;
            }
            System.out.println();
            val+=inc;
            inc--;
        }
    }
}
