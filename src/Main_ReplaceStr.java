import java.io.*;

public class Main_ReplaceStr {
	public static BufferedReader bufread;
	// 指定文件路径和名称
	private static String path = "lib/student.xml";
	private static File filename = new File(path);
	private static String readStr = "";

	public static void creatTxtFile() throws IOException {
		if (!filename.exists()) {
			filename.createNewFile();
			System.err.println(filename + "已创建！");
		}
	}

	public static String readTxtFile() {
		String read;
		FileReader fileread;
		try {
			fileread = new FileReader(filename);
			bufread = new BufferedReader(fileread);
			try {
				while ((read = bufread.readLine()) != null) {
					readStr = readStr + read + "\r\n";
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("文件内容是:" + "\r\n" + readStr);
		return readStr;
	}

	public static void writeTxtFile(String newStr) throws IOException {
		// 先读取原有文件内容，然后进行写入操作
		String filein = newStr + "\r\n" + readStr + "\r\n";
		RandomAccessFile mm = null;
		try {
			mm = new RandomAccessFile(filename, "rw");
			mm.writeBytes(filein);
		} catch (IOException e1) {
			// TODO 自动生成 catch 块
			e1.printStackTrace();
		} finally {
			if (mm != null) {
				try {
					mm.close();
				} catch (IOException e2) {
					// TODO 自动生成 catch 块
					e2.printStackTrace();
				}
			}
		}
	}

	public static void replaceTxtByStr(String oldStr, String replaceStr) {
		String temp = "";
		try {
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			StringBuffer buf = new StringBuffer();
			String line;
			while ((line = br.readLine()) != null) {
				temp=line;
				if (!line.isEmpty()) {
					if (line.contains("dimen/size_")) {
						System.out.println("replace line is:"+line);
					    temp=line.replace("dimen/size_", "dimen/qw_dip_");
					}
				}
				buf = buf.append(temp);
				buf = buf.append(System.getProperty("line.separator"));
			}
			br.close();
			FileOutputStream fos = new FileOutputStream(file);
			PrintWriter pw = new PrintWriter(fos);
			pw.write(buf.toString().toCharArray());
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void replaceTxtFile() {
		String read;
		String read2;
		try {
			FileReader fileread = new FileReader(filename);
			bufread = new BufferedReader(fileread);
			FileWriter newFile = new FileWriter(filename);
			BufferedWriter bw = new BufferedWriter(newFile);
			while ((read = bufread.readLine()) != null) {
				read2 = read.replace("1.1.1.1", "2.2.2.2");
				System.out.println(read2);
				bw.write(read2);
				bw.newLine();
				bw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] s) throws IOException {
	//	Main_ReplaceStr.creatTxtFile();
	//	Main_ReplaceStr.readTxtFile();
	//	Main_ReplaceStr.writeTxtFile("20080808:12:13");
		Main_ReplaceStr.replaceTxtByStr("@dimen/size_", "@dimen/qw_dip_");
	//	Main_ReplaceStr.replaceTxtFile();
	}
}