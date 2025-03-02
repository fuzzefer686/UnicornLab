import java.util.Scanner;
public class b4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[][]= new int[10][10];
        int n;
        do {
            n=sc.nextInt();
        } while(3>n || n>8);
        int cnt=1;
        int x;
        x=1;
        while(cnt<=n*n){
            for(int i=x;i<=n-x+1;i++)a[x][i]=cnt++;
            for(int i=x+1;i<=n-x+1;i++)a[i][n-x+1]=cnt++;
            for(int i=n-x;i>=x;i--)a[n-x+1][i]=cnt++;
            for(int i=n-x;i>=x+1;i--)a[i][x]=cnt++;
            x++;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}