package as.leraning.watson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class traitement {
	public String score(  String j) {
		
	String k =j ;
	float d=Float.parseFloat(k);
	 return String.format("%.0f",d*100)+"%";
		}
		
	
	public void trait(String g) {
		
List<String> mots = new ArrayList<String>();
		 List<String> mote = new ArrayList<String>();
		  g= g.replace("[", "imane");//
		 String[]   mot = g.split("imane"); 
		 String p =mot[1];
		 p =p.replace("]", "imane");
		 mot=p.split("imane");
		  p =mot[0];
		  p=  p.replace("{", "");
		  p= p.replace("}", "");
		  p= p.replace("\n", "");
		  p= p.replace(" ", "");
		    mot = p.split(","); 
		 //   
	
	
		// List<String> motv = new ArrayList<String>(Arrays.asList(mot));
		 	
	  	 for(String m : mot){
	  		 if (m.contains("score"))
			  { String[] motg = m.split(":");
			 
			  mots.add(motg[1]);		 //(Arrays.asList(mot));
				  // arr = append(arr, "4"); 
			continue;
				   }
	  		 else	 if (m.contains("tone_name"))
	  	 	  { String[] motg = m.split(":");
	  			  
	  			  mote.add(motg[1]);

	  			continue;
	  			  }
	  		 
	  		
}
      Resultat t = new Resultat(mots,mote);
		
		t.setVisible(true);
	


  
  
    
    
	}}
    		