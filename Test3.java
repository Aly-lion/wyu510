package fourday;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test3 {
public static void main(String[] args) throws IOException{
	File file = new File("C:/GBA/IO");//建立文件
	file.mkdirs();
	File f = new File(file,"test3.txt");
	f.createNewFile();//创建txt
	Reader input=new FileReader(f);

}
}
