public class PigLatin {
	public static void main(String[] args){
		
	  String w="";
	  System.out.println("Enter the word you want in the form of pig latin");
	  w=IO.readString();
	  
	  IO.outputStringAnswer(change(w));
	  
	}
	
	public static String change(String w){
		
		String cw=""; 
	    
	    
	       if(w.charAt(0)=='a'||w.charAt(0)=='e'||w.charAt(0)=='i'||w.charAt(0)=='o'||w.charAt(0)=='u'||w.charAt(0)=='A'||
	    		   w.charAt(0)=='E'||w.charAt(0)=='I'||w.charAt(0)=='O'||w.charAt(0)=='U'){
			  cw=w+"way";
		}
		
	    	else{
			   cw=w.substring(1)+w.charAt(0)+"ay";
			}
		return cw;
	}

}
