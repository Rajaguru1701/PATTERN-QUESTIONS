public class PQ4 {
    public static void main(String[] args) {
        int n = 5;
        int k=2;
        for (int i = 1; i <= n; i++) {
            int temp = i > 3 ? i+k:i;
            for (int j = 1; j <=i; j++) {
                System.out.print(temp+" ");
                temp+=2;
            }
            if(i>3) k+=2;
            System.out.println();
        }
    }
}
