import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = right = null;
    }

    public static Node buildTreeBFS(Integer[] arr){
        if(arr.length == 0 || arr[0] == null) return null;
        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i= 1;
        while (!q.isEmpty() && i<arr.length) {
        Node current = q.poll();
        if(i<arr.length && arr[i] != null){
            current.left = new Node(arr[i]);
            q.add(current.left);
        }
        i++;
        if(i<arr.length && arr[i] != null){
            current.right = new Node(arr[i]);
            q.add(current.right);
        }
        i++;
        }
        return root;
    }

    static Map<Integer,Integer> map = new HashMap<>();
    static int index = 0;
    public static Node buildTreeInorder(int[] preOrder,int[] inorder){
        int low =0;
        int high = inorder.length-1;
        for(int i : inorder){
            map.put(i, index++);
        }
        index = 0;
        return build(preOrder, low, high);
    }

     public static Node build(int[] preorder,int low,int high){
        if(low > high) return null;
            int indexVal = preorder[index++];
            Node root = new Node(indexVal);
            int inOrderIndex = map.get(indexVal);
            root.left = build(preorder,low,inOrderIndex-1);
            root.right = build(preorder,inOrderIndex+1,high);
            return root;
        }

            
            static int postorderIndex;
            static Map<Integer,List<Integer>> mapPostOrder = new HashMap<>();
            public static Node buildTreePostOrder(int[] postorder,int[] inorder){
                mapPostOrder.clear();
            for(int i=0;i<inorder.length;i++){
                if(!mapPostOrder.containsKey(inorder[i])){
                mapPostOrder.put(inorder[i],new ArrayList<>());
                }
                mapPostOrder.get(inorder[i]).add(i);
            }
            int low = 0;
            int high = inorder.length-1;
            postorderIndex = postorder.length-1;
           
            return buildTreeInnerPostOrder(postorder,low,high);
        }

         public static Node buildTreeInnerPostOrder(int[] postorder,int low, int high){
            if(low > high) return null;
             int postorderVal = 0;
             int inOrderIndex = 0;
            System.out.println(low +" : " + high);
            postorderVal = postorder[postorderIndex--];
            inOrderIndex = mapPostOrder.get(postorderVal).remove(0);
            Node root = new Node(postorderVal);
            root.right = buildTreeInnerPostOrder(postorder,inOrderIndex+1,high);
            root.left = buildTreeInnerPostOrder(postorder,low,inOrderIndex-1);
            return root;
            }
}

public class buildTree {

    public static void main(String[] args) {
        // Integer[] arr = {1,2,null,3,null,4,5,null,7};
        // Node root = Node.buildTreeBFS(arr);
        // treverse.InorderRecursive(root);
        // int[] preOrder = {3,9,20,15,7};
        // int[] inorder = {9,3,15,20,7};
        // Node root = Node.buildTreeInorder(preOrder,inorder);
        // treverse.InorderRecursive(root);

        int[] postOrder = {9,15,7,20,3};
        int[] inorder = {9,3,15,20,7};
        Node root = Node.buildTreePostOrder(postOrder,inorder);
        treverse.BFS(root);

    }
}
