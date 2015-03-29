public class Solution {

	public String convert(String s, int nRows) {
		String sol = "";
		int length = s.length();
		int next =0;
		//如果行数为0，直接输出
		if(nRows == 1) return s;
		//如果行数不为0
		for(int row=0; row < nRows; row++){
			//输出第一行
			if(row == 0){
				for(int i=0; i < length; i += 2*nRows-2)
					sol = sol + s.charAt(i);
			}else if(row == nRows-1){ //输出最后一行
				for(int j=nRows-1; j < length; j += 2*nRows-2)
					sol = sol + s.charAt(j);
			}else{ //输出中间行
				for(int pos=row; pos < length; pos += 2*nRows-2){
					sol = sol + s.charAt(pos);
					next = pos+2*nRows-2-2*row;
					if(next < length)
						sol = sol + s.charAt(next);
				}
			}
		}

		return sol;
	}
}