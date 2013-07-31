import java.util.List;
import java.util.ArrayList;

public class B03 {
    public static void main(String[] args) {
		int from = 101;
		int to = 1000;
	    List<Integer> shuixians = getShuixian(from, to);
		for(int shuixian : shuixians) {
		    System.out.println(shuixian);
		}
	}

	public static List<Integer> getShuixian(int from, int to) {
	    List<Integer> shuixians = new ArrayList<Integer>();
		for(int i = from; i < to; i++) {
		    if(isShuixian(i)) {
			    shuixians.add(i);
			}
		}
		return shuixians;

	} 

	public static boolean isShuixian(int num) {
		int ge3 = getGe3(num);
		int shi3 = getShi3(num);
		int bai3 = getBai3(num);
	    if(ge3 + shi3 + bai3 == num) {
		    return true;
		}
		return false;
	}

	public static int getGe3(int num) {
		int ge = num % 10;
	    return ge * ge * ge;
	}

	public static int getShi3(int num) {
	    int shi = num % 100 / 10;
		return shi * shi * shi;
	}

	public static int getBai3(int num) {
	    int bai = num / 100;
		return bai * bai * bai;
	}
}
