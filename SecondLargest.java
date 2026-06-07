public class SecondLargest {
    public static void main(String[] args) {
        
        int[] arr = {100, 130, 150, 200, 80, 96};
        
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println(second);
    }
}