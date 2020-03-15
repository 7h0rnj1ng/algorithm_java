
import java.util.ArrayList;

public class Output_linkedlist_from_end_to_start06 {
    /*创建内部类*/
    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 方式一：采用arraylist 的list.add(0,value)
     * 方式二：采用stack，先读取链表压栈，再出栈加入list。
     *
     * @param listNode
     * @return
     */

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = listNode;
        while (temp !=null){
            list.add(0,temp.val);
            temp = temp.next;
        }
        return list;
    }

    public static void main(String[] args) {
        Output_linkedlist_from_end_to_start06 outputlinkedlistfromendtostart06 = new Output_linkedlist_from_end_to_start06();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        for (int i : outputlinkedlistfromendtostart06.printListFromTailToHead(l1)) {
            System.out.print(i + " ");
        }
    }


}
