public class Motorcycle extends Vehicle{
    private boolean hasSidecar;

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    @Override
    public void StartEngine(){
        System.out.println("Двигатель мотоцикла запущен.");
    }
}
