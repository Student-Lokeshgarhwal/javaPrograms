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

public class deleteDuplicates {

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode temp = current.next;
        boolean change = false;
        out: while(temp != null){
            if(current.val == temp.val){
                temp = temp.next;
                change = true;
                if(temp == null){
                    current.next = null;
                    break out;
                }
            }else{
                if(change){
                    current.next = temp;
                    current = temp;
                    temp = temp.next;
                    change = false;
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
        head = ll.addElements(head, 10);
        head = ll.addElements(head, 12);
        head = ll.addElements(head, 15);
        head = ll.addElements(head, 15);
        head = ll.addElements(head, 20);
        head = deleteDuplicates(head);
        ll.display(head);
    }
}
