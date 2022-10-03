class compare
{
    
     static int   max(int a, int b)
       {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    public static void main(String args[])
    {
        int a=-10;
        int b=0;
        int c=50;
        int d=25;
     System.out.println(max(a, max(b, max (c, d))));
}
}
