public class Car extends Vehicle{
    private int numberOfDoors;
    public int getNumberOfDoors(){
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public void StartEngine(){
        System.out.println("Двигатель автомобиля запущен.");
    }
}
