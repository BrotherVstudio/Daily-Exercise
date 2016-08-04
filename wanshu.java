/**
 * 一个数如果恰好等于它的因子和，该数被称作“完数”。例如，6的因子为1,2,3、
 * ，6=1+2+3，因此6是完数。编程序找出1到2000以内的所有的完数。
 * 按照如下格式输出：例如6--->1,2,3
 * */
package exam01;

public class Client01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=1;i<2000;i++){
			if(isWanshu(i)){
				System.out.print(i+"--->");
				for(int j=0;j<getYinziNumber(i)-1;j++){
					System.out.print(getYinzi(i)[j]+",");
				}
				System.out.println(getYinzi(i)[getYinziNumber(i)-1]);
			}
		}
		

	}
	
	/**
	 *方法描述：判断任何一个正整数是否是完数
	 *@return boolean 是，true，否，false 
	 * */
	public static boolean isWanshu(int n){
		boolean flag=false;
		int sum=0;
		for(int i=0;i<getYinziNumber(n);i++){
			sum+=getYinzi(n)[i];
		}
		if(sum==n){
		flag=true;	
		}
		return flag;
	}
    
	/**
	 * 方法描述：求任何一个正整数的因子，存储在数组当中
	 * */
	public static int[] getYinzi(int n){
		int[] yinzi=new int[getYinziNumber(n)];
		int index=0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				yinzi[index++]=i;
			}
		}
		return yinzi;
	}
	
	public static int getYinziNumber(int n){
		int count=0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				count++;
			}
		}
		return count;
	}
}
