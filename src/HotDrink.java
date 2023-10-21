public class HotDrink extends Product{
    private double temperature;
    public HotDrink(String name, double cost, double temperature) {
        super(name, cost);
        this.temperature = temperature;
    }

    public double gettemperature() {
        return temperature;
    }

    public void settemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name = " + super.getName() +
                "; temperature = " + temperature +
                "; cost = " + super.getCost() +
                '}';
    }
}
