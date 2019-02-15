public class BinaryIterativeSearch implements Practice03Search{
    @Override
    public String searchName() {
        return "Binary-Iterative";
    }

    @Override
    public int search(int[] arr, int target) {
        return search(target, arr, 0, arr.length-1);
    }

    static int search(int searches, int[] array, int start, int end){

        while (start <= end) {
            int middle = (start + end) / 2;
            if (searches < array[middle]) {
                end = middle - 1;
            }

            if (searches > array[middle]) {
                start = middle + 1;
            }

            if (searches == array[middle]) {
                return middle;
            }
        }
        return -1;

    }
}
