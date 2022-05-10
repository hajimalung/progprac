import java.util.Scanner;

/**
 * SLL
 */
public class SLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("no of elements : ");
        int n = sc.nextInt();
        
        Node headNode = null;
        headNode = readList(n);
        printList(headNode);
        removenthFromEnd(headNode,2);

        sc.close();
    }   
    private static Node removenthFromEnd(Node headNode, int k) {
        int listlen = getLength(headNode);
        System.out.println("\nlist length : "+listlen);

        if(k>listlen){
            //not possible break 
            System.out.println("deletion not possible");
            return headNode;
        }
        int position = 0;
        Node temp = headNode;
        Node prev = null;
        while(position<listlen - k){
            prev =temp;
            temp = temp.next;
            position++;
        }
        prev.next = temp.next;
        printList(headNode);
        return headNode;
    }
    private static int getLength(Node headNode){
        if(headNode==null)return 0;
        if(headNode.value!=0 && headNode.next==null)return 1;       
        Node temp = headNode;
        int count = 1;  
        while(temp.next!=null){
            count++;
            temp = temp.next;
        }
    return count;
    }

    private static void printList(Node headNode) {
        while(headNode!=null){
            System.out.print(headNode.value+"->");
            headNode = headNode.next;
        }
        System.out.print("NULL");
    }
    private static Node readList(int n){
        Node headNode = null;
        Node temp = null;
        for(int i=0;i<n;i++){
            int value = (new Scanner(System.in)).nextInt();
            if(headNode==null){
                headNode = new Node(value);
                temp = headNode;
            }else{
                temp.next = new Node(value);
                temp = temp.next;
            }
        }
        return headNode;
    } 
}
class Node {
    int value;
    Node next;
    Node(){
        this.next = null;
    }
    Node(int value){
        this.value = value;
        this.next = null;
    }
    Node(int value,Node next){
        this.value = value;
        this.next = next;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}