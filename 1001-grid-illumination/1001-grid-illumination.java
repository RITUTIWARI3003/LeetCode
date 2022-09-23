class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        HashMap<Integer, Integer> rows = new HashMap<>();
        HashMap<Integer, Integer> cols = new HashMap<>();
        HashMap<Integer, Integer> major = new HashMap<>();
        HashMap<Integer, Integer> minor = new HashMap<>();
        HashSet<Integer> lampCells = new HashSet<>();
 
        // initialise above arrays based on lamps
        for (int i = 0; i < lamps.length; i++) {
            int r = lamps[i][0];
            int c = lamps[i][1];
            if (lampCells.contains(r * n + c)) {
                continue;
            }
            rows.put(r, rows.getOrDefault(r, 0) + 1);
            cols.put(c, cols.getOrDefault(c, 0) + 1);
 
            int majorKey = r - c + n - 1;
            major.put(majorKey, major.getOrDefault(majorKey, 0) + 1);
 
            int minorKey = r + c;
            minor.put(minorKey, minor.getOrDefault(minorKey, 0) + 1);
 
            lampCells.add(r * n + c);
        }
 
        int[] results = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int r = queries[i][0];
            int c = queries[i][1];
            int minorKey = r + c;
            int majorKey = r - c + n - 1;
            if (rows.getOrDefault(r, 0) > 0 ||
                cols.getOrDefault(c, 0) > 0 ||
                major.getOrDefault(majorKey, 0) > 0 ||
                minor.getOrDefault(minorKey, 0) > 0) {
 
                results[i] = 1;
                // check its neighbours
                int row_min = Math.max(0, r - 1);
                int row_max = Math.min(n, r + 2);
                int col_min = Math.max(0, c - 1);
                int col_max = Math.min(n, c + 2);
                for (int k = row_min; k < row_max; k++) {
                    for (int l = col_min; l < col_max; l++) {
                        if (lampCells.contains(k * n + l)) {
                            if (rows.containsKey(k)) {
                                rows.put(k, rows.get(k) - 1);
                            }
                            if (cols.containsKey(l)) {
                                cols.put(l, cols.get(l) - 1);
                            }
 
                            int majorK = k - l + n - 1;
                            major.put(majorK, major.get(majorK) - 1);
 
                            int minorK = k + l;
                            minor.put(minorK, minor.get(minorK) - 1);
 
                            lampCells.remove(k * n + l);
                        }
                    }
                }
            }
        }
        return results;
    }
 
}