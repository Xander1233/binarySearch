public class Main {
    public static void main(String[] args) {

        int[] array = { 1, 3, 5, 7, 8, 10, 11, 13, 14, 16, 19 };

        int startNumber = array.length - 1;

        int expectedResult = 7;

        while (array[startNumber] != expectedResult)
            if (array[startNumber] > expectedResult) startNumber = startNumber >> 1; // Half the startNumber
            else if (array[startNumber] < expectedResult) startNumber += startNumber >> 1; // Add the half of the startNumber to the old startNumber (startNumber = 10; startNumber >> 1 = 5; 10 + 10 >> 1 == 15)

        System.out.println(array[startNumber]); // Print out the result

    }
}
