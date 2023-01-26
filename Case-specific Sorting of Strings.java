class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
        // Your code here
        char[] upper = new char[str.length()];
        char[] lower = new char[str.length()];
        
        String ans = "";
        int j=0,k=0;
        
        for(char c: str.toCharArray()) {
            if(c>='A' && c<='Z') {
                upper[j++]=c;
            }
            else
                lower[k++] = c;
        }
        
        Arrays.sort(upper,0,j);
        Arrays.sort(lower,0,k);
        
        StringBuffer sb = new StringBuffer();
        j=0;k=0;
        for(char c:str.toCharArray()){
            // char c = str.charAt(i);
            if(c>='A' && c<='Z') {
                sb.append(upper[j++]);
            }
            else
                sb.append(lower[k++]);
        }
        
        return sb.toString();
    }
}
