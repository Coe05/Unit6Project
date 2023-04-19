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

        //remove 0 0 
        int u = Mon1.size(); 
        int v = Mon2.size(); 
        Mon1.remove(u-1); 
        Mon2.remove(v-1); 

        System.out.println("Here is your first Arraylist");
        for(int q = 0; q<Mon1.size(); q++)
        {
            
            System.out.print(Mon1.get(q).toString());
            if (q + 1 != Mon1.size())
            {
                System.out.print("+");
            }
        }
        System.out.println();
        System.out.println("Here is your second Arraylist");

        for(int w = 0; w<Mon2.size(); w++)
        {
            System.out.print(Mon2.get(w).toString());
            if (w + 1 != Mon2.size())
            {
                System.out.print("+");
            }
                
        }

        System.out.println(); 
        bubble(Mon1); 
        bubble(Mon2); 

        System.out.println("Here are your two polynomials: ");
        for(int q = 0; q<Mon1.size(); q++)
        {
            
            System.out.print(Mon1.get(q).toString());
            if (q + 1 != Mon1.size())
            {
                System.out.print("+");
            }
        }
        System.out.println(); 
        for(int w = 0; w<Mon2.size(); w++)
        {
            System.out.print(Mon2.get(w).toString());
            if (w + 1 != Mon2.size())
            {
                System.out.print("+");
            }
                
        }
        System.out.println();
        
        
        System.out.println("Here is their product:"); 
        ArrayList<Term> product = multiplyLists(Mon1, Mon2);
        for(int n = 0; n<product.size(); n++)
        {
            if (product.get(n).getCoefficent() != 0)
                System.out.print(product.get(n).toString());
            if (n + 1 != product.size())
                System.out.print("+");
        }
        System.out.println();
        System.out.println("Here is their sum:"); 
        ArrayList<Term> Sum = Sum(Mon1, Mon2);
        bubble(Sum);
        
        for(int n = 0; n<Sum.size(); n++)
        {
            if (Sum.get(n).getCoefficent() != 0)
                System.out.print(Sum.get(n).toString());
            if (n + 1 != Sum.size())
                System.out.print("+");
        }
        
       
    }

    public static void bubble(ArrayList<Term> list)
    {
        for(int x = 0; x<list.size(); x++)
        {
            boolean flag = true; 
            for(int y = 0; y<list.size()-1-x; y++)
            {
                if(list.get(y).getExponent()<list.get(y+1).getExponent())
                {
                    Term temp = list.remove(y); 
                    list.add(y+1, temp); 
                    flag = false;
                }
                if(flag)
                {
                    break;
                }
            }
        }
    }

    public static ArrayList<Term> Sum(ArrayList<Term> list1, ArrayList<Term> list2) 
    {
        ArrayList<Term> result = new ArrayList<Term>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) 
        {
            if (list1.get(i).getExponent() == list2.get(j).getExponent()) 
            {
                int sum = list1.get(i).getCoefficent() + list2.get(j).getCoefficent();
                if (sum != 0) {
                    result.add(new Term(sum, list1.get(i).getExponent()));
                }
                i++;
                j++;
            } 
            else if (list1.get(i).getExponent() > list2.get(j).getExponent()) 
            {
                result.add(list1.get(i));
                i++;
            } 
            else 
            
            {
                result.add(list2.get(j));
                j++;
            }
        }
        while (i < list1.size()) 
        {
            result.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) 
        {
            result.add(list2.get(j));
            j++;
        }
        return result;
    }

    public static ArrayList<Term> multiplyLists(ArrayList<Term> list1, ArrayList<Term> list2) 
    {
        ArrayList<Term> result = new ArrayList<>();
        for (Term t1 : list1) 
        {
            for (Term t2 : list2) 
            {
                int c = t1.getCoefficent() * t2.getCoefficent();
                int e = t1.getExponent() + t2.getExponent();
                Term term = new Term(c, e);
                result.add(term);
            }
        }
        combineLikeTerms(result);
        return result;
    }

    public static void combineLikeTerms(ArrayList<Term> list) 
    {
        for (int i = 0; i < list.size(); i++) 
        {
            for (int j = i + 1; j < list.size(); j++) 
            {
                if (list.get(i).getExponent() == list.get(j).getExponent()) 
                {
                    int sum = list.get(i).getCoefficent() + list.get(j).getCoefficent();
                    if (sum != 0) 
                    {
                        list.get(i).setCoefficent(sum);
                        list.remove(j);
                        j--;
                    } 
                    else 
                    {
                        list.remove(j);
                        j--;
                        list.remove(i);
                        i--;
                    }
                }
            }
        }
    }
}

