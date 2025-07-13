public class maxofsubarr2 {
    public static void arr(int n[]) {
        int curr = 0;
        int maxsm = Integer.MIN_VALUE;
        int prefix[] = new int[n.length];

        prefix[0] = n[0];

        // Calculate prefix sum
        for (int i = 1; i < n.length; i++) {
            prefix[i] = prefix[i - 1] + n[i];
        }

        for (int i = 0; i < n.length; i++) {
            for (int j = i; j < n.length; j++) {
                // Calculate sum of subarray using prefix sum
                curr = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];

                // Update maxsm if curr is greater
                if (maxsm < curr) {
                    maxsm = curr;
                }
            }
        }

        System.out.println("max sum = " + maxsm);
    }

    public static void main(String[] args) {
        int n[] = {2, 4, 6, 8, 10, 12};
        arr(n);
    }
}

