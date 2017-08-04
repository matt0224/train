package tw.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class train {

	public static void main(String[] args) {
	
		
	
		
		
		String strurl ="D:/NO1/aaa.json";
		Long startTime = System.currentTimeMillis();
		String json = getJSONString(strurl);
		
		
		//增加自動關閉功能
		
		
				JSONObject root = new JSONObject(json);
				JSONArray array = root.getJSONArray("TrainInfos");
				//FileOutputStream fout = new FileOutputStream();
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter("/test.txt"));
					String line = null;
					while((line = writer.readLine()) != null){  
						writer.write(line);  
						writer.newLine();  
						writer.flush();  
			         
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				StringBuffer sb = new StringBuffer();
				for(int i = 0; i < array.length(); i++) {					
					JSONObject  row = array.getJSONObject(i);
//					System.out.println(row.toString());
					String Type = row.getString("Type");
					
//					String CarClass = row.getString("CarClass");
//					String Cripple = row.getString("Cripple");
//					String BreastFeed = row.getString("BreastFeed");
//					String Package = row.getString("Package");
//					String Train = row.getString("Train");
//					String Route = row.getString("Route");
//					String Bike = row.getString("Bike");
//					String LineDir = row.getString("LineDir");
//					String Line= row.getString("Line");
//					String Note = row.getString("Note");
//					String NoteEng = row.getString("NoteEng");
//					System.out.println(Note);
//					String Dinning = row.getString("Dinning");
//					String OverNightStn = row.getString("OverNightStn");
					
//					pstmt.setString(1, Train);
//					pstmt.setString(2, Type);
//					pstmt.setString(3, BreastFeed);
//					pstmt.setString(4, Route);
//					pstmt.setString(5, Package);
//					pstmt.setString(6, OverNightStn);
//					pstmt.setString(7, LineDir);
//					pstmt.setString(8, Line);
//					pstmt.setString(9, Dinning);
//					pstmt.setString(10, Cripple);
//					pstmt.setString(11, CarClass);
//					pstmt.setString(12, Bike);
//					pstmt.setString(13, Note);
//					pstmt.setString(14, NoteEng);
//					// 4. query
//					pstmt.execute();
					JSONArray timeInfos  = row.getJSONArray("TimeInfos");
					for(int j = 0; j < timeInfos.length(); j++) {
					
						
						JSONObject infos = timeInfos.getJSONObject(j);
						String station = infos.getString("Station");
						String order = infos.getString("Order");
						String route = infos.getString("Route");
						String arrTime = infos.getString("ArrTime");
						String depTime = infos.getString("DepTime");
//						System.out.println(station+" : "+order+" : "+route+" : "+arrTime+" : "+depTime);
						
				
					}
				}
				System.out.println("ok");
				System.out.println(System.currentTimeMillis() - startTime);	
		
		}
	
	
	private static String getJSONString(String string){
		StringBuilder sb = new StringBuilder();
		try {
//			URL url =new URL(string);
//			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
//			conn.connect();
			FileInputStream fin = new FileInputStream(new File(string));
			BufferedReader reader = new BufferedReader(new InputStreamReader(fin,"UTF-8"));
			String line = null;
			while((line = reader.readLine())!= null){
				sb.append(line.trim());
			}
			reader.close();
			//System.out.println(sb);
		} catch (Exception e) {e.printStackTrace();}
		return sb.toString();
	}

}