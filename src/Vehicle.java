
public class Vehicle {
    private String brand;
    private int year;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void StartEngine(){
        System.out.println("Двигатель транспортного средства запущен.");
    }
}
