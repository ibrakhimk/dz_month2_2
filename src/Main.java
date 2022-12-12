public class Main {
    public static void main(String[] args) {

        createObject("AppleWatch");
        createObject("XiaomiWatch");
        createObject("SamsungWatch");
    }

    private static void createObject(String watch) {
        switch (watch){
            case "AppleWatch":
                AppleWatch appleWatch= new AppleWatch("Apple",7,"2055",8000);
                appleWatch.print();
            case "SamsungWatch":
                SamsungWatch samsungWatch= new SamsungWatch("Samsung",5,"2020",80);
                samsungWatch.print();
            case "XiaomiWatch":
                XiaomiWatch xiaomiWatch= new XiaomiWatch("Mi",7 ,"2022",8);
                xiaomiWatch.print();
        }
    }
}