// This is the text editor interface. 
// Anything you type or change here will be seen by the other person in real time.

/*
Write two functions:

1) given the root of a binary tree of integer, serialize it into a string and return it;
2) given the return value of the first, deseraizlie it back to an identical binary tree.



level-order:                          
"3, 2, 1, 1, 7, ?, 10, ?,  ?, 6"

pre-order:
"3, 2, 1, 7, 1, 10, 6"



*/
import java.util.Queue;
import java.util.StringBuilder;

class Node {
    public int value;
    public Node left;
    public Node right;
    
    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}


public String serialize(Node root) {
    StringBuilder toReturn = new StringBuilder();
    Quene<Node> q = new Queue<Node>();
    q.enqueue(root);
    
    while (!q.isEmpty()) {
        Node n = q.dequeue();
        if (n == null) {
            toReturn.append("null");
            toReturn.append(", ");
            continue;
        }
        toReturn.append(n.value);
        toReturn.append(", ");
        if (n.left != null) {
            q.enqueue(n.left);
        } else {
            // n.left is null
            q.enqueue(null);
        }
        
        if (n.right != null) {
            q.enqueue(n.right);
        } else {
            // n.right is null
            q.enqueue(null)
        }
    }
    return toReturn.toString();
}


/*
                3
            /      
            2
"3, 2"

"3, null"
*/



