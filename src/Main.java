//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        car.setBrand("Skoda");
        car.setYear(1988);
        car.setNumberOfDoors(17);
        motorcycle.setBrand("Mamochka");
        motorcycle.setYear(2015);
        motorcycle.setHasSidecar(true);

        System.out.println(car.getYear());
        System.out.println(car.getBrand());
        car.StartEngine();
        System.out.println(motorcycle.getYear());
        System.out.println(motorcycle.getBrand());
        motorcycle.StartEngine();
    }
}
