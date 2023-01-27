package level0.safezone;

import java.util.Arrays;

public class Solution {

    public int[][] dengerZone(int[][] board, int x, int y) {
        for (int j = Math.max(0, y - 1); j <= Math.min(board.length - 1, y + 1); j++)
            for (int i = Math.max(0, x - 1); i <= Math.min(board.length - 1, x + 1); i++)
                board[j][i] = board[j][i] == 0 ? 2 : board[j][i];

        return board;
    }

    public int solution(int[][] board) {
        for (int y = 0; y < board.length; y++)
            for (int x = 0; x < board.length; x++)
                if (board[y][x] == 1)
                    board = dengerZone(board, x, y);

        return Arrays.stream(board).flatMapToInt(Arrays::stream).map(bordValue -> bordValue == 0 ? 1 : 0).sum();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[][] {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}));
        System.out.println(new Solution().solution(new int[][] {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}}));
        System.out.println(new Solution().solution(new int[][] {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}}));
    }
}
