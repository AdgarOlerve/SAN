
class euler
{
    static public void main(String[] args)
    {
        int a=0,b=1,c=0,suma=0,fib_max=4_000_000;

        do
        {
            c=a+b;
            if((c%2)==0)
            {
                suma+=c;
            }
            a=b;
            b=c;
        }
        while(c<=fib_max);
        System.out.println("Suma: "+suma);

    }

}