//Length Of LL
//For a given singly linked list of integers, find and return its length. Do it using an iterative method.

public class Solution {

	public static int length(LinkedListNode<Integer> head){
		//Your code goes here
		int count=0;
		while(head!=null){
			count++;
			head=head.next;
		}
		return count;
	}
}
