public class PrimeNumberInArrayAcseOrder {

    public static void main(String[] args) {
        InputAndPrint ip = new InputAndPrint();
        int arr[] = ip.input();
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        int p = 0;
        int np[] = new int[6];
        int pr[] = new int[6];
        for (int i = 0; i < arr.length; i++) {
            int prime = 1;
            for (int j = 2; j <= arr[i] / 2; j++) {
                if (arr[i] % j == 0) {
                    prime++;
                }
            }

            if (prime == 1) {
                pr[p] = arr[i];
                p++;
            } else {
                for (int j = 0; j < 6; j++) {
                    np[i] = arr[i];
                }
            }
        }
        for (int i = 0; i < pr.length; i++) {
            if (np[i] != 0) {
                for (int j = 0; j < pr.length; j++) {
                    if (pr[j] == 0) {
                        pr[j] = np[i];
                        break;
                    }
                }
            }

        }
        ip.printArray(pr);

    }

}
//5 2 1 4 3 9
