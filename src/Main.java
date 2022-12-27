public class Main {
    public static void main(String[] args) {

        search(new int[]{1, 6}, 3);

    }

    private static int search(int[] data, int target){
        int low, high, middle;

        low = 0;
        high = data.length - 1;

        while(low <= high) {
            middle = (int)(low + high) / 2;
            if(data[middle] < target){
                low = middle;
            }else if(data[middle] > target){
                high = middle;
            }else{
                return middle;
            }
        }

        return -1;
    }
}