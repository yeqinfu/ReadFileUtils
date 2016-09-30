import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import utils.Utils_File;
/**
 * 这个是检查下项目中的shape seletor文件是否误用了attr来设置颜色或者字体
 * @author yeqinfu
 *
 */
public class Main {
	public static void main(String[] args) {
	//	String filePath="/home/yeqinfu/PharmPlus_Code/android/branches/android_libraries_v3.1.1/library_medicineCommon/res";
	//	String filePath="/home/yeqinfu/PharmPlus_Code/android/branches/V3.1.1/res";
		String filePath="/Users/yeqinfu/qw_code/android-store/branches/V4.0.2/res";

		Utils_File.checkFileEndWith(filePath, ".xml");
	}
	
	/**
	 * 读取每一行，中文会乱码
	 * @param fileUrl
	 * @throws IOException
	 */
	private void checkFileByLine(String fileUrl) throws IOException {
        FileReader fr=new FileReader(fileUrl);
        BufferedReader br=new BufferedReader(fr);
        String line="";
        String[] arrs=null;
        while ((line=br.readLine())!=null) {
            arrs=line.split(",");
            System.out.println(arrs[0] + " : " + arrs[1] + " : " + arrs[2]);
        }
        br.close();
        fr.close();
    }
}
