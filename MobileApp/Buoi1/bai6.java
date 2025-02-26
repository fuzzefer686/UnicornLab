import java.util.Scanner;

public class bai6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[] = new int[n];
        int maxs=0;
        for(int i=0;i<n;i++){a[i] = sc.nextInt();if (a[i]>maxs)maxs=a[i];}
        System.out.print(maxs);
    }
}