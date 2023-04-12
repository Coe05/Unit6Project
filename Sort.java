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
        Scanner reader = new Scanner(System.in); 
        ArrayList<Integer> Arra = new ArrayList(); 
        for(int x = 0; x<10; x++)
        {
            Arra.add(randy.nextInt(101));
        }
        
        
        System.out.println(Arra); 
        
        SelectionSort(Arra);
        System.out.println("Selection sort: "); 
        System.out.println(Arra); 
        System.out.println("Binary Search: "); 
        System.out.println("Enter a number that you would like to find");
        int x = reader.nextInt();
        System.out.println(BinarySearch(Arra,x));
        
        
    }
    //Selection Sort
    public static void SelectionSort(ArrayList<Integer> list)
    {
        for(int i = 0; i<list.size()-1; i++)
        {
            int p = findsmall(list, i);
            int temp = list.get(i);
            list.set(i, list.get(p));
            list.set(p,temp); 
        }
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
    //BinarySearch
    public static int BinarySearch(ArrayList<Integer> list, int target)
    {
        int low = 0; 
        int high = list.size()-1;
        int mid; 
        while(low <= high)
        {
            mid = (low+high)/2;
            if(target == list.get(mid))
            {
                return mid;
            }
            else if(target > list.get(mid))
            {
                low = mid + 1; 
            }
            else 
            {
                high = mid - 1; 
            }
            
        }
        return -1; 
    }
    
    
}
