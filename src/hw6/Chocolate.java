package hw6;

public class Chocolate implements Candie {
    @Override
    public String name() {
        return "King";
    }

    @Override
    public String manufacturer() {
        return "AVK";
    }

    @Override
    public String type_candie() {
        return "Шоколадная";
    }

    @Override
    public double weight() {
        return 0.04;
    }

    @Override
    public double sugare() {
        return 0.01;
    }
}
