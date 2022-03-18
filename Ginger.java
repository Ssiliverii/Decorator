package decorator;

class GingerChicken extends Chicken {

    private String description;

    GingerChicken() {
        this.description = "Ginger Chicken";
    }

    public double cost() {
        return 5.6;
    }
}
