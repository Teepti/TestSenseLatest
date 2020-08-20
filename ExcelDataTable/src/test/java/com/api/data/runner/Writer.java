package com.api.data.runner;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.api.data.transform.ExcelDataToDataTable;

import cucumber.api.DataTable;
import cucumber.api.Transform;

public class Writer {
		    
	       public static String[] featureFileName;
	       public static String ExcelFilePath;
	       public static String FeatureFilePath;
	       
		 
		public void writeDataTableInFeatureFile() throws IOException {
			
			ExcelDataToDataTable obj = new ExcelDataToDataTable();
			
			String FeatureDir = "C:\\Users\\Revaan\\eclipse-workspace\\ExcelDataTable\\src\\test\\java\\com\\api\\data\\feature";
			String[] featureFileName;
			String TestDataDir = "C:\\Users\\Revaan\\eclipse-workspace\\ExcelDataTable\\src\\test\\java\\com\\api\\data\\TestData";
			Path featureDirPath = Paths.get(FeatureDir);
			File excelDirectoryPath = new File(TestDataDir);
			String contents1[] = excelDirectoryPath.list();
		    File featureDirectoryPath = new File(FeatureDir);
			String[] featureList= featureDirectoryPath.list();
			for(String item : featureList) {
				featureFileName = item.split(".feature");
				for(int i=0; i<featureFileName.length; i++) {
					for(int j=0;j<contents1.length;j++) {
						if(contents1[j].contains(featureFileName[i])) {
							ExcelFilePath = TestDataDir + "\\" + contents1[j];
							DataTable table = obj.transform(ExcelFilePath);
							FeatureFilePath = FeatureDir + "\\" + item.toString();
							Path featurePath = Paths.get(FeatureFilePath);
							ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(featurePath,StandardCharsets.UTF_8); 
							  int position = 0; 
							  for(String line : lines) 
							  {
								  if(line.contains("Examples:")) 
								  { 
									  position = lines.indexOf(line)+1;
								  } 
							  } 
							  String AddLine = table.toString();
							  
							  lines.add(position, AddLine); 
							  Files.write(featurePath, lines,StandardCharsets.UTF_8); 
							  System.out.println("Data Table copied in Example Section Successfully");
							  }
						}
					}
				}
				
			}
			

			
		    
		    

	 
		
		public static void main(String[] args) throws IOException {
			//String ExcelFilePath = "C:\\Users\\Revaan\\eclipse-workspace\\ExcelDataTable\\src\\test\\java\\com\\api\\data\\BuyAndSellStocksTestData.xlsx";
			//String FeatureFilePath = "C:\\Users\\Revaan\\eclipse-workspace\\ExcelDataTable\\src\\test\\java\\com\\api\\data\\feature\\BuyStocks.feature";
			Writer wb = new Writer();
			wb.writeDataTableInFeatureFile();
			
		}

		
		
		
	
}
