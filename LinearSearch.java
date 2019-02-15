public class LinearSearch implements Practice03Search{
    @Override
    public String searchName() {
        return "Linear-Search";
    }

    @Override
    public int search(int[] arr, int target) {
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
}
