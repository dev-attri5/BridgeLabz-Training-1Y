public class loops {
    public static void main(String[] args) {
        
        System.out.println("For Loop (0 to 4):");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        
        
        System.out.println("\nWhile Loop (0 to 4):");
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }
        
        
        System.out.println("\nDo-While Loop (0 to 4):");
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 5);
        
        
        System.out.println("\nFor-Each Loop:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
