public class strbuilder {
    public static void main(String[] args) {
        String s="This is a new Programming Language";
        String t="New Story";
        StringBuilder p = new StringBuilder(s);
        p.append("\ntesting");
        p.append(t);
        p.append(".");

        System.out.println(p);

    }
}
