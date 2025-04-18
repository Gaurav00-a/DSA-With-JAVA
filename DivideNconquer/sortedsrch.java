//SEARCH IN SORTED ARRAY;;;

public class sortedsrch {

    public static int search(int arr[], int tar, int si, int ei) {

        // BASE CONDITION
        if (si > ei) {
            return -1;
        }

        int mid = (si + ei) / 2;

        // CASE FOUND:
        if (arr[mid] == tar) {
            return mid;
        }

        // MID ON LINE 1
        if (arr[si] <= arr[mid]) {
            // CASE A LEFT:
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                // CASE B : RIGTH
                return search(arr, tar, mid + 1, ei);
            }
        }

        else {
            // CASE C : RIGHT ;
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                // CASE d : left ;;
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0; // output is 4;;
        int targetIndex = search(arr, target, 0, arr.length - 1);
        System.out.println(targetIndex);

    }

}
