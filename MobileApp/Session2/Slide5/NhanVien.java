package bai5;
import java.lang.System;
public class NhanVien{
    static class nv {
    public static int soLuongNhanVien;
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private final double LUONG_MAX = 99999999;

    public nv(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        soLuongNhanVien++;
    }

    public boolean tangLuong(double hs) {
        this.heSoLuong += hs;
        if (this.heSoLuong * luongCoBan > LUONG_MAX) {
            this.heSoLuong -= hs;
            return false;
        }
        return true;
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }
    public void inTTin() {
        System.out.print(tenNhanVien + "\n" + tinhLuong());
    }
    public static double countSalary(nv... arr) {
        double salary = 0;
        for(nv a:arr){
            salary+=a.tinhLuong();
        }
        return salary;
    }
}
    public static void main(String[] args) {
        nv a = new nv("Fu",100,1);
        nv b = new nv("usu",90,2.9);
        System.out.println(nv.soLuongNhanVien);
        System.out.println(nv.countSalary(a,b));
        String stra = "hello";
        String strb = "Type";
        long beginTime = System.currentTimeMillis();
        String c = stra + strb;
        long stringAddTime = System.currentTimeMillis();
        stringAddTime -= beginTime;
        System.out.println("Normal String: "+stringAddTime);
        StringBuffer sa = new StringBuffer();
        beginTime = System.currentTimeMillis();
        sa.append(a);
        sa.append(b);
        stringAddTime = System.currentTimeMillis();
        stringAddTime -= beginTime;
        System.out.println("BufferString: "+stringAddTime);
    }
}