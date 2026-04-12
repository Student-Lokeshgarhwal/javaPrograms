
// Definition for singly-linked list.

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
public class oddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode i = null;
        ListNode tempList = null;
        ListNode tempHead = null;
        int n = 1;
        while(temp != null){
            if(n % 2 == 0){
                if(tempList == null){
                    tempList = temp;
                    tempHead = temp;
                    }
                else {tempList.next = temp;
                tempList = tempList.next;}
            }else{
                if(i == null) i = temp;
                else{ i.next = temp;
                i = i.next;}
            }
            n++;
            temp = temp.next;
        }
        tempList.next = null;
        i.next = tempHead;
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        if (n == 0) return;

        System.out.println("Enter elements:");
        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }

        oddEvenLinkedList obj = new oddEvenLinkedList();
        head = obj.oddEvenList(head);

        System.out.println("Result:");
        temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}