package bai3;
public class NhanVien{
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private final double LUONG_MAX = 99999999;
    public NhanVien(String tenNhanVien,double luongCoBan,double heSoLuong){
        this.tenNhanVien=tenNhanVien;
        this.luongCoBan=luongCoBan;
        this.heSoLuong=heSoLuong;
    }
    public boolean tangLuong(double hs){
        this.heSoLuong+=hs;
        if(this.heSoLuong*luongCoBan>LUONG_MAX){
            this.heSoLuong-=hs;
            return false;
        }
        return true;
    }
    public double tinhLuong(){
        return luongCoBan*heSoLuong;
    }
    public void inTTin(){
        System.out.print(tenNhanVien+"\n"+());
    }
}