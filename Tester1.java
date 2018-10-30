
/**
 * Write a description of class Tester1 here.
 *
 * @author (Rhon-Kaniel Bramwell)
 * @version (0.001)
 */
public class Tester1
{
    public int countSymbols (BinaryTree x)
    {
        int count = 0;
        
        if (x.emptyTree())
        {
            return 0;
        }
        else if (isSymbol(x.getRoot()))
        {
            count++;
        }
        return count;
    }
    
    public int countLeaves (BinaryTree x)
    {
        return 0;
    }
    
    public String postOrder (BinaryTree x)
    {
        return "";
    }
    
    public String inOrder (BinaryTree x)
    {
        return "";
    }
    
    private boolean isSymbol (char x)
    {
        if (x == '+' || x == '-' || x == '/' || x == '*' || x == '^')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
}