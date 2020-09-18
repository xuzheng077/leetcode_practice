package algorithms;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Xu Zheng
 * @description 反转单链表
 *
 */
public class reverseList {

//    //非递归
//    public static ListNode reverseList(ListNode node){
//
//    }
//
//    //递归
//    public static ListNode recursiveReverseList(ListNode node){
//
//    }


    public static void main(String[] args) {
        ListNode node0 = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

//        ListNode result1 = reverseList(node0);
//        System.out.println("Non-Recursive:");
//        while(result1!= null){
//            System.out.print(result1.val + " ");
//            result1 = result1.next;
//        }
//        ListNode result2 = recursiveReverseList(node0);
//        System.out.println("Recursive:");
//        while(result2!= null){
//            System.out.print(result2.val + " ");
//            result2 = result2.next;
//        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);

        for (int i: map.keySet()){
            System.out.print(map.get(i));
        }



    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
