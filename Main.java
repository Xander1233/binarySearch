public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 7, 8, 10, 11, 13, 14, 16, 19 };

        int left = 0,
            right = array.length - 1,
            expectedResult = 7;

        boolean hasFound = false;

        while (left <= right && !hasFound) {
            int mid = (int) Math.floor((left + right) >> 1);
            if (array[mid] < expectedResult)
                left = mid + 1;
            else if (array[mid] > expectedResult)
                right = mid - 1;
            else
                hasFound = true;
        }

        System.out.println(hasFound);
    }
}
