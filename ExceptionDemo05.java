/**
 * 
 */
package ex01;

/**
 * @author BrotherV
 *
 */
public class ExceptionDemo05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************start************");
		int i=10;
		int j=2;
		try{
			String str1=args[5];
			String str2=args[5];
			i=Integer.parseInt(str1);
			j=Integer.parseInt(str2);
			int temp= i/j;
			System.out.println("console:"+temp);
			System.out.println("*****************************");
		}
		catch (ArithmeticException e){
			System.out.println("unusual:"+e);
		}
		System.out.println("console");
	}

}
