package examplesample.productsApp;

/**
 * Hello world!
 *
 */
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Company;
import com.mybean.Product;
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
    	ctx.scan("com.config");
    	ctx.refresh();
    	
    	Product product=ctx.getBean(Product.class,"Coffee");
    	Company company=ctx.getBean(Company.class);
    	
        System.out.println(product);
        System.out.println(company.getCompanyInfo());
    }
}
