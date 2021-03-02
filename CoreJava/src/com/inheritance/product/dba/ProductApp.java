package com.inheritance.product.dba;

import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args)
    {
        System.out.println("Welcome to product viewer");
        System.out.println();

        // perform one or more selections
        Scanner sc=new Scanner(System.in);
        String userChoice="y";
        while(userChoice.equalsIgnoreCase("y"))
        {
            System.out.println("enter product code");
            String productCode=sc.nextLine();// reading the product code
            // get product object
            Product p=ProductDb.getProduct(productCode);
            // display output
            if(p!=null)
            {
                System.out.println("Description: "+p.toString());
                System.out.println("Price: "+p.getPriceFormatted());
            }
            else
            {
                System.out.println("No product matches this product code.\n");
            }
            System.out.println("Product count: "+Product.getCount());

            // see if the user wants to continue
            System.out.println("Do you want to continue y/n");
            userChoice=sc.nextLine();

        }
        sc.close();



    }
}
