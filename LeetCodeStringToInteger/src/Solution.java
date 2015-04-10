
public class Solution {
	public int atoi(String str) {
		if(str.equals("")) return 0;
		int flag = 1;
		int start = 0;
		int length = str.length();
		while(start < length){
			if(str.charAt(start) == ' '){
				start++;
			}else break;
		}
		int pos = start;
		if(str.charAt(pos) == '-'){
			flag = -1;
			pos++;
		}else if(str.charAt(pos) == '+'){
			pos++;
		}
		long result = 0;
		long flagResult = 0;
		while(pos < length){
			char c = str.charAt(pos);
			if((c < '0') || (c > '9')){
				break;
			}else{
				result = result*10 + (c -'0');
				flagResult = flag * result;
			}
			if(flagResult < Integer.MIN_VALUE)
				return Integer.MIN_VALUE;
			if(flagResult > Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			pos++;
			System.out.println(flagResult);
		}
		return (int) flagResult;
	}
}
