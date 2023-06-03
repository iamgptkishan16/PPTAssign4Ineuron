//<aside>
//[5--]You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase **may be** incomplete.
//
//Given the integer n, return *the number of **complete rows** of the staircase you will build*.
//
//</aside>

public class Staircase {
    public static int arrangeCoins(int n) {
        int completeRows = 0;

        int currentRow = 1;
        while (n >= currentRow) {
            n -= currentRow;
            completeRows++;
            currentRow++;
        }

        return completeRows;
    }

    public static void main(String[] args) {
        int n = 5;
        int completeRows = arrangeCoins(n);
        System.out.println("Number of Complete Rows: " + completeRows);
    }
}
