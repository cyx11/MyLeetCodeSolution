import java.util.HashMap;


public class Solution {
	public int lengthOfLongestSubstring(String s) {
		int start = 0;
		int max = 1;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0; i<s.length(); i++){
			if(map.get(s.charAt(i)) == null || map.get(s.charAt(i)) == 0){
				map.put(s.charAt(i), 1);
			}else if(map.get(s.charAt(i)) == 1){
				map.put(s.charAt(i), 2);
				while(map.get(s.charAt(start)) != 2){
					map.put(s.charAt(start), 0);
					start++;
				}
				start++;
				map.put(s.charAt(i), 1);
			}
			//test print out
			System.out.println(map.toString());
			if(max < i-start+1)
				max = i-start+1;
		}
		return max;
	}
}
