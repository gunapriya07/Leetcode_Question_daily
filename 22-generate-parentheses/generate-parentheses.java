class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtracking(n,result,0,0,new StringBuilder());
        return result;
    }
    private void backtracking(int n, List<String> result,int open,int close, StringBuilder current){
        if(n*2==current.length()){
           result.add(current.toString());
           return;
        }
        if(open<n){
            current.append("(");
            backtracking(n,result,open+1,close,current);
            current.deleteCharAt(current.length()-1);
        }
        if(close<open){
            current.append(")");
            backtracking(n,result,open,close+1,current);
            current.deleteCharAt(current.length()-1);
        }
    }
}