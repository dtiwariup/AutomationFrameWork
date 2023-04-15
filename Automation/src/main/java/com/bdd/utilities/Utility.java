package com.bdd.utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utility {
	public static String foldername;
	public static int timeout = 60;
	public static long webdriverwaittime = 50;
	
	/*public static String parentFolder() {
		String parentfoldername = "Automation_Report_Screenshot_" + new SimpleDateFormat("dd-MM-yyyy").format(new Date());
		File pfile = new File(parentfoldername);
		if(!pfile.exists()) {
			if(pfile.mkdir()) {
				System.out.println("Parent File Created");
			}
		}
		else {
			System.out.println("Parent File not created");
		}
		return parentfoldername;
	}*/
	
	// create childfolder method in which screenhsot and report will be generated

	public static String screenshotAndReportFolder(String Folder) {
		foldername = "Extent_Report_" + new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date());
		String childfolder = Folder + "/" + foldername;
		System.out.println("child folder name: "+childfolder);
		File file = new File(childfolder);
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("File is Created");
			}
		} else {
			System.out.println("File is not created");
		}
		return childfolder;

	}

}
