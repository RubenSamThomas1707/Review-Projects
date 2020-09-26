/*
Name: Ruben Sam Thomas
Net ID: rst180005
 */

import java.util.*;
import java.lang.*;
import java.io.*;

public class GenericList <G extends Comparable<G>>
{
    ArrayList<G> genericArrList = new ArrayList<G>();

        //  Regular Constructor
    GenericList()
    { }

        //  Overloaded Generic list constructor
    GenericList(ArrayList<G> genArrayList)
    {
        this.genericArrList = genArrayList;
    }

        //  Mutator function to add the generic element passed into the function to the generic ArrayList
    public void setList(G genElement)
    {
        this.genericArrList.add(genElement);
    }

        //  Accessor function to retrieve the genericArrayList
    public ArrayList<G> getList()
    {
        return (this.genericArrList);
    }

    //  Function to modify the generic ArrayList using insertion sort
    public void InsertionSort()
    {
        for(int i = 1; i < genericArrList.size(); i++)
        {
                //  Storing the value that has to be sorted
            G value = genericArrList.get(i);

            int j = (i - 1);
            while(j >= 0 && ((genericArrList.get(j).compareTo(value)) > 0))
            {
                genericArrList.set((j + 1), genericArrList.get(j));

                j--;
            }

            genericArrList.set((j + 1), value);

        }
    }

        //  Function to search and element from the ArrayList using BinarySearch
    public boolean BinarySearch(G genElement)
    {
            //  Setting the indexes of needed for the sort
        int smallestIndex = 0;
        int middle = (genericArrList.size() / 2);
        int largestIndex = (genericArrList.size() - 1);
        int counter = 0;

        while((smallestIndex <= largestIndex) && (counter < genericArrList.size() - 1))
        {
                //  Checking to see if the generic element passed in is the same as the middle element in the ArrayList
            if ((genElement.compareTo(genericArrList.get(middle)) == 0))
            {
                return true;
            }

                //  Checking to see if the number is less than the number at the middle of the ArrayList
            else if ((genElement.compareTo(genericArrList.get(middle)) < 0))
            {
                largestIndex = (middle - 1);
                middle = ((smallestIndex + middle) / 2);
            }

            else if((genElement.compareTo(genericArrList.get(middle))) > 0)
            {
                smallestIndex = (middle + 1);
                middle = ((middle + largestIndex) / 2);
            }

            counter++;
        }

        return false;

    }


}
