import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
 
class yes
{
   public static void main(String args[]) throws NumberFormatException, IOException
   {
      String yes, sub;
      int i, c, one, zero, count, q, k, cases, first, last;
      BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st;
      
       cases  = Integer.parseInt(scan.readLine());
 while(cases>0){
	 st = new StringTokenizer(scan.readLine());
	
	 int length = Integer.parseInt(st.nextToken());
 
	 		k =  Integer.parseInt(st.nextToken());
	       q =  Integer.parseInt(st.nextToken());
	      
	       
	       
	      yes = scan.readLine();
	     
	      while(q >0){
	    	  
	    	  st = new StringTokenizer(scan.readLine());
	    	   first = Integer.parseInt(st.nextToken());
	    	  
	    	   last = Integer.parseInt(st.nextToken());
	    	  
	      
	       count = 0;
	       
	       if(last-first+1 <=k){
	    	 int n = last - first +1;
      		 count = (n*(n+1))/2;
	    	   
	       }
	       else{
	    	   
	    	   
	       
		       mainLoop:
		      for( c = first-1 ; c < last ; c++ )
		      {
		        	 one = 0;
		        	 zero = 0;
		         for( i = 1 ; c+i <= last ; i++ )
		         {
		        	 if(i > 2*k){
			            	break;
			           }
		        	
		            sub = yes.substring(c, c+i);
		            char a = sub.charAt(i-1);
		            
	                if(a == '0'){
	                	
	                	zero++;
	                	if(zero > k){
	                		
	                		break;
	                	}
	                }
	                else if(a == '1'){
	                	
	                	one++;
	                	if(one > k){
	                		
	                		break;
	                	}
	                }
	                if(c+i == last && c == first-1){
		        		 
		        		 int n = last - first +1;
		        		 count = (n*(n+1))/2;
		        		 
		        		 break mainLoop;
		        	 }
	                else if(c+i == last+1){
	                	int n = i-c+1;
	                	
	                	count += (n*(n+1))/2;
	                	 break mainLoop;
	                	
	                }
		            
		            
		           
		            //if(zero <= k && one <= k){
		            	
		            	
		           	 count++;
		           	 
		            //}
		            
		         }
		      	}
		      
 
	       }
		      System.out.println(count);	
		      q--;
 	}
 	 cases--; 
  } 
      
   }
} 
