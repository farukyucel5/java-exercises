package AutoGallery;

public class High_Quality_Honda extends Car implements InteriorParts ,ExteriorParts{
    protected String make;
    protected String model;
    protected int year;

    @Override
    public String toString() {
        return "High_Quality_Honda{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    High_Quality_Honda(String make, String model, int year){
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
        System.out.println("Autonomous steering wheels");
    }

    @Override
    public void seats() {
        System.out.println("More conformable seats");
    }

    @Override
    public void airConditioner() {
        System.out.println("High tech air conditioner");

    }

    @Override
    public void carDoors() {
        System.out.println("They have an aerodynamic design");
    }
}
