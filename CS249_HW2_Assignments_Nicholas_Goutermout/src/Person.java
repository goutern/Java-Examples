import java.util.Objects;

public class Person
{
    private String name;
    public Person()  {
    }
    public Person(String theName)    {
        this.name = theName;
    }
    public Person(Person theObject)   {
        this.name = theObject.getName();
    }
    public String getName()    {
        return this.name;
    }
    public void setName(String theName)   {
        this.name = theName;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}