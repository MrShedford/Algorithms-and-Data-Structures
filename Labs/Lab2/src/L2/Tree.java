package L2;
import java.util.*;
import java.io.*;
/**
 * Created by Sean on 13/02/2017.
 */
public class Tree implements Comparable<Tree>
{
    public Node root;             // first node of tree
    public int frequency=0;

    // -------------------------------------------------------------
    public Tree()                  // constructor
    {   root = null; }            // no nodes in tree yet
// -------------------------------------------------------------

//the PriorityQueue needs to be able to somehow rank the objects in it
//thus, the objects in the PriorityQueue must implement an interface called Comparable
//the interface requires you to write a compareTo() method so here it is:

    public int compareTo(Tree object){ //
        if(frequency-object.frequency>0){ //compare the cumulative frequencies of the tree
            return 1;
        }else if(frequency-object.frequency<0){
            return -1;   //return 1 or -1 depending on whether these frequencies are bigger or smaller
        }else{
            return 0;   //return 0 if they're the same
        }
    }

// -------------------------------------------------------------

    String path="error";     //this variable will track the path to the letter we're looking for

    public String getCode(char letter){  //we want the code for this letter

        inOrder(root, letter, "");    //call an inOrder traversal, starting at the root, looking for this letter
        return path;     //return the path that results

    }

    // -------------------------------------------------------------
    private void inOrder(Node localRoot, char letter, String path){ //the path variable tracks the current search path
        if(localRoot != null){ //if root is null we've gone off the edge of the tree - back up
            if(localRoot.letter==letter){
                this.path=path;     //if we've found the letter, note the path - final path = current search path
            }else{
                inOrder(localRoot.leftChild, letter, path+"0"); //go left and add "0" to the current search path
                inOrder(localRoot.rightChild, letter, path+"1");    //go right and add "1" to the current search path
            }
        }
        return; //quit searching this branch of the tree
    }
// -------------------------------------------------------------
}  // end class Tree
////////////////////////////////////////////////////////////////

