public class BinaryRecursiveSearch implements Practice03Search {

    @Override
    public String searchName() {
        return  "Binary-Recursive";
    }

    @Override
    public int search(int[] arr, int target) {
        return search(target, arr, 0, arr.length -1);
    }
    public int search(int searches, int[] array, int start, int end){
        int middle = (start + end)/2;
        if(end < start){
            return -1;
        }

        if (searches < array[middle]){
            return search(searches, array, start, middle - 1);
        }

        if (searches > array[middle]){
            return search(searches, array, middle + 1, end);
        }

        if (searches == array[middle]){
            return middle;
        }

        return -1;
    }
}
