public class Student {

    private int studentID;
    private String major;
    private String room;

    public static void run() {
        Student student1 = new Student();
        student1.setStudentID(1234567);
        student1.setMajor("CS");

        Student student2 = new Student();
        student2.setStudentID(12345678);
        student2.setMajor("EE");

        Student student3 = new Student(123, "CH");
        Student student4 = new Student(1234, "MAT", "CS108");
//        System.out.println(max(1,5));
//        System.out.println(max(10,2));
//        System.out.println(max(15f, 20f));
//        System.out.println(max(25f, 7f));

    }

    public Student() {
        this(0);
    }

    public Student(int studentID) {
        this(studentID, "Unknown");
    }

    public Student(int studentID, String major) {
        this(studentID, major, "Unknown");
    }

    public Student(int studentID, String major, String room) {
        this.studentID = studentID;
        this.major = major;
        this.room = room;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public static int max(int a, int b){
        return (a > b)? a:b;
    }
    public static float max(float a, float b){
        return (a > b)? a:b;
    }

}
