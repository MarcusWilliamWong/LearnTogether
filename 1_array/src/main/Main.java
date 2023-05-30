package main;

public class Main {

    public static void main(String[] args) {
        // 704
//        int result = Solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
//        System.out.println(result);

        // 27
//        System.out.println(Solution.removeElement(new int[]{ 0, 1, 2, 2, 3, 0, 4, 2}, 2));

        // 977
        int[] array = Solution.sortedSquares(new int[]{-4, -1, 0, 3, 10});
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
