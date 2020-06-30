package as.leraning.watson;

import java.awt.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.watson.tone_analyzer.v3.ToneAnalyzer;
import com.ibm.watson.tone_analyzer.v3.model.DocumentAnalysis;
import com.ibm.watson.tone_analyzer.v3.model.SentenceAnalysis;
import com.ibm.watson.tone_analyzer.v3.model.ToneAnalysis;
import com.ibm.watson.tone_analyzer.v3.model.ToneOptions;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Tone {
	
	
	private String h;

	public void  analyse(String d) {

	
		  Authenticator authenticator = new IamAuthenticator("3QsKIbPxCkU7fLAR17ff7JT-ykU2N7S8Wh0iuuc4zWp6");
		    ToneAnalyzer service = new ToneAnalyzer("2020-06-23", authenticator);

        /*	 String text =
	      "I know the times are difficult! Our sales have been "
	          + "disappointing for the past three quarters for our data analytics "
	          + "product suite. We have a competitive data analytics product "
	          + "suite in the industry. But we need to do our job selling it! "
	          + "We need to acknowledge and fix our sales challenges. "
	          + "We can’t blame the economy for our lack of execution! "
	          + "We are missing critical sales opportunities. "
	          + "Our product is in no way inferior to the competitor products. "
	          + "Our clients are hungry for analytical tools to improve their "
	          + "business outcomes. Economy has nothing to do with it."; */
		 
		  

		    ToneOptions toneOptions = new ToneOptions.Builder().text(d).build();
		    ToneAnalysis tone = service.tone(toneOptions).execute().getResult();
		 
	 
		  h = tone.toString();//	System.out.println(h);
	   traitement f = new traitement();
		f.trait(h);
		
	
     }
	 


   
	 
	
		
		 }

