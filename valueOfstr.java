public class valueOfstr {

    public static float vos(String s)
    {
        return Float.valueOf(s);

    }


    public static void main(String[] args) {
        String str="100";
        float ft;
        ft=vos(str);
        System.out.println(ft);

    }
}
