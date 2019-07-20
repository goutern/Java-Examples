public class ExamplesInClass {

    public static void main(String[] args)
    {
        //Student
        Student.run();

        //Shapes
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("square", 100, 130);
        Shape shape3 = new Shape(shape2);

        //Student Competition
        Competition spring2018 = new Competition("Spring 2018", "Dragons", "Cobras", 2018);
        Competition fall2018 = new Competition("Fall 2018", "Dragons", "Unicorns", 2018);
        Team dragons = new Team("Dragons", "Max", "Rob" , "Rich", "Nick", spring2018, fall2018);
        dragons.print();
    }
}
