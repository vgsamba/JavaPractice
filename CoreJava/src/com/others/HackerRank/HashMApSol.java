package com.others.HackerRank;

import java.util.*;

class HashMApSol{
    public static void main(String []argh){
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            hm.put(name,phone);
            // Write code here
            System.out.println(hm.get(name)+" "+hm.get(phone));
        }
        /* while(in.hasNext()){
            String s = in.next();
            // Write code here
        }*/
        in.close();
    }
}