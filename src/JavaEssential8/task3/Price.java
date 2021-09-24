package JavaEssential8.task3;

public class Price {
    public String name;
    String store;
    int priceHrn;

    public Price(String name, String store, int priceHrn) {
        this.name = name;
        this.store = store;
        this.priceHrn = priceHrn;
    }

    public String getName() {
        return name;
    }

    public String getStore() {
        return store;
    }

    public int getPriceHrn() {
        return priceHrn;
    }

    @Override
    public String toString() {
        return "Price{" +
                "name='" + name + '\'' +
                ", store='" + store + '\'' +
                ", priceHrn=" + priceHrn +
                '}';
    }
}
