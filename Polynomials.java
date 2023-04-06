/*
 * Write a program that asks the user to input two polynomials as coefficient and
exponent pairs. The user should be able to enter the terms in any order. Once the data
has been input, the program should print out the two original polynomials in descending
order and print out their sum and product(also in descending order). Here is a sample. 
 */
import java.util.*; 
public class Polynomials
{
    public static void main (String [] args)
    {
        Scanner reader = new Scanner(System.in);

        ArrayList<Term> Mon1 = new ArrayList<Term>();
        ArrayList<Term> Mon2 = new ArrayList<Term>();
        int x = 0; 
        int y = 0; 

        System.out.println("Enter 0 0 to stop."); 
        do{
            x = reader.nextInt(); 
            y = reader.nextInt();
            Term z = new Term(x,y);
            Mon1.add(z);
        }while(x != 0 & y != 0);
        System.out.println("Enter 0 0 to stop."); 
        do{
            x = reader.nextInt(); 
            y = reader.nextInt();
            Term z = new Term(x,y);
            Mon2.add(z);
        }while(x != 0 & y != 0);

        System.out.println(Mon1);
        for(int q = 0; q<Mon1.size(); q++)
        {
            System.out.print(Mon1.get(q) + " + "); 
        }
        sort(Mon1);

    }
    public static void sum(ArrayList<Term> list)
    {
        
    }
    public static void sort(ArrayList<Term> list)
    {
        for(int x = 0; x<list.size(); x++)
        {
            boolean flag = true;
            for(int y = 0; y<list.size()-1-x; y++)
            {
                if(list.getExponent(y) > list.getExponent(y+1))
                {
                    int temp = list.remove(y); 
                    list.add(y+1, temp); 
                    flag = false;
                }
            }
        }
    }

}
