package hw6;

public class Lollilop implements Candie {
    @Override
    public String name() {
        return "NonStop";
    }

    @Override
    public String manufacturer() {
        return "Roshen";
    }

    @Override
    public String type_candie() {
        return "Леденец";
    }

    @Override
    public double weight() {
        return 0.02;
    }

    @Override
    public double sugare() {
        return 0.005;
    }
}
