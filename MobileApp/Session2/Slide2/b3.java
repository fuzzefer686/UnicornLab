import java.util.Scanner;
public class b3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n=sc.nextInt();
        } while(2>n || n>10);
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}