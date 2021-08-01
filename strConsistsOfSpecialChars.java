import com.sun.deploy.security.SelectableSecurityManager;

public class strConsistsOfSpecialChars {

    public static void str(String s) {
        int count=0;
        int a = s.length();
        for (int i = 0; i < a; i++) {
            if (!Character.isDigit(s.charAt(i))
                    && !Character.isLetter(s.charAt(i))
                    && !Character.isWhitespace(s.charAt(i)))
                //if (!Character.isDigit(s.charAt(i))
                //       && !Character.isLetter(s.charAt(i))
                //      && !Character.isWhitespace(s.charAt(i)))
                count++;

        }
        if(count==0)
        System.out.println("No Special characters Found");
        else{
            System.out.println("Special characters found" + count);
        }
    }

    public static void main(String[] args) {
        String s   = "!#$GeeeksforGeeks.Computer.Science.Portal!!";
        str(s);
    }
}
