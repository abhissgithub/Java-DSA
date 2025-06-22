import java.util.ArrayList;
import java.util.List;

public class Scuba {

    static int[][] matrix;
    static int n;
    static int oxygenCapacity;
    static List<Pair<String, Integer>> paths;
    static final int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public static List<Pair<String, Integer>> findPaths(int[][] mat, int size, int oxygen) {
        matrix = mat;
        n = size;
        oxygenCapacity = oxygen;
        paths = new ArrayList<>();
        dfs(0, 0, "", oxygenCapacity);
        return paths;
    }

    public static boolean isValidMove(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n && matrix[x][y] != 0;
    }

    public static void dfs(int x, int y, String path, int oxygen) {
        if (matrix[x][y] == 9) {
            oxygen = oxygenCapacity;
        }
        oxygen -= matrix[x][y];

        if (oxygen < 0) {
            return;
        }

        if ((x == n - 1 && (y == n - 1 || y == 0)) && oxygen >= 0) {
            paths.add(new Pair<>(path, oxygen));
            return;
        }

        matrix[x][y] = 0; // mark visited

        for (int[] dir : directions) {
            int nx = x + dir[0];
            int ny = y + dir[1];
            if (isValidMove(nx, ny)) {
                dfs(nx, ny, path + getDirection(dir), oxygen);
            }
        }

        matrix[x][y] = 1; // backtrack
    }

    public static String getDirection(int[] dir) {
        if (dir[0] == 0 && dir[1] == 1) {
            return "R";
        } else if (dir[0] == 1 && dir[1] == 0) {
            return "D";
        } else if (dir[0] == 0 && dir[1] == -1) {
            return "L";
        } else {
            return "U";
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                {3, 5, 6, 1},
                {4, 0, 9, 3},
                {8, 7, 6, 0},
                {9, 5, 5, 4}
        };
        int size = 4;
        int oxygen = 35;
        List<Pair<String, Integer>> result = findPaths(mat, size, oxygen);
        if (result.isEmpty()) {
            System.out.println("No path available to reach the destination");
        } else {
            System.out.println("The available paths are");
            for (Pair<String, Integer> pair : result) {
                System.out.println(pair.getKey());
            }
            System.out.println("The feasible paths with remaining oxygen levels are");
            for (Pair<String, Integer> pair : result) {
                System.out.println(pair.getKey() + ", " + pair.getValue());
            }
        }
    }
}

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}