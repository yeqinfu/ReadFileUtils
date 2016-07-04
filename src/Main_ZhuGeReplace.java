import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 这个是用来读取文件中的字符串，生成TD统计的内部类的静态变量
 * 
 * @author yeqinfu
 */
public class Main_ZhuGeReplace {
	// 文件路径
	public static String filePath = "/home/yeqinfu/test";

	public static void main(String[] args) throws IOException {
		checkFileByLine2(filePath);
	}

	/**
	 * 读取每一行，中文会乱码 生成 静态变量
	 * 
	 * @param fileUrl
	 * @throws IOException
	 */
	private static void checkFileByLine(String fileUrl) throws IOException {
		FileReader fr = new FileReader(fileUrl);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		String[] arrs = null;
		while ((line = br.readLine()) != null) {
			if (!line.isEmpty()) {
				line.replace("-", "_");
				arrs = line.split("\\s+");
				System.out.println("public static String " + arrs[0] + "=" + "\"" + arrs[0] + "\"" + ";//" + arrs[1]);
			}
		}
		br.close();
		fr.close();
	}

	/**
	 * 读取每一行，中文会乱码 生成猪哥注入代码
	 * 
	 * @param fileUrl
	 * @throws IOException
	 * 
	 *             // TD v4.0 Utils_Data.clickData(getContext(),
	 *             ZhuGeIOStatistics.s_spxq_scewm, true);
	 */
	private static void checkFileByLine2(String fileUrl) throws IOException {
		FileReader fr = new FileReader(fileUrl);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		String[] arrs = null;
		while ((line = br.readLine()) != null) {
			if (!line.isEmpty()) {
				line.replace("-", "_");
				arrs = line.split("\\s+");
				System.out.println("//TD 4.0  " + arrs[1]);
				System.out.println(" Utils_Data.clickData(getContext(), ZhuGeIOStatistics." + arrs[0] + ", true);");
				System.out.println();
			}
		}
		br.close();
		fr.close();
	}

}
