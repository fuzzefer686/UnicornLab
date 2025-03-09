public class test{
    abstract static class NhanVien{
        protected String tenNhanVien;
        protected static final double LUONG_MAX=1e9;
        public NhanVien(String tenNhanVien){
            this.tenNhanVien=tenNhanVien;
        }
        abstract public double tinhLuong();
        abstract public void inThongTin();
    }
    static class NhanVienCoHuu extends NhanVien{
        private static double luongCoBan;
        private double heSoLuong;
        public NhanVienCoHuu(String tenNhanVien,double heSoLuong){
            super(tenNhanVien);
        }
        public double tinhLuong(){
            return luongCoBan*heSoLuong;
        }
        public void inThongTin(){
            System.out.println(tenNhanVien+" "+tinhLuong());
        }
    }
    static class TruongPhong extends NhanVienCoHuu{
        private double phuCap;
        private int soNamDuongChuc;
        private double luong;
        public TruongPhong(String name,double heSoLuong,double phuCap,int soNamDuongChuc){
            super(name,heSoLuong);
            this.phuCap=phuCap;
        }
        public double tinhLuong(){
            luong = super.tinhLuong()+phuCap;
            return luong;
        }
        public void inThongTin(){
            super.inThongTin();
            System.out.println("Phu cap: "+phuCap+" So Nam Nham Chuc: "+soNamDuongChuc);
        }
    }
    static class NhanVienHopDong extends NhanVien{
        private final double luongHopDong;
        NhanVienHopDong(String name,double luongHopDong){
            super(name);
            this.luongHopDong=luongHopDong;
        }
        public double tinhLuong(){
            return luongHopDong;
        }
        public void inThongTin(){
            System.out.println(tenNhanVien+" "+luongHopDong);
        }
    }
    static class PhongBan{
        protected String tenPhongBan;
        public int soNhanVien=0;
        private final int SO_NV_MAX = 200;
        public NhanVien[] dsnv = new NhanVien[SO_NV_MAX];
        public PhongBan(String tenPhongBan){
            this.tenPhongBan=tenPhongBan;
        }
        public boolean themNV(NhanVien x){
            if (soNhanVien+1<=SO_NV_MAX){
                dsnv[soNhanVien++]=x;
                return true;
            }
            return false;
        }
        public void xoaNV(){
            soNhanVien--;
        }
        public double tinhTongLuong(){
            double sum=0;
            for(int i=0;i<soNhanVien;i++){
                sum+=dsnv[i].tinhLuong();
            }
            return sum;
        }
        public void inThongTin(){
            for(int i=0;i<soNhanVien;i++){
                dsnv[i].inThongTin();
            }
        }
    }
    public static void main(String[] args) {
        PhongBan pdt = new PhongBan("Phong Dao Tao");
        pdt.themNV(new NhanVienHopDong("Fuz",999));
        pdt.themNV(new TruongPhong("deprogramming",99,99,1));
        System.out.println(pdt.tinhTongLuong());
        pdt.inThongTin();
    }
}