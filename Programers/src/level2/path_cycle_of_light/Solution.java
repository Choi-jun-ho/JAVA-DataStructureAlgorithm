package level2.path_cycle_of_light;


import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public boolean[][][] pass;
    public ArrayList<Integer> result = new ArrayList<>();
    public String[] grid;
    public int[][] direction = {{0, -1}, {1, 0}, {0, 1}, {-1, 0}};

    public void toPassArray(int x, int y, int d) {
        if (pass[y][x][d])
            return;

        int[] xy = {x, y};
        int num = 0;
        while (!pass[xy[1]][xy[0]][d]) {
            pass[xy[1]][xy[0]][d] = true;
            char type = grid[xy[1]].charAt(xy[0]);
            int[] max = {grid[0].length(), grid.length};

            if (type == 'R')
                d = (d + 1) % 4;
            else if (type == 'L')
                d = (d + 3) % 4;

            int i = direction[d][0] != 0 ? 0 : 1;

            xy[i] += direction[d][i];
            if (xy[i] == -1)
                xy[i] = max[i] - 1;
            else if (xy[i] == max[i])
                xy[i] = 0;

            num++;
        }
        result.add(num);
    }

    public int[] solution(String[] grid) {
        this.grid = grid;
        this.pass = new boolean[grid.length][grid[0].length()][4];

        for (int y = 0; y < grid.length; y++)
            for (int x = 0; x < grid[0].length(); x++)
                for (int d = 0; d < 4; d++)
                    toPassArray(x, y, d);

        return result.stream().mapToInt(i->i).sorted().toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"SL", "LR"})));
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"S"})));
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"R", "R"})));
        System.out.println('R'-'L');
    }
}
