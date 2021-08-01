import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class strtostrArray {
    public static void main(String[] args) {


        String s = "This is a new Story";
        String[] a = s.split("\\W");
        int k = a.length;
        //System.out.println(k);;
//        for(int i=1;i<a.length;i++)
//        {
//            System.out.println(a[i]);
//        }
        for(String f: a)
        {
            System.out.println(f);
        }
    }

}
