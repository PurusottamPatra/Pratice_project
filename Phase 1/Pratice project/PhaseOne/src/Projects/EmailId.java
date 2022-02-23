package Projects;

	import java.util.regex.*;    
	import java.util.*;    
	public class EmailId{  
	    public static void main(String args[]){  
	        ArrayList<String> emails = new ArrayList<String>();  
	        emails.add("puja1698@domain.co.in");  
	        emails.add("rabi@domain.com");  
	        emails.add("suresh.name@domain.com");  
	        emails.add("raja#@domain.co.in");  
	        emails.add("SouravDas@domain.com");  
	        emails.add("rani@domaincom");  
	        //Add invalid emails in list  
	        emails.add("rabi@yahoo.com");  
	        emails.add("java#domain.com");  
	        //Regular Expression   
	        String regex = "^(.+)@(.+)$";  
	        //Compile regular expression to get the pattern  
	        Pattern pattern = Pattern.compile(regex);  
	        //Iterate emails array list  
	        for(String email : emails){  
	            //Create instance of matcher   
	            Matcher matcher = pattern.matcher(email);  
	            System.out.println(email +" : "+ matcher.matches()+"\n");  
	        }  
	    }  
	}  

