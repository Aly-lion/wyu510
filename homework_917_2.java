package fiveday;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
 
   //ʹ�û�����ʵ�ָ���
public class homework_917_2 {
    public static void main(String[] args)throws  Exception {
        //  ������
        BufferedInputStream  fio=new BufferedInputStream(new FileInputStream("D:\\myfile.txt"));     // ָ��Ҫ�����ļ���·��
        BufferedOutputStream fis=new BufferedOutputStream(new FileOutputStream("D:\\myfile_cp2.txt"));   // ָ��Ҫ���Ƶ��ĸ��ļ���·��

        // ��д
        byte[] buf=new byte[1024];
        int len =-1;
        while ((len=fio.read(buf))!=-1){
            fis.write(buf, 0, len);
            fis.flush();
        }

        //�ر���
        fis.close();
        fio.close();
        System.out.println("���Ƴɹ���");

    }
}
