package ie.gmit.dip;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Main {


        public  static void str(String st)
        {
            int count;
            String [] str=st.split("\\W");
            for(int i=0;i<str.length;i++)
            {
                count=1;
                for(int j=i+1;j<str.length;j++)
                {
                    if(str[i].equalsIgnoreCase(str[j]))
                    {
                        count++;
                        str[j]="";

                    }
                }
                if(count==1 && str[i] !="")
                {
                    System.out.println(str[i]);
                }
            }
        }



    public static void main(String[] args) {
	// write your code here
String str23="This is JAva program new JAva";
str(str23);
    }
}
