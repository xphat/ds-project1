
/**
 * Write a description of class Tester1 here.
 *
 * @author (Rhon-Kaniel Bramwell)
 * @version (0.001)
 */
public class Tester1
{
    public static int countSymbols (BinaryTree x)
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
    
    public static int countLeaves (BinaryTree x)
    {
        if (x.emptyTree())
        {
            return 0;
        }
        else if (x.getLeft().getSize() == 0 && x.getRight().getSize() == 0)
        {
            return countLeaves(x.getLeft()) + countLeaves(x.getRight()) + 1;
        }
        else
        {
            return countLeaves(x.getLeft()) + countLeaves(x.getRight());
        }
    }
    
    public static String postOrder (BinaryTree x)
    {
        if (x.emptyTree())
        {
            return "";
        }
 
        return postOrder(x.getLeft()) + postOrder(x.getRight()) + " " + x.getRoot();
    }
    
    public static String inOrder (BinaryTree x)
    {
        if (x.emptyTree())
        {
            return "";
        }
 
        return inOrder(x.getLeft()) + " " + x.getRoot() + inOrder(x.getRight());
    }
    
    private static boolean isSymbol (char x)
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
        BinaryTree lsub = bt.getLeft();
        
        lsub.insertNode('*', 0);
        lsub.insertNode('-', 1);
        BinaryTree lsubsub = lsub.getLeft();
        lsubsub.insertNode('2', 0);
        lsubsub.insertNode('3', 1);
        BinaryTree lsubsubr = lsub.getRight();
        lsubsubr.insertNode('2', 0);
        lsubsubr.insertNode('1', 1);        
        BinaryTree rsub = bt.getRight();
        rsub.insertNode('5', 0);
        rsub.insertNode('-', 1);
        BinaryTree rsubsub = rsub.getRight();
        rsubsub.insertNode('4', 0);
        rsubsub.insertNode('1', 1);
                     
        System.out.println(bt);
        
             
                       
    }
    
    
}