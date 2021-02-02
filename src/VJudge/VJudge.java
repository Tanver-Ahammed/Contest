package VJudge;

import java.util.Scanner;

public class VJudge {
    private static void hardCode(String st,int m){
        for (int i = 1; i <= st.length(); i++) {
            if (i%m!=0){
                System.out.print(st.charAt(i-1));
            }
            else {
                System.out.println(st.charAt(i-1));
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n,m;
            n = scanner.nextInt();
            m = scanner.nextInt();
            String st = scanner.next();
            hardCode(st,m);
        }
    }
}
