package utils;
import java.io.File;

import org.dom4j.DocumentException;

public class Utils_File {
	
	
	 public static void checkFileEndWith(String filePath,String endStr){
		 File root = new File(filePath);
		    File[] files = root.listFiles();
		    for(File file:files){    
		     if(file.isDirectory()){
		      /*
		       * 递归调用
		       */
		    	 checkFileEndWith(file.getAbsolutePath(),endStr);
		   // filelist.add(file.getAbsolutePath());
		   //  System.out.println("显示"+filePath+"下所有子目录及其文件"+file.getAbsolutePath());
		     }else{
		    	 if (file.getName().endsWith(endStr)) {//如果是目标文件类型 检查里面的节点
		    		 try {
						Utils_XmlPraser.checkXml(file.getAbsolutePath());
					} catch (DocumentException e) {
						
						e.printStackTrace();
					}
					
				}
		    	 
		    	 
		    //  System.out.println("显示"+filePath+"下所有子目录"+file.getAbsolutePath());
		     }    
		    
		 }
		 
	 }
	
	
	
	

}
