package fourday;

import java.io.File;

public class Test2 {
	private static void func(File file) {
        File[] fs = file.listFiles();
        for (File f : fs) {
            if (f.isDirectory())    //����Ŀ¼����ݹ��ӡ��Ŀ¼�µ��ļ�
                func(f);
            if (f.isFile())        //�����ļ���ֱ�Ӵ�ӡ
                System.out.println(f);
            System.out.println("\r\n");
        }
    }
    public static void main(String[] args) {
        String inputPath = "D:\\qqpcmgr_docpro";;		//Ҫ������·��
        File file = new File(inputPath);		//��ȡ��file����
        func(file);
    }
    }
