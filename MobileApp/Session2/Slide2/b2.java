import java.util.Scanner;
import java.util.Random;
public class b2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[]= new int[10];
        int n=sc.nextInt();
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++){
                if (a[i]>a[j]) {
                    int c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }
        for(int i=0;i<n;i++)System.out.print(a[i]+" ");
    }
}