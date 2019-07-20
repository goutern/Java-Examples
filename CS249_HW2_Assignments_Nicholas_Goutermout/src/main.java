import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Person nick = new Person();
        nick.setName("Nick");

        System.out.println(nick.toString());

        Vehicle car = new Vehicle();
        car.setName("Camery");
        car.setNumCylinders(4);
        car.setOwner(nick);

        System.out.println(car.toString());

        Truck truck = new Truck("Ford", 8,nick, 2.5, 1000 );
        System.out.println(truck.toString());

        System.out.println(car.getOwner().equals(truck.getOwner()));







//        boolean MALE = true;
//        boolean FEMALE = false;
//        boolean exit = false;
//        String genderString;
//        String exitString;
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        while(!exit) {
//            boolean gender = false;
//            boolean flag = false;
//            int hMother = 0;
//            int hFather = 0;
//            int hChild;
//            System.out.println("Is your child male or female?");
//            while(!flag){
//                try{
//                    genderString = reader.readLine().toLowerCase();
//                }catch(Exception e){
//                    System.out.println("Please enter male or female.");
//                    continue;
//                }
//                if(genderString.equals("male")){
//                    gender = MALE;
//                    flag = true;
//                }else if(genderString.equals("female")){
//                    gender = FEMALE;
//                    flag = true;
//                }else{
//                    System.out.println("Please enter male or female.");
//                }
//            }
//            flag = false;
//            System.out.println("What is the height of the Mother in inches?");
//            while(!flag){
//                try{
//                    hMother = Integer.parseInt(reader.readLine());
//                    flag = true;
//
//                }catch(Exception e){
//                    System.out.println("Please enter an integer for the Mother.");
//                }
//            }
//            flag = false;
//            System.out.println("What is the height of the Father in inches?");
//            while(!flag){
//                try{
//                    hFather = Integer.parseInt(reader.readLine());
//                    flag = true;
//                }catch(Exception e){
//                    System.out.println("Please enter an integer for the Father.");
//                }
//            }
//            if(gender){
//                hChild = ((hMother * 13/12) + hFather)/2;
//            }else{
//                hChild = ((hFather * 12/13) + hMother)/2;
//            }
//            flag = false;
//            System.out.println("The child's height is: " + hChild);
//            System.out.println("Exit?(Y/N)");
//            while(!flag){
//                try{
//                    exitString = reader.readLine().toLowerCase();
//
//                }catch(Exception e){
//                    System.out.println("Please enter Y or N.");
//                    continue;
//                }
//                if(exitString.equals("y")){
//                    exit = true;
//                    flag = true;
//                }else if(exitString.equals("n")){
//                    exit = false;
//                    flag = true;
//                }else{
//                    System.out.println("Please enter Y or N.");
//                }
//            }
//        }








//        double[] a =  new double[10];
//
//         for ( int index = 0; index < a.length; index++)
//            if (a[index] > a[index + 1])
//                System.out.println("Array elements " + index + " and " + (index + 1) + " are out of order.");
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        //testcode for pizza class
//        Pizza testPizza1 = new Pizza("Small");
//        Pizza testPizza2 = new Pizza("medium",1,1);
//        Pizza testPizza3 = new Pizza("Large",2,1,1);
//
//        StringBuilder tests = new StringBuilder();
//        String result1 = testPizza1.calcCost() == 10.0 ? "Pass" : "Fail";
//        String result2 = testPizza2.calcCost() == 16.0 ? "Pass" : "Fail";
//        String result3 = testPizza3.calcCost() == 22.0 ? "Pass" : "Fail";
//        tests.append("\nTest 1: ");
//        tests.append(result1);
//        tests.append(" Cost: ");
//        tests.append(testPizza1.calcCost());
//        tests.append("\nTest 2: ");
//        tests.append(result2);
//        tests.append(" Cost: ");
//        tests.append(testPizza2.calcCost());
//        tests.append("\nTest 3: ");
//        tests.append(result3);
//        tests.append(" Cost: ");
//        tests.append(testPizza3.calcCost());
//
//        System.out.println(tests.toString());
//
//        PizzaOrder order = new PizzaOrder();
//
//        for(int i = 0; i < 5; i++){
//            Pizza pizza = new Pizza();
//            boolean isValid = false;
//
//            while (!isValid) {
//                try {
//                    System.out.println("\n\n What size pizza would you like?(small, medium,large): ");
//                    pizza.setSize(reader.readLine());
//                }catch(Exception e){
//                    System.out.println("Exception: " + e);
//                    continue;
//                }
//                try {
//                    System.out.println("\nPlease enter number of cheese toppings(0-10): ");
//                    pizza.setNumCheeseToppings(Integer.parseInt(reader.readLine()));
//                }catch(Exception e){
//                    System.out.println("Exception: " + e);
//                    continue;
//                }
//                try {
//                    System.out.println("\nPlease enter number of ham toppings(0-10): ");
//                    pizza.setNumHamToppings(Integer.parseInt(reader.readLine()));
//                }catch(Exception e){
//                    System.out.println("Exception: " + e);
//                    continue;
//                }
//                try {
//                    System.out.println("\nPlease enter number of pepperoni toppings(0-10): ");
//                    pizza.setNumPepperoniToppings(Integer.parseInt(reader.readLine()));
//                }catch(Exception e){
//                    System.out.println("Exception: " + e);
//                    continue;
//                }
//                isValid = true;
//            }
//            order.addPizza(pizza);
//        }
//
//        System.out.println(order.toString());




    }
}
