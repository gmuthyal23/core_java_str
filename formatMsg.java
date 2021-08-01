import java.text.MessageFormat;

public class formatMsg {
    public static void main(String[] args) {
        String s= "telugu";
        String t="User";
        System.out.println(MessageFormat.format("this is a story {0}, of a new Type {1},",s,t));
    }
}
