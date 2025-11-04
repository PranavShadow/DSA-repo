package Kadane_Algorithm;
public class BestSightseeingPair1014 {

    public int maxScoreSightseeingPair(int[] values) {
        int res = 0;
        int iContri = values[0]; // values[i] + i

        for (int j = 1; j < values.length; j++) {
            int jContri = values[j] - j; // values[j] - j

            // Update result if current pair gives a better score
            res = Math.max(res, iContri + jContri);

            // Update best i contribution for future pairs
            iContri = Math.max(iContri, values[j] + j);
        }
        return res;
    }

    // Example to test
    public static void main(String[] args) {
        BestSightseeingPair1014 obj = new BestSightseeingPair1014();
        int[] values = {8, 1, 5, 2, 6};
        System.out.println(obj.maxScoreSightseeingPair(values)); // Output: 11
    }
}
