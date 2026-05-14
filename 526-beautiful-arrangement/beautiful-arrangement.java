class Solution {
    int count = 0;
    public int countArrangement(int n) {
        boolean[] used = new boolean[n+1];
        backtracking(n,used,1);
        return count;
    }
    private void backtracking(int n,boolean[] used,int portision){
        if(portision>n){
            count++;
            return;
        }
        for(int i=1;i<=n;i++){
            if(used[i]) continue;
            if(portision%i==0 || i%portision==0){
                used[i] = true;
                backtracking(n,used,portision+1);
                used[i] = false;
            }
            

        }
    }
}