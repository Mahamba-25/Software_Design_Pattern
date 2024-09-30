// Coffee.java
public abstract class Coffee {
    protected String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Coffee: " + name;
    }
}

