public class Truck extends Vehicle {
    double loadCapacity;//in tons
    int towingCapacity;//in pounds

    public Truck(){} //default constructor

    public Truck(String name, int numCylinders, Person owner, double loadCapacity, int towingCapacity) {
        super(name, numCylinders, owner);
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return Double.compare(truck.loadCapacity, loadCapacity) == 0 &&
                towingCapacity == truck.towingCapacity;
    }

    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                ", towingCapacity=" + towingCapacity +
                '}' + super.toString();
    }
}
