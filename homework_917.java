package fiveday;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class homework_917 {
	public static void main(String[] args) throws IOException {
		/**
		 * 使用文件输入流读取原文件，使用文件输出流往新文件里写
		 * 使用块读写形式将原文件数据写入到新文件完成复制操作
		 */
		FileInputStream fis=new FileInputStream("D:\\myfile.txt");
		FileOutputStream fos=new FileOutputStream("D:\\myfile_cp.txt");
		byte[] data=new byte[1024*10];
		int len=-1;
		while((len=fis.read(data))!=-1){
			fos.write(data,0,len);
		}
		System.out.println("复制完毕");
		fis.close();
		fos.close();
		
	}
}
