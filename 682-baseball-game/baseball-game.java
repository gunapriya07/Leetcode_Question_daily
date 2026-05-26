class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String ch : operations){
            if(ch.equals("+")){
                int top = stack.pop();
                int newvalue = top+stack.peek();
                stack.push(top);
                stack.push(newvalue);
            }else if (ch.equals("D")){
                stack.push(2*stack.peek());
            }else if(ch.equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.parseInt(ch));
            }
        }
        int sum = 0;
        for(int num : stack){
            sum +=num;
        }
        return sum;
        
    }
}