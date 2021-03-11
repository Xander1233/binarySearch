import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 7, 8, 10, 11, 13, 14, 16, 19 };

        int result = binarySearch(array, 7);
        System.out.println(result >= 0 ? result : "Not found.");
    }

    public static int binarySearch(int[] array, int n) {
        Arrays.sort(array); // Sort the array. So it is 100% sorted

        int left = 0, // Left side of the array
                right = array.length - 1, // Right side of the array
                mid = 0; // The mid of left and right

        boolean hasFound = false;

        while (left <= right && !hasFound) { // The loop loops while left is smaller or equal to right and hasFound is "false"
            mid = (int) Math.floor((left + right) >> 1); // Bitshift all binaries 1 place to the right (Half the value) from the addition with left and right
            if (array[mid] < n) // Check whether the value inside the array is smaller or
                left = mid + 1; // Set left to mid + 1 value (Because the value in the mid doesn't have a value, so I dont need to check it twice or more)
            else if (array[mid] > n) // bigger than n
                right = mid - 1; // Set right to mid - 1 value (Because the value in the mid doesn't have a value, so I dont need to check it twice or more)
            else // If the value of the array at the index mid isn't smaller or bigger than n, set hasFound to true
                hasFound = true; // Set hasFound to true
        }

        if (hasFound) return mid; // If hasFound is true, return mid
        else return -1; // Otherwise return -1 (Invalid Index) => Nothing found
    }
}
