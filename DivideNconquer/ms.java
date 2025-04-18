
public class ms {
    // yaha se hmne simple array print kra liya hhh,,,
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // kaam
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // LEFT PART
        mergeSort(arr, mid + 1, ei); // RIGHT PART
        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // ITERATOR FOR LEFT PART
        int j = mid + 1; // ITERATOR FOR RIGHT PART
        int k = 0; // ITERATOR FOR TEMP ARR

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;

        }
        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // COPY TEMP TO ORIGINAL ARR
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void maain(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8, };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

}