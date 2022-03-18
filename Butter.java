package decorator;

class ButterChicken extends Chicken {

    private String description;

    ButterChicken() {
        this.description = "Butter Chicken";
    }

    public double cost() {
        return 10.5;
    }
}