import java.util.List;


public class Solution {
	public int maxArea(List<Integer> height) {
		int left = 0;
		int right = height.size()-1;
		int max = 0;
		int lower = 0;
		
		while(left < right){
			if(height.get(left) < height.get(right)){
				lower = height.get(left);
				max = Math.max(max, (right-left)*lower);
				left++;
				while(height.get(left) < lower && left < right){
					left++;
				}
			}else{
				lower = height.get(right);
				max = Math.max(max, (right-left)*lower);
				right--;
				while(height.get(right) < lower && left < right){
					right--;
				}
			}
		}
		
		return max;
	}
}
