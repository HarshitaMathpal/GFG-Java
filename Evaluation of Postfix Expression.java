class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<S.length();i++){
            String a = S.charAt(i)+"";
                if(a.equals("+")){
                    st.push(st.pop() + st.pop());
                } 
                else if(a.equals("-")){
                    st.push(-1*st.pop() + st.pop());
                }
                else if(a.equals("*")){
                    st.push(st.pop() * st.pop());
                }
                else if(a.equals("/")){
                    int x = st.pop();
                    int y = st.pop();
                    st.push(y/x);
                }
                else{
                    st.push(Integer.parseInt(S.charAt(i)+""));
                }
	        }
	    return st.pop();
    }
}
