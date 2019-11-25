import java.io.File;
import java.io.IOException;


public class Test {
	
	// 获取一个目录下的所有文件
	public static void getAllFiles(String dirpath){
		// 创建文件对象
		File file = new File(dirpath);
		// 1. 判断dirpath是否存在
		if ( !file.exists() ){
			System.out.println("目录不存在！请重新输入");
			return ;
		}
		
		// 2. 判断是否是目录
		if ( file.isDirectory() ){
			// 获取目录下所有文件
			File[] files = file.listFiles();
			for ( int i = 0; i < files.length; i++ ){
				File f = files[i];
				// 递归调用
				getAllFiles(f.getPath());
			}
			
		}else{ // 如果是文件，就直接打印
			System.out.println(file);
		}
	}

	public static void operFile(){
		// 创建一个File对象
		String pathname = "C:" + File.separator + "test.txt"; // 双斜杠，第一个斜杠表示转义，第二个斜杠表示普通字符
//				"\t"; 			// 制表符
//				"\n";			// 换行符
		File file = new File(pathname);
		
		// 创建一个文件
		// 捕获异常，防止路径不存在，如：C盘不存在
		try {
			file.createNewFile();
			System.out.println("文件创建成功！");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 删除文件，首先判断文件是否存在
		if ( file.exists() ){
			file.delete();
			System.out.println("删除文件成功！");
		}
		
		// 路径分隔符，（1）windows下是\；Linux下是/
		System.out.println("pathSeparator: " + File.pathSeparator);
		System.out.println("separator：" + File.separator);
		
		// 创建一个文件夹C:\test
		String dirpath = "C:" + File.separator + "test" + File.separator + "test1";
		File dir = new File(dirpath);
//				dir.mkdir();	// 创建单个路径
		dir.mkdirs(); 	// 创建多个路径
		
		// 在C:\test目录下创建了三个文件
		File f1 = new File(dirpath + File.separator + "file1.txt");
		File f2 = new File(dirpath + File.separator + "file2.txt");
		File f3 = new File(dirpath + File.separator + "file3.txt");
		try{
			f1.createNewFile();
			f2.createNewFile();
			f3.createNewFile();
		}catch( IOException e ){
			e.printStackTrace();
		}
		
		// 获取一个目录下所有文件
		// 1. list，只有文件名
		System.out.println();
		String[] files = dir.list();
		for ( int i = 0; i < files.length; i++ ){
			String f = files[i];
			System.out.println(f);
		}
		// 2. listFiles,包含路径
		File[] files1 = dir.listFiles();
		for ( int i = 0; i < files1.length; i++ ){
			File f = files1[i];
			System.out.println("文件全路径: " + f);
			System.out.println("文件名：" + f.getName());
			System.out.println("文件路径：" + f.getParent());
			System.out.println("文件全路径: " + f.getPath());
		}

	}
	
	public static void main(String[] args) {
		String dirpath = "D:" + File.separator + "networkyp";
		getAllFiles(dirpath);
	}
}
