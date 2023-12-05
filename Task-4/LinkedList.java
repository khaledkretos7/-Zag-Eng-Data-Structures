
public class LinkedList {
    class Node {
        public Node(int item) {
            this.item = item;
        }
    }
        int item;
        Node nextNode;
        Node head;
        Node tail;
        int length = 0;

        private boolean isEmpty() {
            return head == null;
        }

        public void addFirst(int item) {
            Node node = new Node(item);
            if (isEmpty()) {
                head = tail = node;
            } else {
                node.nextNode = head;
                head = node;
            }
            length++;
        }

        public void addLast(int item) {
            Node node = new Node(item);
            if (isEmpty()) {
                head = tail = node;
            } else {
                tail.nextNode = node;
                tail = node;
            }
            length++;
        }

        public void removeFirst() {
            if (isEmpty()) {
                System.out.println("not valid");
            }
            if (head == tail) {
                head = tail = null;
            } else {
                Node curr = head;
                head = head.nextNode;
                curr.nextNode = null;
            }
            length--;
        }

        private Node getBeforeLast(){
            Node curr=head.nextNode;
            Node prev=head;
            while(curr!=prev){
                prev = curr;
                curr = curr.nextNode;
            }
            return prev;
        }

        public void removeLast() {
            if (isEmpty()) {
                System.out.println("not valid");
            }
            if (head == tail) {
                head = tail = null;
            }
            else{
                Node prev=getBeforeLast();
                tail=prev;
                tail.nextNode = null;
            }
            length--;
        }

        public int indexOf(int item){
            Node curr=head;
            int index=0;
            while (curr!= null) {
                if (curr.item == item) {
                    return index;
                }
                index++;
                curr = curr.nextNode;
            }
            return -1;
        }

        public boolean contains(int item) {
            int index=indexOf(item);
            if (index == -1) {
                return false;
            }
            return true;
        }

        public int size(){
            return length;
        }

        public void printElements(){
            Node curr=head;
            while (curr !=null) {
                System.out.println(curr.item);
                curr = curr.nextNode;
            }
        }

        public int max(){
            Node curr=head;
            int max=0;
            while (curr !=null) {
                if (max<curr.item) {
                    max=curr.item;
                    curr=curr.nextNode;
                }
            }
            return max;
        }
        public int min(){
            Node curr=head;
            int min=0;
            while (curr !=null) {
                if (min>curr.item) {
                    min=curr.item;
                    curr=curr.nextNode;
                }
            }
            return min;
        }
    
    }
