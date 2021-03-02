package com.inheritance.product.dba;

public class ProductDb {
    public static Product getProduct(String procuctCode)
    // In a more realistic application, this code would
    // get the data for the product from a file or database
    // For now, this code just uses if/else statements
    // to return the correct product data
    {

        Product p=null;
        if(procuctCode.equalsIgnoreCase("java")||
                procuctCode.equalsIgnoreCase("jsp")||
                procuctCode.equalsIgnoreCase("mySql"))
        {
            Book b=new Book();
            if(procuctCode.equalsIgnoreCase("java"))
            {
                b.setCode(procuctCode);
                b.setDescription("My JAva Programming");
                b.setPrice(50.22);
                b.setAuther("Myself");
            }
            else if(procuctCode.equalsIgnoreCase("jsp"))
            {

                b.setCode(procuctCode);
                b.setDescription("My JSP Programming");
                b.setPrice(51.22);
                b.setAuther("Myself");
            }
            else if(procuctCode.equalsIgnoreCase("mySql"))
            {

                b.setCode(procuctCode);
                b.setDescription("My mySql Programming");
                b.setPrice(55.22);
                b.setAuther("Joel Murach");
            }
            p=b;//set Product object equal to the Book object

        } else if(procuctCode.equalsIgnoreCase("eclipse"))
        {
            Software s=new Software();
            s.setCode("eclipse");
            s.setDescription("Eclipse");
            s.setPrice(10.10);
            s.setVersion("4.4");
            p=s;//set Product object equal to the Software object
        }
        return p;
    }

}
