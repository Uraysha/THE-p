package estate.agent;


import java.text.DecimalFormat;
/**
 *
 * @author urays
 */
public class EstateAgent /*implements IEstateAgent*/ {
    // declare the array
private static final  double[][] propertySales = {{800000, 1500000, 2000000},
                                                   {700000, 1200000, 1600000}};
// array for the tatal sales  
private static final double[] TotalSales = new double[2];
//array for agents name   
private static final String[] AgentsName = {"Joe Bloggs", "Jane Doe"};

// method to print the headings
    private static void printHeadings() {
        System.out.println("Estate Agents Sales Report");
        System.out.println();
        System.out.println("\t\t\t\tJan" + "\t\t\t" + "Feb" + "\t\t\t" + "March");
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐");
    }
    // method to print the arrays
    private static void printArray(){
        String pattern = "###,###.##";
      DecimalFormat df = new DecimalFormat(pattern);
      for (int j= 0; j<AgentsName.length;j++){ 
          System.out.print(AgentsName[j]+"\t\t\t");
          
          for(int i=0; i<= propertySales.length; i++)
       { 
       System.out.print(" R "+ df.format(propertySales[j][i])+ "\t\t"); 
       System.out.print("");
       
        }
      System.out.print("\n" );     
    }
    }
       // method to get total of sales 
    public static void EstateAgentSales(){
      String newpat = "###,###.##";
      DecimalFormat pf = new DecimalFormat(newpat);
      for(int j=0; j<= TotalSales.length;j++){
      for (int k= 0; k<= AgentsName.length; k++){ 
           double temp=0;
          System.out.print("The Total property sales for "+AgentsName[k]+" is ");
          for(int i=0; i<= propertySales.length; i++) {
             
              temp = temp + propertySales[k][i];
            
        TotalSales[j]= temp;
          }
       System.out.print("= R "+ pf.format(temp)+ "\t\t"); 
      System.out.print("\n" );     
    }
    }
    
    // method to get commission 
    public static void  EstateAgentCommission(){
     String newpat = "###,###.##";
      DecimalFormat pf = new DecimalFormat(newpat);
       for(int j= 0; j<=AgentsName.length;j++){
           double comm;
        for(int i=0; i<=TotalSales.length;i++ ){
            comm= TotalSales[i]*0.2;
           
          System.out.println("Sales commision for " +AgentsName[j]+ "= R " +pf.format(comm));
      }
       
  }
    }  
    //method to get the top earning agent
    public static void TopAgent(){
       for(int j=0;j<= AgentsName.length; j++){
           
        double maxSales=0; 
       for(int i=0; i<= TotalSales.length; i++){
           if (maxSales<TotalSales[i]){
               maxSales=TotalSales[i];
           }
           System.out.println("the top preforming Estate Agent: "+ AgentsName[j]);
        }
    }
       }
    // the main method callin the others 
    public static void main(String[] args) {
        // TODO code application logic here
        printHeadings();
        printArray();
        EstateAgentSales();
        EstateAgentCommission();
        TopAgent();
    }
}
}

//the interface 
public interface IEstateAgent {
 public static void EstateAgentSales(double[] propertySales){
   EstateAgentSales();
     
 }
 public static void EstateAgentCommission(double propertySales){
    EstateAgentCommission();
 }
 public static   void TopEstateAgent(double[] totalSales){
   TopAgent();
 }
}
