package bai1;
public class test {
    public static void main(String[] args){
        Circle k = new Circle(5.8);
        k.setRadius(10);
        Square f = new Square(0.2,3.4);
        f.setWidth(5.4);
//        k.setRadius(5.0);
        System.out.println(k.getArea());
        System.out.println(f.getPerimeter());
    }
}