import java.util.Scanner;

public class bai10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[] = new int[n];
        int maxs=0;
        for(int i=0;i<n;i++){a[i] = sc.nextInt();}
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (a[i]>a[j]){
                    int tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        for(int i=0;i<n;i++)System.out.print(a[i]+ " ");
    }
}