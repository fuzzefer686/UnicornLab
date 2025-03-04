package bai4;
import java.util.Scanner;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ageSum=0;
        Student[] a = new Student[n];
        for(int i=0;i<n;i++){
            a[i]=new Student(sc.nextLine(),sc.nextInt());
            ageSum+=a[i].getYear();
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i].getName()+" "+a[i].getYear());
        }
        System.out.println(ageSum);
    }
}