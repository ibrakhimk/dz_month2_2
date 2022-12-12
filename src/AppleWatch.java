public class AppleWatch extends Watch{
    private String year;
    private int price;

    public AppleWatch(String name, int version, String year, int price) {
        super(name, version);
        this.price = price;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println("Company name: " + getName()+
                "\nVersion: " + getVersion() +
                "\nPrice: " + price+" $ "+
                "\nYear: " + year + "\n");
    }
}
