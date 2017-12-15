import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
/**
 * @author:  Kyle M. Shive
 * @date:    8/25/2017
 */
public class Main {
    
    
    public static void main(String[] args) {
        
    
        try {
            parseDomains("domainIn.txt", "domainOut.txt");

        }catch (FileNotFoundException e) {
            System.err.println("File: " + e.getMessage() );
            
        }
        
        System.out.println("Program ended.");
    }// end main
    
        
    public static void parseDomains(String inputFile, String outputFile) throws FileNotFoundException {
        ArrayList<DomainAnalyzer> domains = new ArrayList();
        try(Scanner fin = new Scanner(new File(inputFile) ); 
            PrintWriter pw = new PrintWriter(outputFile); ) {
           
           while (fin.hasNext() ){
               String holdDomains = fin.next();
               //DomainAnalyzer dM = new DomainAnalyzer(holdDomains);
               domains.add(new DomainAnalyzer(holdDomains) );
           }// end while 
           
           for(DomainAnalyzer e : domains) {
               pw.printf("%-20s%-20s", e.getTLD(), e.getSLD() );
               for(int i = 1; i <= e.getDomainPartCount() -2; i++){
                   pw.printf("%-20s", e.getSubdomainAtLevel(i) );
               }// end partcount for subdomain
               
               
               pw.println();
           }// end for each
            
        }//end try
    
    }// end read method
}
