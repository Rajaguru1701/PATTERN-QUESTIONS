class PQ11 {
    public static void main(String[] args) {
        String s = "rajagurua";
        int l = s.length();
        if(l%2==0)
        {
            System.out.println("Please enter the odd length string");
        }
        else {
            for (int i = 1; i <=l ; i++) {
                for (int j = 1; j <=l ; j++) {
                    if(i==j || j == l-i+1)
                    {
                        System.out.print(s.charAt(i-1)+" ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
