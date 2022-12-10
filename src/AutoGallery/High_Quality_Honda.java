package AutoGallery;

public class High_Quality_Honda extends Modest_Honda{
    protected String make;
    protected String model;
    protected int year;
    protected double sunroof_price=1000;
    private final double price_of_quality_difference=5000;

    protected double price=InteriorParts.price1+ExteriorParts.price1+price_of_quality_difference+sunroof_price;







    High_Quality_Honda(String make, String model, int year){
        super();
        this.make=make;
        this.model=model;
        this.year=year;
    }

    public High_Quality_Honda() {

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

    public double getPrice() {
        return price;
    }
}
