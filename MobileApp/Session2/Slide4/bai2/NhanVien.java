public static bai2{
    class NhanVien{
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
            System.out.print(tenNhanVien+"\n"+tinhLuong());
        }
    }
    public static void main(String[] args){
        NhanVien a = new NhanVien("FuzZefer",999,5.6);
        NhanVien b = new NhanVien("Fuzz",1029,7.1);
        System.out.println(a.inTTin());
        System.out.println(b.inTTin());
        a.tangLuong(50);
        System.out.println(a.inTTin());
    }
}