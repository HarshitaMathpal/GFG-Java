class Solution{
    static ArrayList<ArrayList<String>> displayContacts(int n, 
                                        String contact[], String s)
    {
        // code here
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            String temp = s.substring(0,i+1);
            ArrayList<String> al = new ArrayList<>();
            for(int j=0;j<contact.length;j++){
                
                if(contact[j].startsWith(temp)){
                    if(!al.contains(contact[j]))
                    al.add(contact[j]);
                }
            }
            if(al.isEmpty())
                al.add("0");
            Collections.sort(al);
            ans.add(al);
        }
        return ans;
    }
}
