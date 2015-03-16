import java.util.HashMap;

public class Solution {
	public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int size = numbers.length;
		for(int i=0; i<size; i++){
			map.put(numbers[i], i);
		}
		int[] result = new int[2];
		for(int i=0; i<size; i++){
			int rest = target-numbers[i];
			if(map.get(rest) != null){
				result[0] = i+1;
				result[1] = map.get(rest)+1;
				break;
			}
		}
		return result;
	}
}
