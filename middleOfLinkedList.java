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

public class middleOfLinkedList {

    public static ListNode middleNode(ListNode head) {
        if(head.next == null) return head;
        ListNode temp = head;
        int counter = -1;
        while(temp != null){
            counter++;
            temp = temp.next;
        }
        int mid = (int) Math.ceil((float) counter/2);
        int tempCounter = 0;
        temp = head;
        while(tempCounter <= mid){
            if(tempCounter == mid){
                head = temp;
                return head;
            }
            tempCounter++;
            temp = temp.next;
            
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
        head = middleNode(head);
        ll.display(head);
    }
}
