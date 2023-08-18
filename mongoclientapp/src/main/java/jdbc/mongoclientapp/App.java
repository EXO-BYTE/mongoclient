package jdbc.mongoclientapp;

public class App 
{
    public static void main( String[] args )
    {
        
    	System.out.println( "Hello World!" );
    	
    	MongoApp obj=new MongoApp();
    	obj.createCollection();
    	obj.getCollections();
    	//obj.updateDocument();
    	obj.viewDocuments();
    	//obj.addToCollection("Peter", "Sales");
    	obj.addToCollection("Sam",  "Training");
    }
}