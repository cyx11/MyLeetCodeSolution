public class Solution2{
	public String longestCommonPrefix(String[] strs){
		if (strs == null || strs.length == 0) {
        	return "";
        }else if (strs.length == 1) {
        	return strs[0];
        }
        int j = -1;
        boolean cont = true;
        while(cont){
        	j++;
        	for (int i = 0; i < strs.length; i++) {
        		if (j >= strs[i].length()){
        			cont = false;
        			break;
        		}
        		if (i != 0 && strs[i].charAt(j) != strs[i-1].charAt(j)) {
        			cont = false;
        			break;
        		}   			
        	}
        }
        return strs[0].substring(0,j);
	}
}