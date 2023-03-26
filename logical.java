class logical
{
    public static void main(String args[])
    {
        int a = 2;
        int b = 9;
        int x = 4;
        int y = 5;
        boolean q = a>b && x<y;
        boolean w = a<b && x>y;
        boolean e = a>b || x<y;
        boolean r = a<b || x>y;
        boolean t = a>b && x<y;
        boolean u = a<b && x>y;
        boolean i = a>b || x<y;
        boolean o = a<b || x>y;
        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
        System.out.println(!t);
        System.out.println(!u);
        System.out.println(!i);
        System.out.println(!o);
    }
}