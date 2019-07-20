import java.util.Objects;

public class Vehicle {
    private String name;
    private int numCylinders;
    private Person owner;

    public Vehicle(){

    }

    public Vehicle(String name, int numCylinders, Person owner) {
        this.name = name;
        this.numCylinders = numCylinders;
        this.owner = owner;
    }

    public Vehicle(Vehicle vehicle){
        this.name = vehicle.getName();
        this.numCylinders = vehicle.getNumCylinders();
        this.owner = vehicle.getOwner();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumCylinders() {
        return numCylinders;
    }

    public void setNumCylinders(int numCylinders) {
        this.numCylinders = numCylinders;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return numCylinders == vehicle.numCylinders &&
                Objects.equals(name, vehicle.name) &&
                Objects.equals(owner, vehicle.owner);
    }

    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", numCylinders=" + numCylinders +
                ", owner=" + owner +
                '}';
    }
}
