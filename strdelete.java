public class strdelete {
    public static void str(String s, String word){
        String[] s1= s.split("\\W");
        String s3=" ";
        for( String s2: s1){
            if(!s2.equals(word))
            {
                s3 +=s2 + " ";
            }
        }
        System.out.println( s3);

    }

    public static void main(String[] args) {
        String s4= "This is gopi program";
        String s5="gopi";
        str(s4,s5);

    }
}
