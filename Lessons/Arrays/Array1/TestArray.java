/*
ARRAYS WITH JAVA

dataType[] arrayRefVar;   // preferred way.
or
dataType arrayRefVar[];  // works but not preferred way.

*/	

/*
Example One:
double[] myList;
*/

/*
You can create an array by using the new operator with the following syntax:
arrayRefVar = new dataType[arraySize];

The above statement does two things:
•It creates an array using new dataType[arraySize].
•It assigns the reference of the newly created array to the variable arrayRefVar.
*/

/*
Declaring an array variable, creating an array, and assigning the reference 
of the array to the variable can be combined in one statement, as shown below:

dataType[] arrayRefVar = new dataType[arraySize];

Alternatively you can create arrays as follows:

dataType[] arrayRefVar = {value0, value1, ..., valuek};
*/

/*
The array elements are accessed through the index. Array indices are 0-based; 
that is, they start from 0 to arrayRefVar.length-1.
*/

/*
Following statement declares an array variable, myList, creates an array 
of 10 elements of double type and assigns its reference to myList -

double[] myList = new double[10];
*/


/*
PROCESSING ARRAYS
When processing array elements, we often use either for loop or foreach loop because 
all of the elements in an array are of the same type and the size of the array is known.
*/


/*
Example
Here is a complete example showing how to create, initialize, and process arrays:

public class TestArray {

   public static void main(String[] args) {
      double[] myList = {1.9, 2.9, 3.4, 3.5};

      // Print all the array elements
      for (int i = 0; i < myList.length; i++) {
         System.out.println(myList[i] + " ");
      }
     
      // Summing all elements
      double total = 0;
      for (int i = 0; i < myList.length; i++) {
         total += myList[i];
      }
      System.out.println("Total is " + total);
      
      // Finding the largest element
      double max = myList[0];
      for (int i = 1; i < myList.length; i++) {
         if (myList[i] > max) max = myList[i];
      }
      System.out.println("Max is " + max);  
   }
}

This will produce the following result:
Output:
1.9
2.9
3.4
3.5
Total is 11.7
Max is 3.5

*/



/*
The foreach Loops
JDK 1.5 introduced a new for loop known as foreach loop or enhanced for loop, which enables you to traverse the complete array sequentially without using an index variable.

Example
The following code displays all the elements in the array myList -

 Live Demo
public class TestArray {

   public static void main(String[] args) {
      double[] myList = {1.9, 2.9, 3.4, 3.5};

      // Print all the array elements
      for (double element: myList) {
         System.out.println(element);
      }
   }
}

This will produce the following result:

Output
1.9
2.9
3.4
3.5
*/


/*
Passing Arrays to Methods
Just as you can pass primitive type values to methods, you can also pass arrays to methods. For example, the following method displays the elements in an int array -

Example
public static void printArray(int[] array) {
   for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
   }
}
You can invoke it by passing an array. For example, the following statement invokes the printArray method to display 3, 1, 2, 6, 4, and 2 -

Example
printArray(new int[]{3, 1, 2, 6, 4, 2});

*/


/*
Returning an Array from a Method
A method may also return an array. For example, the following method returns an array that is the reversal of another array -

Example
public static int[] reverse(int[] list) {
   int[] result = new int[list.length];

   for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
      result[j] = list[i];
   }
   return result;
}

*/









