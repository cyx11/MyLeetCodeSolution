
public class Solution {
	public String intToRoman(int num) {
		
		String[] thousand = {"","M","MM","MMM"};
		String[] hundred = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String[] ten = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] one = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		
		int temp = num;
		String ans = "";
		int thousands = temp / 1000;
		ans = ans + thousand[thousands];		
		temp = temp % 1000;
		
		int hundreds = temp / 100;
		ans = ans + hundred[hundreds];		
		temp = temp % 100;
		
		int tens = temp / 10;
		ans = ans + ten[tens];
		temp = temp % 10;
		
		int ones = temp;
		ans = ans + one[ones];
		
		return ans;
	}
}
