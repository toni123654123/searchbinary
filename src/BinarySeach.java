public class BinarySeach {
    public static int binarySeach(int[] list, int key) {

        int low = 0;
        int hight = list.length - 1;

        while (hight >= low) {
            int mid = (low + hight) / 2;
            if (key < list[mid]) {
                hight = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
