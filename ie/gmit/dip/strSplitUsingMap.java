package ie.gmit.dip;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class strSplitUsingMap {
    public static void strsplit(String str)
    {
        int count;
        HashMap<String,Integer> map= new LinkedHashMap<String,Integer>();
        String[] str1= str.split("\\W");

            for (String word :str1)
            {
                if(map.containsKey(word))
                {
                    map.put(word,map.get(word));

                }
                else map.put(word,1);
            }
            for(Map.Entry<String,Integer> entry: map.entrySet())
            {
                if(entry.getValue()==1)
                {
                    System.out.println(entry.getKey());
                }
            }
        }
public static void main(String args[])
{
    String str34="Hello This is JAva program JAva";
    strsplit (str34);
}
    }

