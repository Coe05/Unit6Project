
public class Term
{
    private int Coefficent, Exponent; 
    public Term(int a, int b)
    {
        Coefficent = a; 
        Exponent = b; 
    }

    public int getCoefficent()
    {
        return Coefficent;
    }

    public int getExponent()
    {
        return Exponent; 
    }

    public void setCoefficent(int a)
    {
        Coefficent = a;
    }

      public String toString ()
    {
        if (Exponent == 0)
            return " " + Coefficent + " ";
        else if (Exponent == 0 && Coefficent == 0 || Coefficent == 0)
            return "";
        else
            return " " + Coefficent + "x^" + Exponent + " ";
    }
}
