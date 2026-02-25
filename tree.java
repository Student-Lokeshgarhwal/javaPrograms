import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class treverse {
    public static void InorderRecursive(Node root) {
        if (root == null)
            return;
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

    public static void Inorder(Node root) {
        if (root == null)
            return;
        Stack<Node> stack = new Stack<>();
        Node current = root;
        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.peek();
            stack.pop();
            System.out.println(current.data);
            current = current.right;
        }
    }

    public static void PreorderRecursive(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        PreorderRecursive(root.left);
        PreorderRecursive(root.right);
    }

    public static void Preorder(Node root) {
        if (root == null)
            return;
        Stack<Node> stack = new Stack<>();
        Node current = root;
        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                System.out.print(current.data + " ");
                current = current.left;
            }
            current = stack.peek();
            stack.pop();
            current = current.right;
        }
    }

    public static void PostorderRecursive(Node root){
        if(root == null) return;
        PostorderRecursive(root.left);
        PostorderRecursive(root.right);
        System.out.print(root.data+" ");
    }

    public static void Postorder(Node root){
    if(root == null) return;
    Stack<Node> stack1 = new Stack<>();
    Stack<Node> stack2 = new Stack<>();
    stack1.push(root);
    while (!stack1.isEmpty()) {
        Node n = stack1.peek();
        stack1.pop();
        stack2.push(n);
        if(n.left != null) stack1.push(n.left);
        if(n.right != null) stack1.push(n.right);
    }
    while (!stack2.isEmpty()) {
        System.out.print(stack2.peek().data+" ");
        stack2.pop();
    }
    }

    public static void BFS(Node root){
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0;i<size;i++){
                Node current = queue.peek();
                queue.remove();
                System.out.print(current.data+" ");
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
            // System.out.println();
        }
    }

}

public class tree {
    public static void main(String[] args) {
        Node root;
        root = new Node(5);
        root.left = new Node(10);
        root.right = new Node(15);
        root.left.right = new Node(25);
        root.right.left = new Node(30);

        treverse.InorderRecursive(root);
        System.out.println();
        treverse.Inorder(root);
        treverse.PreorderRecursive(root);
        System.out.println();
        treverse.Preorder(root);
        System.out.println();
        treverse.PostorderRecursive(root);
        System.out.println();
        treverse.Postorder(root);
        System.out.println();
        treverse.BFS(root);
    }
}
