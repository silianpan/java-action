import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Test {

	public static void main(String[] args) {
		
		// 创建一个file
		String pathname = "C:" + File.separator + "test.txt";
		File f = new File(pathname);
		
		// 创建输出流对象
		try {
			FileOutputStream fo = new FileOutputStream(f, true);
			String str = "zhangsan";
			byte[] bytes = str.getBytes();
			fo.write(bytes, 3, 2);
			fo.close();
			System.out.println("写入文件完毕！");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		// 创建输入流对象
		try {
			FileInputStream fi = new FileInputStream(f);
			byte[] bytes = new byte[256];
			// 读方法
			fi.read(bytes, 5, 3);
			fi.close();
			
			String str = new String(bytes);
			System.out.println(str);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
