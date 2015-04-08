public class Solution {
	public int reverse(int x) {
		String s = Integer.toString(x);
		boolean positive = true;

		//判断正负；若为负，去掉符号，positive标记为false
		if(s.startsWith("-")){
			s = s.substring(1);
			positive = false;
		}

		char[] array = s.toCharArray();

		int length = s.length();
		int median = (length-1) / 2;
		char temp;
		for(int i=0; i <= median; i++){
			temp = array[i];
			array[i] = array[length-1-i];
			array[length-1-i] = temp;
		}
		int lastZero = -1;
		for(int j=0; j < length; j++){
			if(array[j] != '0' || length==1) //当遇到第一个非0位，或者只有一位时跳出;
				break;
			lastZero++;
		}
		String reversedString = String.copyValueOf(array);
		int result;
		try{
			result = Integer.parseInt(reversedString.substring(lastZero+1));
		}catch(NumberFormatException e){
			result = 0;
		}
		if(positive==false) result = -result;
		return result;
	}
}