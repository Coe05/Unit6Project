
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
   public String toString()
   {
       return Coefficent + "x^" + Exponent;
   }
}
