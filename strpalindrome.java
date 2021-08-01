public class strpalindrome {
    public static boolean check(String st)
    {
        int sz= st.length();
        for( int i=0;i<sz/2;i++)
        {
            if(st.charAt(i) !=st.charAt(sz-i-1))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count=0;
        String s= "this is a new this is a new program program";
        for ( int j=0; j<s.length();j++)
        {
            for(int k=j;k<s.length();k++) {
                String str1 = s.substring(j, k + 1);

                //String str1= str1.substring()
                if (check(str1)) ;
                count++;
            }
        }
        System.out.println("Total Palindrome"+ count);
    }

}
