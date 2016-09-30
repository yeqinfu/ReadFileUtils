import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.dom4j.DocumentException;

import utils.Utils_XmlPraser;

/**
 * 替换项目中size_04dp 为qw_dip_04这样类似的尺寸
 * @author yeqinfu
 *
 */
public class Main_ReplaceDimenSize {
	public static void main(String[] args) throws IOException {
		String filePath="/Users/yeqinfu/qw_code/android-store/branches/V4.0.2/res";
		checkFileEndWith(filePath, ".xml");
		//checkFileByLine2(filePath);
		
	}
	
	public static void checkFileEndWith(String filePath,String endStr){
		 File root = new File(filePath);
		    File[] files = root.listFiles();
		    for(File file:files){    
		     if(file.isDirectory()){
		      /*
		       * 递归调用
		       */
		    	 checkFileEndWith(file.getAbsolutePath(),endStr);
		     }else{
		    	 
		    	 if (file.getName().endsWith(endStr)) {//如果是目标文件类型 检查里面的节点
		    			 replaceTxtByStr(file.getAbsolutePath()+"","dimen/size_", "dimen/qw_dip_");
				}
		     }    
		    
		 }
		 
	 }
	
	
	
	
	public static void replaceTxtByStr(String path,String oldStr, String replaceStr) {
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
					    temp=temp.replace("dp'", "'");
					    System.out.println(temp);
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
				if (line.contains("dimen/size_")) {
					String temp=line.replace("dimen/size_", "dimen/qw_dip_");
					System.out.println(line);
					
				}
			}
		}
		br.close();
		fr.close();
	}

}
