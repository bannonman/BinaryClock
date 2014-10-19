package binaryClock;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class binaryClock {
	
	public static void main(String args[]){
		int h1,h2,m1,m2,s1,s2;
		String[] arr = new String[6];
		String[] arr2 = new String[4];
		
		do{
    	Calendar cal = Calendar.getInstance();
    	cal.getTime();
    	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    	
    	h1 = sdf.format(cal.getTime()).charAt(0);
    	h2 = sdf.format(cal.getTime()).charAt(1);
    	m1 = sdf.format(cal.getTime()).charAt(3);
    	m2 = sdf.format(cal.getTime()).charAt(4);
    	s1 = sdf.format(cal.getTime()).charAt(6);
    	s2 = sdf.format(cal.getTime()).charAt(7);
    	
		for(int i = 0 ; i < 6 ; i ++)
		{		
			arr[i] = Integer.toBinaryString(h1);
			for (String part : arr[i].split(" ")) {
			   arr[i] = new StringBuilder(part).reverse().toString();
			}
			
			i ++;
			arr[i] = Integer.toBinaryString(h2);
			for (String part : arr[i].split(" ")) {
				   arr[i] = new StringBuilder(part).reverse().toString();
				}
			i ++;
			arr[i] = Integer.toBinaryString(m1);
			for (String part : arr[i].split(" ")) {
				   arr[i] = new StringBuilder(part).reverse().toString();
				}
			i ++;
			arr[i] = Integer.toBinaryString(m2);
			for (String part : arr[i].split(" ")) {
				   arr[i] = new StringBuilder(part).reverse().toString();
				}
			i ++;
			arr[i] = Integer.toBinaryString(s1);
			for (String part : arr[i].split(" ")) {
				   arr[i] = new StringBuilder(part).reverse().toString();
				}
			i ++;
			arr[i] = Integer.toBinaryString(s2);
			for (String part : arr[i].split(" ")) {
				   arr[i] = new StringBuilder(part).reverse().toString();
				}
		}
		
		for(int i = 0 ; i < 4 ; i++ )
		{	
			StringBuffer sb = new StringBuffer();
			for(int j = 0 ; j < 6 ; j ++)
			{
				if(i < arr[j].length() ){
					sb.append(arr[j].charAt(i));
				}
				else{
					sb.append('0');
				}
			}
			arr2[i]=sb.toString();
		}
		
		
		System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n");
		for(int i = 3 ; i > -1 ; i--){
			System.out.println(arr2[i]);
		}
		
		System.out.println(" H:M:S");
		System.out.println( sdf.format(cal.getTime()));
		
		try
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		
		}while(true);
	}

}
