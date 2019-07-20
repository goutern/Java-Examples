
public class Pizza {
    private String size;
    private int numHamToppings;
    private int numCheeseToppings;
    private int numPepperoniToppings;
    //default constructor
    public Pizza(){}
    //constuctors
    public Pizza(String size){
        this(size,0);
    }
    public Pizza(String size, int numHamToppings){
        this(size,numHamToppings,0);
    }
    public Pizza(String size, int numHamToppings, int numCheeseToppings){
        this(size,numHamToppings,numCheeseToppings,0);
    }

    public Pizza(String size, int numHamToppings, int numCheeseToppings, int numPepperoniToppings){
        this.size = size;
        this.numHamToppings = numHamToppings;
        this.numCheeseToppings = numCheeseToppings;
        this.numPepperoniToppings = numPepperoniToppings;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setNumHamToppings(int numHamToppings) {
        this.numHamToppings = numHamToppings;
    }

    public void setNumCheeseToppings(int numCheeseToppings) {
        this.numCheeseToppings = numCheeseToppings;
    }

    public void setNumPepperoniToppings(int numPepperoniToppings) {
        this.numPepperoniToppings = numPepperoniToppings;
    }

    public String getSize() {
        return size;
    }

    public int getNumHamToppings() {
        return numHamToppings;
    }

    public int getNumCheeseToppings() {
        return numCheeseToppings;
    }

    public int getNumPepperoniToppings() {
        return numPepperoniToppings;
    }

    public double calcCost() {
        double cost = 0.0;
        switch(size.toLowerCase()){
            case "small": cost = 10.0;
            break;
            case "medium": cost = 12.0;
            break;
            case "large": cost = 14.0;
            break;
            default:
                System.out.println("\nNo Size?\n");
        }

        cost += numHamToppings * 2;
        cost += numCheeseToppings * 2;
        cost += numPepperoniToppings *2;

        return cost;
    }

    public String getDescription(){
        StringBuilder description = new StringBuilder();
        description.append("Size: ");
        description.append(this.size);
        description.append(" Number of Ham Toppings: ");
        description.append(this.numHamToppings);
        description.append(" Number of Cheese Toppings: ");
        description.append(this.numCheeseToppings);
        description.append(" Number of Pepperoni Toppings: ");
        description.append(this.numPepperoniToppings);

        return description.toString();
    }

}
