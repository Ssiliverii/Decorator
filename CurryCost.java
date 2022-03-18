package decorator;

abstract class Chicken {
    
private String description;

    Chicken() {
        description = "Sample Chicken.";
    }

    public String getDescription() {
        return this.description;
    }

    // this method is abstract because the different types of chicken curry will have different cost
    public abstract double cost();
}