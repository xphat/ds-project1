
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
        if (x.emptyTree())
        {
            return 0;
        }
        else if (isSymbol(x.getRoot()))
        {
            return countSymbols(x.getLeft()) + countSymbols(x.getRight()) + 1;
        }
        else
        {
            return countSymbols(x.getLeft()) + countSymbols(x.getRight());
        }
    }
    
    public int countLeaves (BinaryTree x)
    {
        if (x.emptyTree())
        {
            return 0;
        }
        else if (x.getLeft() == null && x.getRight() == null)
        {
            return countLeaves(x.getLeft()) + countLeaves(x.getRight()) + 1;
        }
        else
        {
            return countLeaves(x.getLeft()) + countLeaves(x.getRight());
        }
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
    
    public static void main()
    {
        BinaryTree bt = new BinaryTree(new Node('+'));
        bt.insertNode('/', 0);
        bt.insertNode('*', 1);
        bt.getLeft().insertNode('*', 0);
        bt.getLeft().insertNode('-',1);
        
        //This needs to be fixed!  --- Creates Tree But the Node Structure isnt Correct Yet!
        
        bt.getRight().insertNode('5', 0);
        bt.getRight().insertNode('-',1);
        
        
        System.out.println(bt);
                       
    }
    
    
}