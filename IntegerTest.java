// IntegerTest -- sorts 25 random integers and produces a sum and average of the list
// CSIS 312 - D01

// Importing Java Utilities
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class IntegerTest
{
    public static void main(String[] args)
    {
        System.out.println("Brandon Johnson - Assignment 5");
        Random random = new Random();

        LinkedList<Integer> list1 = new LinkedList<>();

        // for loop determines amount of integers returned
        for (int i = 0; i < 25; i++)
        {
            // takes a random number from 1 to 100
            int number = random.nextInt(101);
            list1.add(number);

        }

        // Prints line without sorting list
        System.out.println("Unsorted list: ");
        System.out.println(list1);

        // Prints line sorting from lowest to highest
        Collections.sort(list1);
        System.out.println("Sorted List: ");
        System.out.println(list1);

        // Sums integers listed
        int sum = 0;
        for (Integer number : list1) {
            sum += number;
        }

        // Averages integers listed
        float average = (float) sum / list1.size();
        System.out.println("The Sum is: " + sum);
        System.out.println("The Average is: " + average);
    }
}

