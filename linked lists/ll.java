class node {
    int value;
    node next;

    node(int value) {
        this.value = value;
    }

    node(int value, node next) {
        this.value = value;
        this.next = next;
    }

    static void display(node n) {
        node temp = n;
        while (temp != null) {
            if (temp.next != null) {
                System.out.print(temp.value + " -> ");
            } else {
                System.out.print(temp.value);
            }
            temp = temp.next;
        }
        System.out.println();
    }

    void add(node n, int val) {
        node temp = n;
        while (temp.next != null) {
            temp = temp.next;
        }
        node x = new node(val);
        temp.next = x;

    }

    node deletehead(node h) {
        node temp = h;
        h = h.next;
        temp.next = null;
        return h;
    }

    node deletetail(node h) {
        if (h.next == null || h == null) {
            return null;
        }
        node prev = null;
        node curr = h;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;
        curr = null;
        return h;
    }

  node deleteposition(node head,int k){
    node temp=head;
    if(head==null){
        return head;
    }
    if(k==1){
      
        head=head.next;
        temp=null;
        return head;
    }
    int ct=0;
    node prev=null;
    while(temp!=null){
        ct+=1;
      
        if(ct==k){
            prev.next=prev.next.next;
            temp=null;
            return head;
        }
        prev=temp;
        temp=temp.next;
        

    }
    return head;
  }
}

public class ll {
    public static void main(String[] args) {
        node head = new node(1);
        head.add(head, 2);
        head.add(head, 3);
        head.add(head, 4);

        node.display(head);
        head=head.deleteposition(head, 2);
        node.display(head);

    }
}
