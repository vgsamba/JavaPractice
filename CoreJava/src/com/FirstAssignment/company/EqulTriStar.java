package com.FirstAssignment.company;

public class EqulTriStar
{
    public static void main(String[] args)
    {
        int n=3;
        int i, j;
        for(i=0;i<n;i++)
        {
            for(j=n-2;j>i;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}