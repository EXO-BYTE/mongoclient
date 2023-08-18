package mongoapp.PhoneApp;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;

public class PhoneApp {
	
	MongoClient client;
	MongoDatabase db;
	MongoCollection<Document> collection;
	
	public static final String COLLECTION_NAME="phone_collection";
	
	public PhoneApp() {
		try {
			client=new MongoClient("localhost",27017);
			db=client.getDatabase("Phonedb");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void createCollection() {
		try {
			db.createCollection(COLLECTION_NAME);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void getCollections() {
		collection=db.getCollection(COLLECTION_NAME);
	}
	
	public void addToCollection(int transaction_id, String sender_no, String receiver_no, int message_length, int receiveing_time) {
		Document doc=new Document();
		doc.put("transaction_id", transaction_id);
		doc.put("sender_no", sender_no);
		doc.put("receiver_no", receiver_no);
		doc.put("message_length", message_length);
		doc.put("receiveing_time",receiveing_time );
		
		collection.insertOne(doc);
	}
	
	public void viewDocuments() {
		FindIterable<Document> iterable=collection.find();
		for(Document d:iterable) {
			System.out.println(d);
		}
	}
	
	public void updateDocument() {
		Document query=new Document().append("sender_no","9988776655");
		try {
			Bson updates=Updates.set("receiving_time",10);
			UpdateResult updateresult=collection.updateOne(query, updates);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
