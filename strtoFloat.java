public class strtoFloat {
    public static void main(String[] args) {
        String str= "test";

        try {
            Float ft = Float.parseFloat(str);
            System.out.println(ft);


        } catch (NumberFormatException e) {
            System.out.println("cannot be converted");
            e.printStackTrace();
        }
    }
}
