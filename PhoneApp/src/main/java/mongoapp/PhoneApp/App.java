package mongoapp.PhoneApp;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        PhoneApp obj=new PhoneApp();
    	//obj.createCollection();
    	obj.getCollections();
    	obj.addToCollection(1, "9988776655", "9876598765",50,30);
    	//obj.addToCollection(1, "9988700655", "9006598765",55,35);
    	
    	obj.updateDocument();
    	obj.viewDocuments();
    	
    }
}