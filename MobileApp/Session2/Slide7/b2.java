public class b2{
    class NhanVien{
        private final String tenNhanVien;
        private double heSoLuong;
        private final double LUONG_CO_BAN=750000;
        private final double LUONG_MAX=20000000;
        public NhanVien(String ten,double hsl){
            tenNhanVien=ten;
            heSoLuong=hsl;
        }
        public boolean tangHeSoLuong(double x){
            if ((heSoLuong+x)*LUONG_CO_BAN <= LUONG_MAX){
                heSoLuong+=x;
                return true;
            }
            return false;
        }
        public double tinhLuong(){
            return heSoLuong*LUONG_CO_BAN;
        }
        public void inTTin(){
            System.out.println("Ten NV: "+tenNhanVien);
            System.out.println("Luong: "+tinhLuong());
        }
    }
    interface QuanLy {
        public double tinhHoaHong();
    }
    class GiamDoc extends NhanVien implements QuanLy {
        private double phuCap;
        private final double loiNhuanCongTy = 1e20;
        public GiamDoc(String ten,double hsl,double phuCap){
            super(ten,hsl);
            this.phuCap=phuCap;
        }
        public double tinhHoaHong(){
            return super.tinhLuong()+phuCap+loiNhuanCongTy*0.05;
        }
    }
    class CanBoQuanLy extends NhanVien implements QuanLy {
//        private double phuCap;
        private final double loiNhuanCongTy = 1e20;
        public CanBoQuanLy(String ten,double hsl){
            super(ten,hsl);
//            this.phuCap=phuCap;
        }
        public double tinhHoaHong(){
            return super.tinhLuong()+loiNhuanCongTy*0.02;
        }
    }
}