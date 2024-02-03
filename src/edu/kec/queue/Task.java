package edu.kec.queue;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input=new Scanner(System.in);
    Integer []a= {1,2,3,5,4};
    for(int i=0;i<a.length;i++) {
    	int count=1;
    	for(int j=i+1;j<a.length;j++) {
    		if(a[i]==a[j]) {
    			count++;
    		}
    		
    		
    	}
       if(count>1) {
    	   System.out.print(a[i]+"="+count);
   
       }
    }
  }
}


