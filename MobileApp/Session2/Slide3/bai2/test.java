package bai2;
public class test{
    public static void main(String[] args){
        vector x = new vector(1,2,3);
        vector y = new vector(-6,-0.9,2.3);
        System.out.print(x.dotProd(y.add(new vector(9,2.9,-2.3))));
    }
}