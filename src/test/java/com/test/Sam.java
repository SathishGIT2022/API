package com.test;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sam {
	public static void main(String[] args) throws IOException, ParseException  {
		FileReader fileReader = new FileReader("C:\\Users\\Koli\\eclipse-workspace\\APIAutomation\\src\\test\\resources\\Rest.json");
		JSONParser jsonParser=new JSONParser();
		Object parse = jsonParser.parse(fileReader);
		JSONObject jsonObject=(JSONObject)parse;
		Object object = jsonObject.get("page");
		System.out.println(object);
		Object object2 = jsonObject.get("data");
		JSONArray jsonArray= (JSONArray)object2;
		
		for (Object object3 : jsonArray) {
			System.out.println(object3);
			
		}
		
		
		
		
		
	}

}
