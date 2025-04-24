//Input : n=5
//Output:
//        +
//       +++
//      +++++
//     +++++++
//    +++++++++


public class PQ10 {
    public static void main(String[] args) {
        int n = 5;
        int temp =1;
        for(int i=1;i<=n;i++)
        {
            int space = n-i;
            for(int k=1;k<=space;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=temp;j++)
            {
                System.out.print("+");
            }
            temp+=2;
            System.out.println();
        }
    }
}
