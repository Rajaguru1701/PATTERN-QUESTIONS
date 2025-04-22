//1
//1 2
//1 2 3
//1 2 3 4
//  2 3 4
//    3 4
//      4
public class PQ6 {
    public static void main(String[] args) {
        int n =10;
        for (int i = 1; i <= 2*n -1; i++) {
            if(i <= n)
            {
                for (int j = 1; j <=i; j++) {
                    System.out.print(j);
                }
                int spc = n-i;
                for (int k = 0; k < spc; k++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
            else {
                for (int j = 0; j <i-n; j++) {
                    System.out.print(" ");
                }
                for (int k = i-n+1; k <= n; k++) {
                    System.out.print(k);
                }
                System.out.println();
            }
        }
    }
}
