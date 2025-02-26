import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        boolean check=false;
        for(int i=0;i<s.length();i++){
            int c=(int)(s.charAt(i))-48;
            if (0<=c && c<=9){check=true;break;}
        }
        System.out.print(check);
    }
}
