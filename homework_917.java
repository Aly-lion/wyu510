package fiveday;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class homework_917 {
	public static void main(String[] args) throws IOException {
		/**
		 * ʹ���ļ���������ȡԭ�ļ���ʹ���ļ�����������ļ���д
		 * ʹ�ÿ��д��ʽ��ԭ�ļ�����д�뵽���ļ���ɸ��Ʋ���
		 */
		FileInputStream fis=new FileInputStream("D:\\myfile.txt");
		FileOutputStream fos=new FileOutputStream("D:\\myfile_cp.txt");
		byte[] data=new byte[1024*10];
		int len=-1;
		while((len=fis.read(data))!=-1){
			fos.write(data,0,len);
		}
		System.out.println("�������");
		fis.close();
		fos.close();
		
	}
}