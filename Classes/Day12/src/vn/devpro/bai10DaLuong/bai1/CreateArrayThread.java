package vn.devpro.bai10DaLuong.bai1;

public class CreateArrayThread extends Thread {
	public static int[] arr = new int[50];
	private int startIndex;
	private int step; // 4 or 7
	
	public CreateArrayThread(int startIndex, int step) {

		this.startIndex = startIndex;
		this.step = step;
	}

	public static void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	@Override
	public void run() {
		int value = step;
		for (int i = startIndex ; i < arr.length; i += 2) {
			arr[i] = value; 
			value += step;
			System.out.println("arr[" + i + "] = " + value);
		}		
	}
}
