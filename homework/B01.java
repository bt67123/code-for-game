public class B01 {
    public static void main(String[] args) {
		int month = 24;
		for(int i = 1; i <= month; i++) {
		    System.out.println("month " + i + " : " + fb(i));
		}
	}

	static int fb(int month) {
		if(month == 1 || month == 2) {
	        return 1; 
		} else {
			return fb(month-1) + fb(month-2);
		}
	}
}
