
public class Solution {

	public int romanToInt(String s) {
		if(s.equals("")) return 0;
		int num = 0;
		for(int i=0; i<s.length(); i++){
			if(i == s.length()-1){
				return num + toNum(s.charAt(i));
			}//如果遍历到罗马数字最后一位
			if(toNum(s.charAt(i)) >= toNum(s.charAt(i+1))){
				num += toNum(s.charAt(i));
			}else if(toNum(s.charAt(i)) < toNum(s.charAt(i+1))){
				num -= toNum(s.charAt(i));
			}
		}
		return num;
	}

	private int toNum(char c){
		switch(c){
		 case 'I': return 1;  
         case 'V': return 5;  
         case 'X': return 10;  
         case 'L': return 50;  
         case 'C': return 100;  
         case 'D': return 500;  
         case 'M': return 1000; 
		}
		return 0;
	}
}
