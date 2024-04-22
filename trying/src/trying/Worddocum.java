package trying;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

public class Worddocum {  
    public static void main(String[] args) throws IOException {  
    	
    	
    	 String vards,atb,dzivo,epas,vakc,izgl,sasn,papiz;
   	  String Aa = null,v= null,p= null, c= null;

   	 int m;
   	 
  
   	    Scanner dati = new Scanner (System.in);
   	 System.out.println("Vārds, Uzvārds (Piemēram, Jana Ozolniece)");
   	vards=dati.nextLine();
   	System.out.println("Dzīves vietas adrese(Brīvības iela 24-7 , Talsi)");
   	dzivo=dati.nextLine();
   	System.out.println("Ievadiet savu telefona nummuru ");
   	m=dati.nextInt();
   	dati.nextLine();
   	do {
   	System.out.println("E-pasta adrese (Piemēram, Andriskoc@gmail.com");
   	epas=dati.nextLine();
   	}while(!epas.contains("@"));

   	 System.out.println("Vakance uz kuru kanditē vai joma kurā tiek meklēts darbs ");
   		vakc=dati.nextLine();
   		System.out.println("Iegūtā izglītība P- pamatizglītība, V- vidējā izglītība vai A- augstākā izglītība, ja cita ievadiet C (Ierakstiet burtu)");
   		izgl=dati.nextLine();
   		if(izgl.equals("A")||izgl.equals("a")) {
   			System.out.println("Mācību iestādes nosaukums kur ieguvāt augstāko izglītību(Piem, Ventspils augstskola - Bakalaura grāds)");
   			Aa=dati.nextLine();}
   		
   		if(izgl.equals("V")||izgl.equals("v")) {
   			
   			System.out.println("Mācību iestādes nosaukums kur ieguvāt vidējo vai vidējo speciālo izglītību");
   			v=dati.nextLine();}
   		
   		
   		if(izgl.equals("C")||izgl.equals("c")) {
   			
   			System.out.println("Kāda izglītība, kur tā iegūta (Piemēram, vidējā speciālā, Purvciema AVS)");
   			c=dati.nextLine();}
   		
   		if(izgl.equals("P")||izgl.equals("p")) {
   			System.out.println("Mācību iestādes nosaukums kur ieguvāt pamatizglītību ");
   			p=dati.nextLine();} 
   		int s = 0;
   		
   		do {
   		System.out.println("Vai jums ir kāda pieredze darbā? (jā/nē)");
   		 atb=dati.nextLine();
   		}while(!atb.equals("jā")&&!atb.equals("Jā")&&!atb.equals("Nē")&&!atb.equals("nē"));
   		
   		if (atb.equals("Nē")||atb.equals("nē")) {System.out.println("dati par pieredzi dokumentā nebūs");}
   		
   		
   		if(atb.equals("Jā")||atb.equals("jā")){
   		System.out.println("Cik darba vietas vēlaties uzrādīt?"); 
	        s= dati.nextInt ();
   		}
   		String []darb = new String[s];
   		if(atb.equals("Jā")||atb.equals("jā")){
   			dati.nextLine();
   		
	      for (int i = 0; i < darb.length; i++)
		{
	     
		  System.out.println ("amata nosaukums, darba devējs, strādātie gadi (Piemēram, Pianists  SIA mūzika, 2004 - pašlaik)");
		  darb[i] = dati.nextLine ();
		}
	        
   		}
   		
   	      System.out.println("Profesionālie sasniegumi (Piemēram, mēneša darbinieks, 1. vieta Latviešu valodas olimpiādē u.c.)(ja raksta vairākus atdalīt ar komatu)");
   			sasn=dati.nextLine();
   			
   			
   			
   			
   			 System.out.println("Papildus izglītība(Piemēram, Autoskola 54 mācību stundas )(Rakstot vairākus atdalīt ar komatu)");
   			 papiz=dati.nextLine();
   			 
   			 System.out.println("Cik valodas protat?");

   		        String[] valoda = new String[dati.nextInt ()];
   		        dati.nextLine ();
   		      for (int i = 0; i < valoda.length; i++)
   			{
   			  System.out.println ("ievadiet valodu (Piem., Latviešu)");
   			  valoda[i] = dati.nextLine ();
   			}
   		      	
   		   
   		      
   		      String[] prasmes = new String[valoda.length];
   		      String[] prasmessapr = new String[valoda.length];
   		      String[] prasmerakst = new String[valoda.length];
   		
   		      for (int i = 0; i < valoda.length; i++)
   				{
   		    	  System.out.println("Cik labas runāšanas valodas prasmes jums ir "+ valoda[i]+" valodā?(Piem, labi, teicami, optimāli, u.c.");
   		    	   prasmes[i]= dati.nextLine();
   				}
   				 
   		      for (int i = 0; i < valoda.length; i++)
   				{
   		    	  System.out.println("Cik labas saprašanas valodas prasmes jums ir "+ valoda[i]+" valodā?(Piem, labi, teicami, viduvēji, u.c.");
   		    	   prasmessapr[i]= dati.nextLine();
   				}
   				 
   		      for (int i = 0; i < valoda.length; i++)
   				{
   		    	  System.out.println("Cik labas rakstīšanas valodas prasmes jums ir "+ valoda[i]+" valodā?(Piem, labi, teicami, u.c.");
   		    	   prasmerakst[i]= dati.nextLine();
   				}
   		   System.out.println("Cik citas prasmes vēlaties uzrādīt? (citas prasmes - datorprasmes un tml.) (ievadīt skaitli)");
   				 String[] citasprasmes = new String[dati.nextInt()];
   				dati.nextLine ();
   				
     		      for (int i = 0; i < citasprasmes.length; i++)
     	   			{
     		    	 System.out.println("Citas prasmes? (Piemēram Datorprasmes: MS Office, Google workspace, u.c.)");
     		    	citasprasmes[i] = dati.nextLine ();
     	   			}
   				
   		     
   		      
   	   
        dati.close();
   	      
   	      
    	
        XWPFDocument doc = new XWPFDocument();  
        try(OutputStream os = new FileOutputStream(vards+" cv.doc")) {  
            XWPFParagraph paragrafs = doc.createParagraph();  
            XWPFRun runcv = paragrafs.createRun(); 
            
            paragrafs.setAlignment(ParagraphAlignment.CENTER);
            runcv.setFontSize( 20);
            runcv.setText("CV");
            
            paragrafs = doc.createParagraph(); 
           
            paragrafs.setAlignment(ParagraphAlignment.LEFT);  
            XWPFRun run = paragrafs.createRun(); 
            run.addBreak();        run.addBreak();   
            run.setFontSize( 14);
            run.setBold(true);
            run.setItalic(true);
           run.setText("Vārds Uzvārds: "+vards);
           run.addBreak();
           run.setText("Tālrunis: "+m);
           run.addBreak();
           run.setText("Adrese: "+dzivo);
           run.addBreak();
           run.setText("E-Pasts: "+epas);
           run.addBreak();  run.addBreak();   
           run.setText("CV Mērķis : "+vakc);
         
           run.addBreak();
            if(izgl.equals("A")||izgl.equals("a")) {
           run.setText("Augstākā izgļītība iegūta: "+Aa);
            }
            if(izgl.equals("V")||izgl.equals("v")) {
               run.setText("Vidējā izgļītība iegūta: "+v);
                }
            if(izgl.equals("c")||izgl.equals("C"));
            run.setText("Iegūtā izglītība: "+c);
            
            if(izgl.equals("P")||izgl.equals("p")) {
               run.setText("Pamatizglītība iegūta: "+p);
                }
           run.addBreak();
           if(atb.equals("Jā")||atb.equals("jā")){
           run.setText("Darba Pieredze: ");
           for(int i = 0;i<darb.length;i++)
           {
               run.setText(darb[i]);
               run.addBreak(); 
           }  
           }
           run.addBreak();
           run.setText("Profesionālie sasniegumi: "+sasn);
           run.addBreak();
           run.addBreak();
           run.setText("Papildus izglītība: "+papiz);
           run.addBreak();
           
           run.addBreak();
           for (int i = 0; i < citasprasmes.length; i++)
   			{
	    	 
        	   run.setText(citasprasmes[i]);
               run.addBreak(); 
   			}
           run.addBreak();
        
           XWPFTable tabula = doc.createTable();
           XWPFTableRow rinda = tabula.getRow(0);
           
           
           run.setText("Valodu prasmes:");
           run.addBreak();
           
           tabula.setWidth("100%");
           rinda.getCell(0).setText("valoda");  
           rinda.getCell(0).getParagraphArray(0).setSpacingAfter(0);
         
          rinda.addNewTableCell().setText("runāšanas prasmes");  
           rinda.getCell(0).getParagraphArray(0).setSpacingAfter(0);
           rinda.addNewTableCell().setText("saprašanas prasmes"); 
           rinda.addNewTableCell().setText("rakstīšanas prasmes");
      
            for(int i=0;i<valoda.length;i++) {
            	
            	 rinda = tabula.createRow();
                 rinda.getCell(0).setText(valoda[i]);  
                 rinda.getCell(1).setText(prasmes[i]);  
                 rinda.getCell(2).setText(prasmessapr[i]);  
                 rinda.getCell(3).setText(prasmerakst[i]);
                 
           
          	 run.addBreak();
            }
            
  
            
          
           
       
            
            doc.write(os);  
            System.out.println("darīts!");
        }catch(Exception e) {  
            System.out.println(e.getMessage());  

        }
      doc.close();
        }


}  
