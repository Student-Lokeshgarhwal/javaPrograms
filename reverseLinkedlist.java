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

public class reverseLinkedlist {

   public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode current = null;
        ListNode temp = head;
        ListNode p = temp.next;

        while(temp != null){
            temp.next = current;
            current = temp;
            head = current;
            temp = p;
            if(p == null) return head;
            p = p.next;
            
        }
        return head;
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ListNode head = null;
        head = ll.addElements(head, 10);
        head = ll.addElements(head, 2);
        head = ll.addElements(head, 12);
        head = ll.addElements(head, 15);
        head = ll.addElements(head, 4);
        head = ll.addElements(head, 20);
        head = reverseList(head);
        ll.display(head);
    }
}
