package fourday;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Test917pm {
	public static void main(String[] args) throws Exception{
		String value = "���\n";
		String value2 = "hello\n";
		// ���ļ���д������
		File file = new File("D:\\tools\\233.txt");
		PrintWriter pw = new PrintWriter(file,"UTF-8");
		pw.write(value);
		pw.write(value2);
		pw.close();
		// ���ļ��ж�ȡ����
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream("D:\\tools\\233.txt"),"utf-8"));
		String b;
		while((b = br.readLine())!=null){	
			System.out.println(b);
		}
		br.close();
	}
}
