class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        boolean oneBit = false;
        Stack<Integer> stack = new Stack<>();
        for(int n:bits){
            if(n == 0){
                if(!stack.empty()){
                    oneBit = false;
                    stack.pop();
                }
                else{
                    oneBit = true;
                }
            }
            //n == 1
            else{
                if(!stack.empty()){
                    oneBit = false;
                    stack.pop();
                }
                else{
                   stack.push(n); 
                }
            }
        }
        return oneBit;
    }
}