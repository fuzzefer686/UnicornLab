public class b3{
    abstract class Shape{
        private String color;
        private boolean filled;
        public Shape(String color, boolean isFilled){
            this.color = color;
            filled = isFilled;
        }
        public Shape(){};
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }
        public boolean isFilled(){
            return filled;
        }
        public void setFilled(boolean filled){
            this.filled = filled;
        }
        abstract double getArea();
        abstract double getPerimeter();
        abstract String toString();
    }

    class Circle extends Shape{
        private double radius;
        public Circle(double radius){
            this.radius = radius;
        }
        public Circle(){}
        public Circle(double radius,String color, boolean isFilled){
            super(color, isFilled);
            this.radius = radius;
        }
        public double getRadius(){
            return radius;
        }
        public void setRadius(double radius){
            this.radius = radius;
        }
        public double getArea(){
            return Math.PI*radius*radius;
        }
        public double getPerimeter(){
            return 2*Math.PI*radius;
        }
        public String toString(){
            return "Shape: Circle, Radius: "+radius+", Color: "+this.getColor()+", Filled: "+super.isFilled();
        }
    }
    class Rectangle extends Shape{
        private double width;
        private double length;
        public Rectangle(double width, double length){
            this.width = width;
            this.length = length;
        }
        public Rectangle(){}
        public Rectangle(double width, double length,String color, boolean isFilled){
            super(color, isFilled);
            this.width = width;
            this.length = length;
        }
        public double getWidth(){
            return width;
        }
        public double getLength(){
            return length;
        }
        public void setWidth(double width){
            this.width = width;
        }
        public void setLength(double length){
            this.length = length;
        }
        public double getArea(){
            return length*width;
        }
        public double getPerimeter(){
            return 2*(length+width);
        }
        public String toString(){
            return "Shape: Rectangle, Width: "+width+", Length: "+length+", Color: "+this.getColor()+", Filled: "+super.isFilled();
        }
    }

    class Square extends Rectangle{
        public Square(double side){
            super(side, side);
        }
        public Square(){}
        public Square(double side, String color, boolean isFilled){
            super(side,side,color,isFilled);
        }
        public double getSide(){
            return super.getLength();
        }
        public void setSide(double side){
            super.setLength(side);
            super.setWidth(side);
        }
        public String toString(){
            return "Shape: Square, Side: "+super.getLength()+", Color: "+super.getColor()+", Filled: "+super.isFilled();
        }
    }
}