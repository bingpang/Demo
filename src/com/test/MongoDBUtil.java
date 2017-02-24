package com.test;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.MongoOptions;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class MongoDBUtil {

	
	public static void main(String[] args) {
		
		try {
			MongoClient client = new MongoClient("192.168.93.128",27017);
			MongoDatabase dataBase = client.getDatabase("mydb");
			System.out.println("Connect to database successfully");
			
			MongoCollection<Document> collection = dataBase.getCollection("mydb");
			System.out.println(collection.count());
			
			//查询all
			FindIterable<Document> itr = collection.find();
			MongoCursor<Document> mongoCursor = itr.iterator(); 
//			List<Student> list = 
					
			 while(mongoCursor.hasNext()){  
		            System.out.println(mongoCursor.next());  
		     }  
			//新增
//			Document document = new Document("name", "罗二狗").append("age", "1").append("likes", 500);
//			List<Document> documents = new ArrayList<Document>();
//			documents.add(document);
//			collection.insertMany(documents);
//			System.out.println("文档插入成功");
			
			
//			 ServerAddress serverAddress = new ServerAddress("192.168.93.128",27017);  
//	         List<ServerAddress> addrs = new ArrayList<ServerAddress>();  
//	         addrs.add(serverAddress);
//	         
//	         
//	         MongoCredential credential = MongoCredential.createScramSha1Credential("username", "mydb", "password".toCharArray());  
//	         List<MongoCredential> credentials = new ArrayList<MongoCredential>();  
//	         credentials.add(credential);  
//	              
//	         //通过连接认证获取MongoDB连接  
//	         MongoClient mongoClient = new MongoClient(addrs,credentials);  
//	              
//	         //连接到数据库  
//	         MongoDatabase mongoDatabase = mongoClient.getDatabase("mydb");  
	         
		} catch (Exception e) {
			 System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		}
		
	}
	
	
}
