class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        
        int currentEnd = Integer.MIN_VALUE;
        int longestChain = 0;
        
        for (int[] pair : pairs) {
            if (currentEnd < pair[0]) {
                currentEnd = pair[1];
                longestChain++;
            }
        }
        
        return longestChain;
    }
    }
