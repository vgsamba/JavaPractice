package com.interfaceClassWork;

public class TestMain {
    public static void main(String[] args)
    {
        Mangodb mdb=new Mangodb();
        mdb.insert();
        mdb.delete();


        Mysql msdb=new Mysql();
        msdb.insert();
        msdb.delete();
        msdb.search();

    }
}
