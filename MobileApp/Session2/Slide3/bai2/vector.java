package bai2;
public class vector {
    private double x,y,z;
    public vector(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public double getX(){return x;}
    public double getY(){return y;}
    public double getZ(){return z;}
    public void setX(double x){this.x=x;}
    public void setY(double y){this.y=y;}
    public void setZ(double z){this.z=z;}
    public vector add(vector b){
        return new vector(this.x+b.x,this.y+b.y,this.z+b.z);
    }
    public vector sub(vector b){
        return new vector(this.x-b.x,this.y-b.y,this.z-b.z);
    }
    public double dotProd(vector b){
        return  this.x*b.x+this.y*b.y+this.z*b.z;
    }
}