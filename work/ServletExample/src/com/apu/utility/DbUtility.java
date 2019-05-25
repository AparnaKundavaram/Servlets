package com.apu.utility;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DbUtility 
{
	// Creating a Mongo client 
    private static MongoClient mongo = new MongoClient( "localhost" , 27017 ); 

	public DbUtility() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public void connect(String userName, String password, String db) 
	{
		  
	      // Creating Credentials 
	      MongoCredential credential; 
	      credential = MongoCredential.createCredential(userName, db, password.toCharArray()); 
	}
	
	public MongoDatabase getDatabase(String db)
	{
		// Accessing the database 
		  MongoDatabase database = mongo.getDatabase(db);  
	      return database;
	}
	
	public void createCollection(MongoDatabase db, String colName)
	{
		//Creating a collection
	      db.createCollection(colName);
	}
	
	public MongoCollection<Document> getCollection(MongoDatabase db, String colName)
	{
		MongoCollection<Document> collection = db.getCollection(colName);
		return collection;
	}
	
	
	public void closeConnection()
	{
		//Closing connection
		 mongo.close();
	}
}