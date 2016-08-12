/**
 * 
 */
package ex01;

/**
 * @author BrotherV
 *
 */
public class ExceptionDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***************start*********************");
		int i=10;
		int j=0;
		try {
			int temp=i/j;
			System.out.println("Console is:"+temp);
			System.out.println("****************************************");
		}
		catch(ArithmeticException e){
			System.out.println("Unusual:"+e);
		}
		System.out.println("*******************end********************");
	}

}
