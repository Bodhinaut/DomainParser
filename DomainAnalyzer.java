

/**
 * @author:  Kyle M. Shive
 * @date:    8/25/2017
 */
public class DomainAnalyzer {
    private String domainName;
    
    public DomainAnalyzer() {
        domainName = "www.cs.siue.edu";
    }// end default constructor
    
    public DomainAnalyzer(String domainName) {
        this.domainName = domainName;
    }// end one-argument designated contrutor 
    
    public String getDomainName()                 {return domainName;}//end getter
    
    public void setDomainName (String domainName) {this.domainName = domainName;}//end setter add?
    
    public String getTLD() {
       String TLD = "";
       String[] param;
       param = domainName.split("\\."); 
       int index = getDomainPartCount() -1;
       TLD = param[index];
       return TLD;
    }// end get TLD
    
    public String getSLD() {
       String SLD = "";
       String[] param;
       param = domainName.split("\\.");
       int index = getDomainPartCount() -2;
       SLD = param[index]; 
       return SLD;
   }// end get SLD
   
   public String getSubdomainAtLevel(int level) {
       String subD = "";
       if (level > getDomainPartCount() - 2 || getDomainPartCount() - level < 0) {
           return "";
       }
       
       
       
       String[] param;
       param = domainName.split("\\.");
       subD = param[getDomainPartCount() - (level+2) ];
       
       return subD;
   }// end sub at level 
   
   public int getDomainPartCount() {
       int count = 0;
       char period = '.';
       char[] charArray = domainName.toCharArray();
       for(int i = 0; i <= domainName.length() - 1 ; i++){
           if(charArray[i] == period){
               count++;
           }
       }
       return count+1; // add one because no period at the end of last subdomain name
    }// end get part count 
   

   @Override
   public String toString() {
        String str = "";

        str += domainName;
        
        return str;
    }// end toString()

}// end class
