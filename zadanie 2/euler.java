public class euler
{
    public static void main(String[] args)
    {
         int a_min=100;
         int a_max=999;
        int x=a_min;
        int y=a_min;
        int z=0;
        int pal_max=0;

        while(x<=a_max)
        {
           while(y<=a_max)
           {
               z=x*y;
               String str_z="";
               String reversed="";

               str_z=Integer.toString(z);
               reversed=rev(str_z);

               if(str_z.equalsIgnoreCase(reversed))
               {
                   pal_max=z;
               }
               y+=1;
           }
            y=a_min;
           x+=1;
        }
        System.out.println("najwiekszy palindrom: "+ pal_max);
    }
    public static String rev(String str)//odwraca kolejnosc w stringu
    {
        String out="";
        for(int i=(str.length()-1);i>=0;i-=1)
        {
            out=out+str.charAt(i);
        }
        return out;
    }
}
