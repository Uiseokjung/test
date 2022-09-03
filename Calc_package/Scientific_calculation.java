package Calc_package;

public class Scientific_calculation 
{
    private double a;
    public double log(String s)
    {
        a=Double.parseDouble(s);
        return(Math.log(a)/Math.log(10));
    }
    public double ln(String s)
    {
        a=Double.parseDouble(s);
        return(Math.log(a)/Math.log(2));
    }
    public double exp(String s)
    {
        a=Double.parseDouble(s);
        return(Math.exp(a));
    }
    public double onebyx(String s)
    {
        a=Double.parseDouble(s);
        return(1/a);
    }
    public double asin(String s)
    {
        a=Double.parseDouble(s);
        return (Math.asin(a));
    }
    public double sin(String s)
    {
        a=Double.parseDouble(s);
        return (Math.sin(a));
    }
    public double acos(String s)
    {
        a=Double.parseDouble(s);
        return(Math.acos(a));
    }
    public double cos(String s)
    {
        a=Double.parseDouble(s);
        return(Math.cos(a));
    }
    public double atan(String s)
    {
        a=Double.parseDouble(s);
        return(Math.atan(a));
    }
    public double tan(String s)
    {
        a=Double.parseDouble(s);
        return(Math.tan(a));
    }
    public double acosec(String s)
    {
        a=Double.parseDouble(s);
        return(Math.asin(1/a));
    }
    public double cosec(String s)
    {
        a=Double.parseDouble(s);
        return(1/Math.sin(a));
    }
    public double asec(String s)
    {
        a=Double.parseDouble(s);
        return(Math.acos(1/a));
    }
    public double sec(String s)
    {
        a=Double.parseDouble(s);
        return(1/Math.cos(a));
    }
    public double acot(String s)
    {
        a=Double.parseDouble(s);
        return(Math.atan(1/a));
    }
    public double cot(String s)
    {
        a=Double.parseDouble(s);
        return(1/Math.tan(a));
    }
    public double fact(String s)
    {
        double ans=1;
        int num=Integer.parseInt(s);
        for(int i=1;i<=num;i++)
        {
            ans*=i;
        }
        return(ans);
    }
}