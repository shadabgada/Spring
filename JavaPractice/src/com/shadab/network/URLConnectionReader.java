package com.shadab.network;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class URLConnectionReader {
	
	public static String getResultsByPage(int page) throws IOException
	{
		String inputURL = "https://jsonmock.hackerrank.com/api/article_users?page="+page;
		URL link = new URL(inputURL);
		URLConnection url = link.openConnection();
		BufferedReader inp = new BufferedReader(
		                                new InputStreamReader(
		                                url.getInputStream()));
		String inputLine;
		String jsonResult="";
		while ((inputLine = inp.readLine()) != null) 
			jsonResult=jsonResult+inputLine;

		inp.close();
				
		return jsonResult;
	}

	 public static void main(String[] args) throws Exception {
			
			String jsonResult = getResultsByPage(1);
			JSONObject jsonObj = new JSONObject(jsonResult);
	
            int totalPages = jsonObj.getInt("total_pages");
			String username;
			int count;
			
			Map<String, Integer> map =new LinkedHashMap<String, Integer>();
		
			for(int page=1;page<=totalPages;page++)
			{
				if(page!=1)//skipping 1st page as we have already parsed its json data
				{
					jsonResult = getResultsByPage(page);
					jsonObj = new JSONObject(jsonResult);
				}
				
				int totalRecords = jsonObj.getJSONArray("data").length();

				for(int i=0;i<totalRecords;i++)
				{
					username = jsonObj.getJSONArray("data").getJSONObject(i).getString("username");
					count = jsonObj.getJSONArray("data").getJSONObject(i).getInt("submission_count");
					map.put(username,count);
				}
			}
			
			System.out.println(map);
			
			java.util.List<String> list = new LinkedList<String>();// saving the result
		
			int threshold=100;// Threshold of submission count
			
			list = map.entrySet().stream()
		    .filter(entry -> entry.getValue() > threshold)
		    .map(Entry::getKey)
		    .collect(Collectors.toList());
			
			System.out.println(list);
		}
}
