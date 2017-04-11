package big_number_minus_link_list;

public class BigNumberMinus {
	public static void main(String args[]) {
		String num1 = "12";
		String num2 = "";
		
		//make sure num1 is larger
		if (num1.length() < num2.length()) {
			String tmp = num1;
			num1 = num2;
			num2 = tmp;
		}

		LinkNode inputNode1 = new LinkNode(0);
		LinkNode tmpNode1 = inputNode1;
		for (int i = num1.length() - 1; i > -1; i--) {
			tmpNode1.next = new LinkNode(num1.charAt(i) - 48);
			tmpNode1 = tmpNode1.next;
		}	
		
		LinkNode inputNode2 = new LinkNode(0);
		LinkNode tmpNode2 = inputNode2;
		for (int i = num2.length() - 1; i > -1; i--) {
			tmpNode2.next = new LinkNode(num2.charAt(i) - 48);
			tmpNode2 = tmpNode2.next;
		}
		
		int back = 0;
		tmpNode1 = inputNode1.next;
		tmpNode2 = inputNode2.next;
		while(tmpNode1 != null && tmpNode2 != null) {
			if (tmpNode1.val < tmpNode2.val && tmpNode1.next != null) {
				back = 10;
				tmpNode1.next.val--;
			}
			
			tmpNode1.val = (tmpNode1.val + back) - tmpNode2.val;
			
			tmpNode1 = tmpNode1.next;
			tmpNode2 = tmpNode2.next;
		}
		
		tmpNode1 = inputNode1.next;
		while(tmpNode1 != null) {
			System.out.print(tmpNode1.val);
			tmpNode1 = tmpNode1.next;
		}
	}
}
