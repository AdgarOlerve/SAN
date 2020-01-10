//program liczy sumę parzystych liczb ciągu fibonaciego nie przekraczających 'fib_max'
class euler
{
    static public void main(String[] args)
    {
        int a=0,b=1,c=0,suma=0,fib_max=4_000_000;

        while(c<=fib_max)
        {
            c=a+b;
            if((c%2)==0)
            {
                suma+=c;
            }
            a=b;
            b=c;
        }
    System.out.println("Suma: "+suma);
    }

}