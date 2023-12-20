package knapsack;

public class Knapsack {
    public static int maxProof(int n, int capacity, int[] weight, int[] prices) {
        if (n == 0 || capacity == 0) {
            return 0;
        }

        if (weight[n - 1] > capacity) {
            return maxProof(n - 1, capacity, weight, prices);
        } else {
            return Math.max(
                    prices[n - 1] + maxProof(n - 1, capacity - weight[n - 1], weight, prices),
                    maxProof(n - 1, capacity, weight, prices)
            );
        }
    }

    public static void main(String[] args) {
        int[] weight = {5, 2, 10};
        int[] prices = {100, 200, 400};
        int n = 3;
        int capacity = 15;

        int maxProfit = maxProof(n, capacity, weight, prices);
        System.out.println(maxProfit);
    }
}
