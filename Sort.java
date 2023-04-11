/*
 * Write a program that modifies the Selection Sort and the Binary Search to work on an
ArrayList of integers. Your program should have methods for each of those tasks as well
as a main method that tests these methods. 
 */
import java.util.*;
public class Sort
{
    public static void main (String [] args)
    {
        Random randy = new Random(); 
        ArrayList<Integer> Binary = new ArrayList(); 
        for(int x = 0; x<100; x++)
        {
            int r = randy.nextInt(101); 
            Binary.add(r);
        }
        
        SelectionSort(Binary);
        
        System.out.println("dd");
        
    }
    //Selection Sort
    public static void SelectionSort(ArrayList<Integer> list)
    {
        for(int i = 0; i<list.size()-1; i++)
        {
            int p = findsmall(list, i);
            int temp = list.get(i);
            temp = list.get(p);
            
            
        }
        /*
        for(int i = 0; i<data.length-1; i++)
        {
            int p = findsmall(data, i);
            int temp = data[i];
            data[i] = data[p];
            data[p] = temp; 
        }
         */
    }
    public static int findsmall(ArrayList<Integer> list, int spot)
    {
        int small = list.get(spot);
        int p = spot;
        for(int x = spot; x<list.size(); x++)
        {
            if(list.get(x) < small)
            {
                small = list.get(x);
                p = x;
            }
        }
        return p;
    }
    
    //Binary Sort
    
}
