package AutoGallery;

public class Modest_Honda extends Car implements InteriorParts,ExteriorParts {

    protected String make;
    protected String model;
    protected int year;
    protected double price=InteriorParts.price1+ExteriorParts.price1;

    @Override
    public String toString() {
        return "Modest_Honda{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    Modest_Honda(String make, String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void steeringWheel() {

        System.out.println("Manuel steering wheel");

    }

    @Override
    public void seats() {
        System.out.println("Poor suspension effect");

    }

    @Override
    public void airConditioner() {
        System.out.println("Modest air conditioner");

    }

    @Override
    public void carDoors() {
        System.out.println("They cannot reduce the air drag properly");

    }
}
