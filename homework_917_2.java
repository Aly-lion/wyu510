package fiveday;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
 
   //使用缓冲流实现复制
public class homework_917_2 {
    public static void main(String[] args)throws  Exception {
        //  创建流
        BufferedInputStream  fio=new BufferedInputStream(new FileInputStream("D:\\myfile.txt"));     // 指定要复制文件的路径
        BufferedOutputStream fis=new BufferedOutputStream(new FileOutputStream("D:\\myfile_cp2.txt"));   // 指定要复制到哪个文件的路径

        // 读写
        byte[] buf=new byte[1024];
        int len =-1;
        while ((len=fio.read(buf))!=-1){
            fis.write(buf, 0, len);
            fis.flush();
        }

        //关闭流
        fis.close();
        fio.close();
        System.out.println("复制成功！");

    }
}
