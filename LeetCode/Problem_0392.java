class Problem_0392 {
    public boolean isSubsequence(String s, String t) {
        
     if(s.length()==0){
          return true;
     }
        
  int idx = 0;
  for(int i=0; i<t.length(); i++){
    if(t.charAt(i) == s.charAt(idx)){
        idx++;
    }
    if(idx >= s.length()){
        return true;
    }  
  }
  return false;       
}
}


//Alternate Solution



class Solution1 {
    public boolean isSubsequence(String s, String t) {

        if (s.length() == 0) {
            return true;
        }

        int p1 = 0;
        int p2 = 0;

        while (p1 < t.length() || p2 < s.length()) {
            if (p1 >= t.length()) {
                return false;
            }
            if (p2 >= s.length()) {
                return true;
            }

            int v1 = t.charAt(p1);
            int v2 = s.charAt(p2);

            if (v1 == v2) {
                p1++;
                p2++;
            } else {
                p1++;
            }
        }
        return true;
    }
}





