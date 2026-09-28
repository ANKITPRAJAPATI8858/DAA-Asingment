class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int maxDepth = 0;
        for(char ch : s.toCharArray()){
            if(ch =='('){
                max++;
                maxDepth = Math.max(max,maxDepth);
            }
            else if(ch == ')'){
                max--;
            }

        }
        return maxDepth;
    }
}