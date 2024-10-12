public class Abstraction {
    public static void main(String[] args) {
        Radio radio = new Radio("Kenwood");
        PortableRadio portableRadio = new PortableRadio("Anytone", "878");

        radio.displayDetails();
        portableRadio.displayDetails();
    }
}

class Radio {
    private String make;
    public Radio(String make) {
        this.make = make;
    }

    public String getMake() {
        return this.make;
    }

    public void displayDetails() {
        System.out.println("Make: "+this.getMake());
    }
}
class PortableRadio extends Radio {
    private String model;
    public PortableRadio(String make, String model) {
        super(make);
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(" Model: "+this.getModel());
    }
}
