package fourday;

import java.io.File;

public class Test1 {
public static void main(String[] args)  {
	
		String file="D:\\vmware";
		String[] list=new File(file).list();
		System.out.println("����ļ���");
		for (String str : list) {
			
			System.out.println(file+str);
		}
	}

}

