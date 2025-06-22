//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    static List<List<String>> allPaths = new ArrayList<>();
//    static int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
//    static String[] directionSymbols = {"R", "D", "L", "U"};
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt(); // Size of the matrix
//        int[][] matrix = new int[n][n]; // Create the matrix
//
//        // Input matrix values
//        for (int i = 0; i < n; ++i) {
//            for (int j = 0; j < n; ++j) {
//                matrix[i][j] = scanner.nextInt();
//            }
//        }
//
//        int oxygenCapacity = scanner.nextInt(); // Oxygen capacity
//
//        // Find paths
//        findPaths(matrix, n, oxygenCapacity, 0, 0, oxygenCapacity, "");
//
//        // Output
//        if (allPaths.isEmpty()) {
//            System.out.println("No path available to reach the destination");
//        } else {
//            System.out.println("The available paths are");
//            for (List<String> path : allPaths) {
//                System.out.println(String.join("", path));
//            }
//            List<String> feasiblePaths = new ArrayList<>();
//            List<Integer> remainingOxygenLevels = new ArrayList<>();
//            for (List<String> path : allPaths) {
//                int oxygen = oxygenCapacity;
//                for (String direction : path) {
//                    int dirIndex = indexOf(directionSymbols, direction);
//                    if (dirIndex != -1) {
//                        int[] dir = directions[dirIndex];
//                        int dx = dir[0];
//                        int dy = dir[1];
//                        int x = dx + 0;
//                        int y = dy + 0;
//                        oxygen -= matrix[x][y];
//                        if (oxygen < 0) break;
//                        if (matrix[x][y] == 9) oxygen = oxygenCapacity;
//                    }
//                }
//                if (oxygen >= 0) {
//                    feasiblePaths.add(String.join("", path));
//                    remainingOxygenLevels.add(oxygen);
//                }
//            }
//            if (feasiblePaths.isEmpty()) {
//                System.out.println("No feasible path");
//            } else {
//                System.out.println("The feasible paths with remaining oxygen levels are");
//                for (int i = 0; i < feasiblePaths.size(); ++i) {
//                    System.out.println(feasiblePaths.get(i) + ", " + remainingOxygenLevels.get(i));
//                }
//            }
//        }
//    }
//
//    static void findPaths(int[][] matrix, int n, int oxygenCapacity, int x, int y, int oxygen, String path) {
//        if (matrix[x][y] == 9) {
//            oxygen = oxygenCapacity;
//        }
//        oxygen -= matrix[x][y];
//        if (oxygen < 0) {
//            return;
//        }
//
//        if (x == n - 1 && (y == n - 1 || y == 0)) {
//            if (oxygen >= 0) {
//                List<String> newPath = new ArrayList<>(List.of(path.split("")));
//                allPaths.add(newPath);
//            }
//            return;
//        }
//
//        matrix[x][y] = 0; // mark visited
//        for (int[] direction : directions) {
//            int dx = direction[0];
//            int dy = direction[1];
//            int nx = x + dx;
//            int ny = y + dy;
//            if (is_valid_move(nx, ny, n, matrix)) {
//                findPaths(matrix, n, oxygenCapacity, nx, ny, oxygen, path + directionSymbols[indexOf(directions, direction)]);
//            }
//        }
//        matrix[x][y] = 1; // backtrack
//    }
//
//    static boolean is_valid_move(int x, int y, int n, int[][] matrix) {
//        return 0 <= x && x < n && 0 <= y && y < n && matrix[x][y] != 0;
//    }
//
//    static int indexOf(String[] arr, String target) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}
