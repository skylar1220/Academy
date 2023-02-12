package lesson8;

public class Cal1 {
	public Cal1() {
	}

	public static void getResult(int type, int[] result, int... a) {
		int total = 0;
		
		
		if (type == 1) {
			for (int data : a) {
				total += data;
			}
		} 
		else if (type == 2) {
			for (int data : a) {
				total -= data;
			}
		} 
		else if (type == 3) {
			for (int data : a) {
				total *= data;
			}
		} 
		else if (type == 4) {
			for (int data : a) {
				total /= data;
			}
		} 
		
		System.out.println(total);
		
	}
	
	
}
