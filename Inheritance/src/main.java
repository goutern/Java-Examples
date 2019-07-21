public class main {
    public static void main(String[] args){

        Email email1 = new Email("Test Txt", "Nick", "Rich", "Homework");
        Email email2 = new Email("llamas are magic", "Sam", "Steve", "llamas");
        Email email3 = new Email(email2);
        Email email4 = new Email();
        email4.setText("Some fine text");
        email4.setSender("Joe");
        email4.setReceiver("Jim");
        email4.setTitle("An email to text");


        File file1 = new File("This is some file", "usr/home");
        File file2 = new File(file1);
        File file3 = new File();
        file3.setPathname("/var/lib/");
        file3.setText("More text test of alpaca");

        StringBuilder testString = new StringBuilder();
        testString.append("Test Email1: ").append(ContainsKeyword(email1, "Homework"));
        testString.append("\nTest Email2: ").append(ContainsKeyword(email2, "llamas"));
        testString.append("\nTest Email3: ").append(ContainsKeyword(email3, "llamas"));
        testString.append("\nTest Email4: ").append(ContainsKeyword(email4, "Jim"));
        testString.append("\n\nTest File1: ").append(ContainsKeyword(file1, "usr"));
        testString.append("\nTest File2: ").append(ContainsKeyword(file2, "usr"));
        testString.append("\nTest File3: ").append(ContainsKeyword(file3, "alpaca"));

        System.out.println(testString.toString());


    }

    public static boolean ContainsKeyword(Document docObject,String keyword)
    {
        if
        (docObject.toString().indexOf(keyword,0) >= 0)
            return true;
        return false;
    }
}
