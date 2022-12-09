package AutoGallery;

public class Car {
    protected String make ;
    protected String model;
    protected int year;

    Car(){

    }
    Car(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
