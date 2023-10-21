import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{
    List<HotDrink> HotDrinks;

    public HotDrinkVendingMachine(List<HotDrink> products) {
        this.HotDrinks = products;
    }

    public List<HotDrink> getHotDrinks() {
        return HotDrinks;
    }

    public void setHotDrinks(List<HotDrink> HotDrinks) {
        this.HotDrinks = HotDrinks;
    }

    @Override
    public Product getProduct(String name) {
        for (HotDrink item : HotDrinks) {
            if(item.getName().equals(name))
                return item;
        }
        return null;
    }
    public Product getProduct(String name, double temperature){
        for (HotDrink bottle : HotDrinks) {
            if(bottle.getName().equals(name) && bottle.gettemperature() == temperature)
                return bottle;
        }
        return null;
    }
    public void addHotDrink(HotDrink bottleOfWatter){
        this.HotDrinks.add(bottleOfWatter);
    }
}
