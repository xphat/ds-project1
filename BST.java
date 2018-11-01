
/**
 * Write a description of class BST here.
 *
 * @author (Rhon-Kaniel Bramwell 01-021276)
 * @author (Kelvin Hayles 620079267)
 * @version (30102018)
 */
public class BST extends BinaryTree
{
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int largestKey()
    {
        
        if (emptyTree())
            return 0; 
        
        
        return (getRight().getRoot());
        
    }
    
    public int smallestKey()
    {
        if (emptyTree())
        
        return 0;
        
        return (getLeft().getRoot());
    }
    
    public BinaryTree searchTree(char sdata)
    {
        
        if(!emptyTree()){
            if(getLeft().getRoot()>sdata){
            sdata = getLeft().getRoot();
            }
        else{
            sdata= getRight().getRoot();
        }
        
        if (emptyTree())
        return null;   
         
        }
        
        return searchTree(sdata);
    }
    
    public void insertKey(char value)
    {
        //
    }
        
    public void deleteKey(char value)
    {
        //        
    }
    
    
}
