public class PizzaOrder{
    private Pizza[] pizzaList;
    private int numPizzas;

    // default constructor
    // creates an array of 30 elements and initializes numPizzas to 0
    public PizzaOrder(){
        this.pizzaList = new Pizza[30];
        this.numPizzas = 0;
    }

    // copy constructor
    // copies the instance variable numPizza of the object po
    // creates a new array pizzaList and fills it with the
    // elements from the pizzaList of the object po
    public PizzaOrder(PizzaOrder po){
        for(int i = 0; i < po.pizzaList.length; i++){
            this.pizzaList[i] = po.pizzaList[i];
        }
    }


    // adds an object of type Pizza to the array
// and increments numPizzas
    public void addPizza(Pizza p){
        this.pizzaList[this.numPizzas] = p;
        this.numPizzas++;
    }


    // displays the content of pizzaOrder object in a nice format
// uses getDescription() for each Pizza object in the array pizzaList
    public String toString(){
        StringBuilder retval = new StringBuilder();
        for(int i = 0; i < this.numPizzas; i++){
            retval.append(this.pizzaList[i].getDescription()).append("\n");
        }
        return retval.toString();
    }


    public int getNumPizzas() {
        return numPizzas;
    }
}