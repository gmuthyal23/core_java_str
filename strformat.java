import java.sql.SQLOutput;

public class strformat {
    public static void main(String[] args) {
        String a="test";
        String b="completed";
        String c="%s this is a test project %s";
        System.out.println(String.format(c,a,b));

        //System.out.println(String.format("%s this is a project %s",a,b));
    }
}
