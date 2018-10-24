import java.util.concurrent.*;

public class DictionBin extends DictionBase
{
   

    public DictionBin() throws Exception
    {
          super();
    }
    public  String translate(String eng) throws Exception
    {
        return translateB(eng, 0, getCount());
        //update code to return value       
        //return "Update code to return value";
    }  

     private  String translateB ( String eng,int lo, int hi) throws Exception
    {
         int mid;
         if (hi >= lo)
         {
             mid=lo+(hi-lo)/2;
             if (dictionArr[mid][0].compareToIgnoreCase(eng) == 0) {
                 return dictionArr[mid][1];
                }
             if (dictionArr[mid][0].compareToIgnoreCase(eng) > 0) 
             {
                 return translateB(eng, lo, mid-1);
             }
             else
             {
                 return translateB(eng, mid+1, hi);
             }
         }
          
          
         
     TimeUnit.NANOSECONDS.sleep(1);
         
     return "No Comprehendo";
    }
    
     
}
