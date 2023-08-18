package SampleSpringApp.productdaoapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.ProductService;
import com.model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.scan("com.dao");
        ctx.refresh();
        
        ProductService service=ctx.getBean(ProductService.class);
        service.add(new Product("Coffee",23,10));
        service.getAll();
    }
}
