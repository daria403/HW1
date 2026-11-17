public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }

        int n = m.length;

        int[] dist = new int[n];
        for (int x = 0; x < n; x++) {
            dist[x] = -1;
        }

        int[] queue = new int[n];
        int head = 0;
        int tail = 0;

        dist[i] = 0;
        queue[tail++] = i;

        while (head < tail) {
            int curr = queue[head++];

            if (curr == j) {
                return dist[curr];
            }

            for (int v = 0; v < n; v++) {
                if (m[curr][v] == 1 && dist[v] == -1) {
                    dist[v] = dist[curr] + 1;
                    queue[tail++] = v;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}