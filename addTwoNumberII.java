import java.util.Stack;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        next = null;
    }
}

class Linkedlist {

    public ListNode addElements(ListNode head, int val) {
        ListNode nn = new ListNode(val);
        if(head == null){
            head = nn;
            return head;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nn;
        return head;
     }
     public void display(ListNode head) {
        if(head == null){
            System.out.println("no node exists");
            return ;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
     }
}
public class addTwoNumberII {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        ListNode temp1 = l1;
        ListNode temp2 = l2;
         while(temp1 != null){
            stack1.push(temp1.val);
            temp1 = temp1.next;
        }
         while(temp2 != null){
            stack2.push(temp2.val);
            temp2 = temp2.next;
        }
        Stack<Integer> stack3 = new Stack<>();
        int carry = 0;
        int value = 0;
        int sum = 0;
        while(!stack1.isEmpty() && !stack2.isEmpty())
        {
                    value = stack1.peek() + stack2.peek();
                    value += carry;
                    if(value <= 9){
                       stack3.push(value);
                        carry = 0;
                        stack1.pop();
                        stack2.pop();
                    }else{
                        sum = value %10;
                        carry = value/10;
                        stack3.push(sum);
                        stack1.pop();
                        stack2.pop();
                    }
        }
        while(!stack1.isEmpty())
        {
                    value = stack1.peek() + carry;
                     if(value <= 9){
                       stack3.push(value);
                        carry = 0;
                        stack1.pop();
                    }else{
                        sum = value %10;
                        carry = value/10;
                        stack3.push(sum);
                        stack1.pop();
                    }
        }
        while(!stack2.isEmpty())
        {
                    value = stack2.peek() + carry;
                     if(value <= 9){
                       stack3.push(value);
                        carry = 0;
                        stack2.pop();
                    }else{
                        sum = value %10;
                        carry = value/10;
                        stack3.push(sum);
                        stack2.pop();
                    }
        }
       if(carry != 0) stack3.push(carry);
        ListNode currentNode = null;
        ListNode resultHead = null;
        while(!stack3.isEmpty()){
        ListNode newNode = new ListNode(stack3.peek());
                        if(currentNode != null){ 
                            currentNode.next = newNode;
                            currentNode = newNode;
                            }
                        else{
                            currentNode = newNode;
                            resultHead = currentNode;
                        }
                        stack3.pop();
        }
        return resultHead;
    }
    public static void main(String[] args) {
        ListNode head1 = null;
        ListNode head2 = null;
        Linkedlist list1= new Linkedlist();
        head1 = list1.addElements(head1,10);
        head1 = list1.addElements(head1,12);
        head1 = list1.addElements(head1,6);
        head1 = list1.addElements(head1,9);
        Linkedlist list2 = new Linkedlist();
        head2 = list2.addElements(head2,6);
        head2 = list2.addElements(head2,7);
        head2 = list2.addElements(head2,2);
        head2 = list2.addElements(head2,1);
        list1.display(head1);
        System.out.println();
        list2.display(head2);
        System.out.println();
        
        ListNode resultHead = null;
        resultHead = addTwoNumberII.addTwoNumbers(head1, head2);
        while(resultHead != null){
            System.out.print(resultHead.val+" ");
            resultHead = resultHead.next;
        }
         
    }

}
