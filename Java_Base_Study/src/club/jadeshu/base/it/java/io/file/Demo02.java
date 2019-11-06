package club.jadeshu.base.it.java.io.file;

import java.io.File;

/**
 * @author jadeshu  QQ:70381915
 * @version V1.0
 * @data:2018-10-30 ����5:18:12
 * File ����·��  ���·��
 */
public class Demo02 {

	public static void main(String[] args) {
		
		String pathName = ".";
		String fileName = "2.txt";
		
		File f = new File(pathName, fileName);
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());	//��������
		
		System.out.println(f.getParent());	//�����ϼ�Ŀ¼����ʱ����null
		System.out.println(f.getParentFile());
	
		 
		System.out.println(f.isAbsolute());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.isHidden());	//�Ƿ��������ļ�
		
		System.out.println("================");
		// �ж���Ϣ
		System.out.println(f.exists());

		// �ļ�����
		System.out.println(f.length());
	}

}
