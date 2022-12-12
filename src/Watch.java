public class Watch implements Printable{
    private String name;
    private int version;

    public String getName() {
        return name;
    }

    public int getVersion() {
        return version;
    }

    public Watch(String name, int version) {
        this.name = name;
        this.version = version;
    }

    @Override
    public void print() {

    }
}
