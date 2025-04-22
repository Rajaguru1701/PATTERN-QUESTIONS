//1 2 3 4 5
//2 3 4 5 1
//3 4 5 1 2
//4 5 1 2 3
//5 1 2 3 4
public class PQ7 {
    public static void main(String[] args) {
        int n =5;
        int jl = n;
        for (int i = 1; i <=n ; i++) {
            int temp = i;
            for (int j = 1; j <= jl; j++) {
                System.out.print(temp);
                temp+=1;
            }
            jl--;
            for (int k = 1; k < i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
