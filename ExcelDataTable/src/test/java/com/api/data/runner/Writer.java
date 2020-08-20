package com.api.data.runner;

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
		  
		 
		public void writeDataTableInFeatureFile(String ExcelFilePath, String FeatureFilePath) throws IOException {
			
			ExcelDataToDataTable obj = new ExcelDataToDataTable();
			DataTable table = obj.transform(ExcelFilePath);
		    Path path = Paths.get(FeatureFilePath);
	    	ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(path, StandardCharsets.UTF_8);
	        int position = 0;
	    	for(String line : lines) {
	    		if(line.contains("Examples:")) {
	    			position = lines.indexOf(line)+1;
	    			
	    		}
	    	}
	    	String AddLine = table.toString();  

	    	lines.add(position, AddLine);
	    	Files.write(path, lines, StandardCharsets.UTF_8);
		}
		
		public static void main(String[] args) throws IOException {
			String ExcelFilePath = "C:\\Users\\Revaan\\eclipse-workspace\\ExcelDataTable\\src\\test\\java\\com\\api\\data\\BuyAndSellStocksTestData.xlsx";
			String FeatureFilePath = "C:\\Users\\Revaan\\eclipse-workspace\\ExcelDataTable\\src\\test\\java\\com\\api\\data\\feature\\BuyStocks.feature";
			Writer wb = new Writer();
			wb.writeDataTableInFeatureFile(ExcelFilePath, FeatureFilePath);
		}

		
		
		
	
}
