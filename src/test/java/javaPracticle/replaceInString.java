package javaPracticle;

public class replaceInString {

    public static void main (String args[]){
        //tommorow --> input
        //tomm$row  --> output needed

        //Using Char Array
        String str1="tommorow";
        int count=0;
        char[] ch=str1.toCharArray();
        System.out.println("Using Char Array");
        for (int i=0; i<ch.length ; i++)
        {
            if(ch[i]=='o')
            {
                count++;
                if (count==2)
                {
                    ch[i]='$';
                }
            }
            System.out.print(ch[i]);
        }

        System.out.println();
        // Using String array
        String[] str=str1.split("");
        count = 0;
        System.out.println("Using String Array");
        for( int j = 0;j<str.length; j++){

            if (str[j].equals("o"))
            {
                count ++;
                if (count==2){
                    str[j]="$";
                }
            }
            System.out.print(str[j]);
        }

    }
}
