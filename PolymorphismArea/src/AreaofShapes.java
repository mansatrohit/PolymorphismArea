import java.util.*;
public class AreaofShapes {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	            Scanner S = new Scanner(System.in);
	    		System.out.println("Enter The Side Of A Square:");
	            int a1 = S.nextInt();        
	    		Area A = new Area(a1);
	    		System.out.println("Area Of Square Is:" +A.getAreaofSquare());
	    		System.out.println("Enter The length and breadth Of A Rectangle:");
	    		int l1 = S.nextInt();
	    		int b1 = S.nextInt();
	    		Area B = new Area(l1,b1);
	    		System.out.println("Area Of Rectangle Is:" +B.getAreaofRectangle());
		}
}
