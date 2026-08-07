class Solution {
    public String reverseWords(String s) {
       String[] c=s.trim().split("\\s+");
        StringBuilder w=new StringBuilder();
        for(int i=c.length-1;i>=0;i--){
            w.append(c[i]);
            if(i!=0){
                w.append(" ");
            }

        }
        return w.toString();
        
    }
}