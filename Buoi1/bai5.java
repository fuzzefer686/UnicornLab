import java.util.Scanner;

public class bai5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[] = new int[n];
        double avg=0;
        for(int i=0;i<n;i++){a[i] = sc.nextInt();avg+=a[i];}
        System.out.print(avg/n);
    }
}