package com.techlab.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.HashSet;

public class FileOperator {
	private File originalFile;
	private File copyFile;
	public FileOperator(File originalFile,File copyFile) {
		this.originalFile=originalFile;
		this.copyFile=copyFile;
	}
	
	public File getUniqueElementFile() {
		//copying file
		try {
			Files.copy(originalFile.toPath(), copyFile.toPath());
			System.out.println("File copied successfully\n");
		} catch (IOException e) {
			
			System.out.println("File already exists");
		}
		// Write into copyemp.csv
		FileReader fr;
		try {
			fr = new FileReader(originalFile);
			BufferedReader br = new BufferedReader(fr);

			try {
				FileWriter fw = new FileWriter(copyFile);
				String line;

				while ((line = br.readLine()) != null) {
					if (line.contains("NULL")) {
						line = line.replaceAll("NULL", "0");
					}
					fw.write(line+"\n");
				}
				fr.close();
				fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
		System.out.println();
		//Removing duplicate lines
		try {
			PrintWriter pw = new PrintWriter("D:\\java_design_pattern\\employee-data-analyzer-app\\bin\\uniqueEmp.csv");
			BufferedReader br = new BufferedReader(new FileReader(copyFile));

			try {
				String line = br.readLine();
				HashSet<String> hs = new HashSet<String>();

				while(line != null)
				{
					// write only if not
					// present in hashset
					if(hs.add(line))
						pw.println(line);

					line = br.readLine();

				}
				br.close();

			} catch (IOException e) {
				
				e.printStackTrace();
			}
			pw.flush();
			
	        pw.close();
		} catch (FileNotFoundException e2) {
			
			e2.printStackTrace();
		}
		
		String uniqueFileName="D:\\java_design_pattern\\employee-data-analyzer-app\\bin\\uniqueEmp.csv";
		File uniqueFile=new File(uniqueFileName);
		return uniqueFile;
	}
}
