public class ReviewDynamic {

  private class Node {
    int info;
    Node next;

    private Node(int info, Node next) {
      this.info = info;
      this.next = next;
    }
  }

  private int k;

  public ReviewDynamic(int k) {
    this.k = k;
  }

  private Node two(ReviewDynamic this, Node b) {
    Node c = new Node(this.k, node);
    return c;
  }

  private Node one() {
    Node a = new Node(2, new Node(3, null));
    a = this.two(this, a);
    return a;
  }

  public static void main(String[] args) {
    ReviewDynamic rd = new ReviewDynamic(1);
    rd.one();
  }
}

