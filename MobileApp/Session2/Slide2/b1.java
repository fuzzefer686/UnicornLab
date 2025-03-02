import java.util.Scanner;
import java.util.Random;
public class b1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[]= new int[10];
        Random rand = new Random();
        for(int i=0;i<10;i++)a[i]=i;//sc.nextInt();
        int k = rand.nextInt(10);
        int j = rand.nextInt(10);
        int c=a[k];a[k]=a[j];a[j]=c;
        for(int i=0;i<10;i++)System.out.print(a[i]+" ");
    }
}