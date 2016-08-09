/**
 * 
 */
package ex01;

/**
 * @author BrotherV
 *
 */
public class Unusual {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************calculating starting*****************");
		int i=10;
		int j=0;
		try{
			int temp=i/j;
			System.out.println("xiangchu wei:"+temp);
			System.out.println("--------------------------------------------------");
		}
		catch (ArithmeticException e){
			System.out.println("unusual was happend:"+e);
		}
		System.out.println("*******************conclusion*********************");
	}

}
