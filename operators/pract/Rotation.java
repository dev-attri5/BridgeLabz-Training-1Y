public class Rotation {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        int d = 3;

        for (int i = 0; i < d; i++) {

            int first = arr[0];

            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[n - 1] = first;
        }

        System.out.print("Array after left rotation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}