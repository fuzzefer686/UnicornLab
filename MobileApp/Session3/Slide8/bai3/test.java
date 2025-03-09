package sec3sl8;
public class test{
    public static void main(String[] args) {
        hangHoa.glass bat = new hangHoa.glass("123","bat Bat Trang","Gom Bat Trang",0.25,"Gom");
        hangHoa.electric phone = new hangHoa.electric("iPhone15,3","iPhone 14 Pro Max","Apple",1199,3.7,27);
        hangHoa.food com = new hangHoa.food("cookedRice","RICE","Vinafood",9.9,"9.3.25","9.3.26");
        hangHoa.electric cpu = new
                hangHoa.electric("CometLake","Intel Core i5 10400","Intel",510,1.1,65);
        bat.printDetails();
        phone.printDetails();
        com.printDetails();
        cpu.printDetails();
    }
}