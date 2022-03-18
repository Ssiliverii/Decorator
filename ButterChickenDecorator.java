package decorator;

class ButterChicken1 extends ChickenDecorator {

    private Chicken chicken1;

    (Chicken chicken) {
        this.chicken1 = chicken;
    }

    public String getDescription() {
        return chicken.getDescription() + ", ButterChicken";
    }

    @Override
    public double cost() {
        return chicken.cost() + 1.5D;
    }
}