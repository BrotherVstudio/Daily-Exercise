/**
 * һ�������ǡ�õ����������Ӻͣ������������������������磬6������Ϊ1,2,3��
 * ��6=1+2+3�����6��������������ҳ�1��2000���ڵ����е�������
 * �������¸�ʽ���������6--->1,2,3
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
	 *�����������ж��κ�һ���������Ƿ�������
	 *@return boolean �ǣ�true����false 
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
	 * �������������κ�һ�������������ӣ��洢�����鵱��
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
