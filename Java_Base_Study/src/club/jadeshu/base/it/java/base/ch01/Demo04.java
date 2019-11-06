package club.jadeshu.base.it.java.base.ch01;

/**
 * @author jadeshu QQ:70381915
 * @version V1.0
 * @data:2016-11-14 ����12:33:46 
 * ��˵��
 * �ָ��ַ�  ����plit()  <һ>
 * ���취 
 */
public class Demo04 {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "��ͤ�� �ŵ��� ���ݱ����� ���� �������� Ϧ��ɽ��ɽ 1212 2323 444";
		System.out.println(str);
		int len = str.length();
		int nCount = 0;
		String strTmp = "";
		String strTmpEnd = "";
		int index = 1;
		int lastIndex = str.lastIndexOf(" ");

		/**
		 * ѭ�������ո�ʹ�ӡ�ո�ǰ�ַ�
		 * CountΪ�������������ո�֮����ȡ�ո�������
		 * ע�����һ���ո�����(����ַ��޿ո�ʱ����-1������ȡ��)
		 */
		/*while (nCount < len) {
			index = str.indexOf(" ", nCount);
			strTmp = str.substring(nCount, index);
			System.out.println(strTmp);
			nCount = index;
			nCount++;
			if (index == lastIndex) {
				strTmp = str.substring(index + 1);
				System.out.println(strTmp);
				break;
			}
		}*/
		
		
		/**
		 * ѭ����ȡ��һ���ո�Ȼ����ʾ�ַ�
		 * �ڰѵ�һ���ո��������ַ�����   
		 * ע�����һ���ո�����(����ַ��޿ո�ʱ����-1������ȡ��)
		 */
		strTmpEnd = str;
		while(index > 0){
			index = strTmpEnd.indexOf(" ", 0);	
			if (index == -1){
				System.out.println(strTmpEnd);
				break;
			}
			strTmp = strTmpEnd.substring(0, index);
			System.out.println(strTmp);
			strTmpEnd = strTmpEnd.substring(index+1);
		}
	}

}
