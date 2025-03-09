package sec3sl8;
public class hangHoa {
    static class goods {
        protected String code;
        protected String name;
        protected String manufacturer;
        protected double price;

        public goods(String code, String name, String manufacturer, double price) {
            this.code = code;
            this.name = name;
            this.manufacturer = manufacturer;
            this.price = price;
        }
    }
    interface printer {
        public void printDetails();
    }

    static class electric extends goods implements printer {
        private String warrantyDate;
        private final double voltage;
        private final double Power;

        public electric(String code, String name, String manufacturer, double price, double voltage, double Power) {
            super(code, name, manufacturer, price);
            this.voltage = voltage;
            this.Power = Power;
        }

        public void printDetails() {
            System.out.println("Name: " + name + ", Manufacturer: " + manufacturer + ", Price: " + price + ", Voltage: " + voltage + ", Power: " + Power);
        }
    }

    static class glass extends goods implements printer {
        private String materials;

        public glass(String code, String name, String manufacturer, double price, String materials) {
            super(code, name, manufacturer, price);
            this.materials = materials;
        }

        public void printDetails() {
            System.out.println("Name: " + name + ", Manufacturer: " + manufacturer + ", Price: " + price + ", Materials: " + materials);
        }
    }

    static class food extends goods implements printer {
        private String releaseDate;
        private String expiredDate;

        public food(String code, String name, String manufacturer, double price, String releaseDate, String expiredDate) {
            super(code, name, manufacturer, price);
            this.expiredDate = expiredDate;
            this.releaseDate = releaseDate;
        }

        public void printDetails() {
            System.out.println("Name: " + name + ", Manufacturer: " + manufacturer + ", Price: " + price + ", releaseDate: " + releaseDate + ", expiredDate: " + expiredDate);
        }
    }
}