package hw6;

public class Waffles implements Candie {
    @Override
    public String name() {
        return "Artek";
    }

    @Override
    public String manufacturer() {
        return "Biskvit-Chocolate";
    }

    @Override
    public String type_candie() {
        return "Вафли";
    }

    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public double sugare() {
        return 0.04;
    }
}
