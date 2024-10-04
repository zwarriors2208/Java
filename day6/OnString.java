package day6;

import java.util.Locale;

public class OnString {
    public String operateOnString(stings a, String b)
    {
        return a.raa(b);
    }

public String reverse(String s)
{
    String rev="";
    for(int i =s.length()-1;i>=0;i--)
    {
        rev+=s.charAt(i);
    }
    return rev;
}
    public static void main(String[] args) {
        String a = "asAHSDFdklfjh tun";
        OnString onString = new OnString();
        String b = onString.operateOnString((s)->s.toUpperCase(),a);
        System.out.println(b);
        String reverse = onString.operateOnString((s)->
        {
            char[] c= s.toCharArray();
            int l = c.length;
            int right = l-1;
            int left = 0;
            while(left < right)
            {
                char temp = c[left];
//                System.out.println(temp);
                c[left]=c[right];
//                System.out.println(c[right]);
                c[right]=temp;
                left++;
                right--;
            }
//            System.out.println(s);
            s = new String(c);
            return s;
        }, a);
        System.out.println(reverse);

        /*
        Method reference:
        For static use classname::methodname
        For instance methods us obj::methodname
         */
        String upper;
        upper= onString.operateOnString(String::toUpperCase, "Lambda");
        reverse= onString.operateOnString(onString::reverse, "Lambda");
        b = onString.operateOnString(String::toLowerCase, "heLLLLLLo");
        System.out.println(b);
//        b = onString.operateOnString(String::replace, "heLLLLLLo");

    }
}
