package Delete_Node_in_a_Linked_List;

public class Solution {
	public void deleteNode(ListNode node) {
		
        if (node.next != null) {
			node.val = node.next.val;
			node.next = node.next.next;
		}
        
    }
}
