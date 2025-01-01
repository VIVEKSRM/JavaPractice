package javaPracticle;

import org.apache.maven.shared.utils.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;

public class findVowels {
    @Test
    public void findVowelsInString()
    {
        String str="My name is vivek ranjan";
        str=str.toUpperCase();
        char[] ch=str.toCharArray();
        HashSet<Character> hs=new HashSet<Character>();
            for (int i=0; i<ch.length-1; i++)
                if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u' ||
                        ch[i]=='A' || ch[i]=='E' || ch[i]=='I'|| ch[i]=='O'|| ch[i]=='U')
                {
                    hs.add(ch[i]);
                }
        System.out.println(hs);
    }

    @Test
    public void AssertTest() {
        String str = "test";
        System.out.println(StringUtils.isNumeric(str));
        Assert.assertTrue(str.equalsIgnoreCase("test"), "in assertTrue");
        Assert.assertFalse(str.equalsIgnoreCase("test1"), "in assertFalse");
    }
}
