import java.util.List;
import java.util.ArrayList;

public class B02 {
    public static void main(String[] args) {
		int from = 101;
		int to = 200;
	    List<Integer> sushus = getSushu(from, to);
		for(Integer sushu : sushus) {
		    System.out.println(sushu);
		}
		System.out.println("sushu has: " + sushus.size());
	}

	public static List<Integer> getSushu(int from, int to) {
		List<Integer> sushus = new ArrayList<Integer>();
	    for(int i = from; i < to; i++) {
		    if(isSushu(i)) {
			    sushus.add(i);
			}
		}
		return sushus;
	}

	public static boolean isSushu(int num) {
	    for(int i = 2; i <= Math.sqrt(num); i++) {
		    if(num % i == 0) {
			    return false;
			}
		}    
		return true;
	}
}
