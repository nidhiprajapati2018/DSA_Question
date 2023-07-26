package com.DSA.Questions;

import java.util.Scanner;

public class SelectionSorteX {

	public static void main(String[] args) {
		
		int n,i,j,loc,a[], temp;
		Scanner sc = new  Scanner(System.in);
		System.out.println("How many element do u want to sort");
		
		 n = sc.nextInt();
		 a = new int[n];
		 //System.out.println(a);
		 
		 System.out.println("Enter the elements");
		 
		 for(i=0; i<n; i++) {
			 a[i] = sc.nextInt();
		 }
		 
		 for(i=0; i<n-1; i++)
		 {
			 loc = i;
			 for(j=i+1; j<n; j++) 
			 {
				 if(a[j]<a[loc])
				 {
				   loc = j;
				 }
				 
			 }
			 temp = a[i];
			 a[i] = a[loc];
			 a[loc] = temp;
			 
		 }
		 
		 for(i=0; i<n; i++) {
		 System.out.println(a[i]);
		 
		 }
		 
		
		}
	}
