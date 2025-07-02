class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
        Integer[] indices = new Integer[n];

        for(int i=0;i<n;i++){// Create an array of indexes 0...n-1.
            indices[i] = i;
        }

        Arrays.sort(indices, (a,b) -> score[b] - score[a]);// Sort indices based on score values in descending order.

        for(int i=0;i<n;i++){// Assign medals and ranks.
        if(i == 0){
            result[indices[i]] = "Gold Medal";
        }else if(i == 1){
            result[indices[i]] = "Silver Medal";
        }else if(i == 2){
            result[indices[i]] = "Bronze Medal";
        }else{
            result[indices[i]] = String.valueOf(i+1);
        }
        
        }
        return result;
    }
    }

