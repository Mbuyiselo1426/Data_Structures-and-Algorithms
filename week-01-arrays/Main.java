public class Main {

    public static void main(String[] args) {

        // Finding the maximum number inside the array
        int[] data = {5, 10, 7, 130};

        // Initialize with the first element
        int findingTheLargest = data[0];

        // Iterate through the array
        for (int num : data) {

            // Compare the current number with the largest
            if (num > findingTheLargest) {

                // Update the largest number
                findingTheLargest = num;
            }
        }

        // Print the largest number
        System.out.println(findingTheLargest);
    }
}