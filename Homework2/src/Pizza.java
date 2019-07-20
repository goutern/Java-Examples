public class Pizza {


    private enum size {
        SMALL,
        MEDIUM,
        LARGE;
    }
    private int numCheeseToppings;
    private int numPepperoniToppings;
    private int numHamToppings;

    public Pizza(int numCheeseToppings){

    }

    public Pizza(int numCheeseToppings, int numPepperoniToppings, int numHamToppings) {
        this.numCheeseToppings = numCheeseToppings;
        this.numPepperoniToppings = numPepperoniToppings;
        this.numHamToppings = numHamToppings;
    }
}
