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
public class removeXElement {
     
     public static ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode current = null;
        ListNode temp = head;
        boolean change = false;
        out: while(temp != null){
            if(temp.val == val){
                temp = temp.next;
                change = true;
                if(temp == null){
                    if(current != null) current.next = null;
                    else{
                        head = current;
                    }
                    break out;
                }
            }else{
                if(change){
                    if(current != null){
                         current.next = temp;
                         change = false;
                    }
                    else{
                    current = temp;
                    head = current;
                    temp = temp.next;
                    }
                }else{
                    current = temp;
                temp = temp.next;
                }
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ListNode head = null;
        head = ll.addElements(head, 10);
        head = ll.addElements(head, 2);
        head = ll.addElements(head, 17);
        // ll.display(head);
        head = removeElements(head, 2);
        ll.display(head);
    }
}
