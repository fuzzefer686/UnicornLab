public class b1{
    class PhongBan{
        public final String tenPhongBan;
        public static byte soNhanVien;
        private final byte SO_NV_MAX = 100;
        private NhanVien dsnv[];
        public boolean themNV(NhanVien x){
            if (soNhanVien < SO_NV_MAX){
                dsnv[soNhanVien] = x;
                soNhanVien++;
                return true;
            }
            return false;
        }
        public boolean xoaNV(){
            if (soNhanVien > 0 ){
                soNhanVien--;
                return true;
            }
            return false;
        }
        public double tongLuong(){
            double total = 0;
            for (NhanVien x:dsnv){
                total+=x.heSoLuong*x.LUONG_CO_BAN;
            }
            return total;
        }
        public void inTTin() {
            for (NhanVien x : dsnv) {
                System.out.println(x.tenNhanVien + " " + LUONG_CO_BAN + " " + heSoLuong);
            }
        }
    }
    class NhanVien{
        private final String tenNhanVien;
        private double heSoLuong;
        private final double LUONG_CO_BAN=750000;
        private final double LUONG_MAX=20000000;
        public NhanVien(String ten,double hsl){
            tenNhanVien=ten;
            heSoLuong=hsl;
        }
        public boolean tangLuong(double x){
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
            System.out.println("Ten phong: "+tenPhong);
            System.out.println("So NV: "+soNhanVien);
            System.out.println("Thong tin cac NV");
            for(NhanVien x: dsnv)x.inTTin();
        }
    }
    class TruongPhong extends NhanVien{
        private double phuCap;
        private double soNamDuongChuc;
        public TruongPhong(String ten,double hsl, double phuCap,double soNamDuongChuc){
            super(ten,hsl);
        }
        public double tinhLuong(){
            return super.tinhLuong()+phuCap;
        }
        public void inTTin(){
            return super.inTTin();
        }
    }
}