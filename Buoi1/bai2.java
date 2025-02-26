import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        if (a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c == a*a){
            System.out.print("3 so nhap vao la 3 canh cua 1 tam giac vuong");
        }
        else 
        System.out.print("3 so nhap vao ko la 3 canh cua 1 tam giac vuong");
    }
}