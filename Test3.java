package fourday;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test3 {
public static void main(String[] args) throws IOException{
	File file = new File("C:/GBA/IO");//�����ļ�
	file.mkdirs();
	File f = new File(file,"test3.txt");
	f.createNewFile();//����txt
	Reader input=new FileReader(f);

}
}
