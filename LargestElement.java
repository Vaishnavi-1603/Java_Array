public class LargestElement {
    public static void main(String args[]){
        int arr[] = {100, 130, 150, 200, 80, 95, 66};
        int largest = arr[0];

        for (int i = 1; i<arr.length; i++) {
            if (arr[i]>largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest element in the array is: " + largest);
    }
}