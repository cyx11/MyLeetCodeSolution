
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		boolean flag = false;//是否进位
		ListNode result = new ListNode(0);
		ListNode nextNode = result;
		while(l1!=null || l2!=null){
			if(l1 == null){
				nextNode.val = flag?(l2.val+1):l2.val;
				if(nextNode.val >= 10){
					nextNode.val -= 10;
					flag = true;
				}else{
					flag = false;
				}
				l2 = l2.next;
				if(l2 == null) continue;
				nextNode.next = new ListNode(0);
				nextNode = nextNode.next;
				continue;
			}
			if(l2 == null){
				nextNode.val = flag?(l1.val+1):l1.val;
				if(nextNode.val >= 10){
					nextNode.val -= 10;
					flag = true;
				}else{
					flag = false;
				}
				l1 = l1.next;
				if(l1 == null) continue;
				nextNode.next = new ListNode(0);
				nextNode = nextNode.next;
				continue;
			}
			nextNode.val = flag?(l1.val+l2.val+1):(l1.val+l2.val);
			if(nextNode.val >= 10){
				nextNode.val -= 10;
				flag = true;
			}else{
				flag = false;
			}
			l1 = l1.next;
			l2 = l2.next;
			if(l1 == null && l2 == null) continue;
			nextNode.next = new ListNode(0);
			nextNode = nextNode.next;
		}
		return result;
	}
}
