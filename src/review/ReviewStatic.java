public class ReviewStatic {

  private static class Node {
    int info;
    Node next;

    private Node(int info, Node next) {
      this.info = info;
      this.next = next;
    }
  }

  private static Node two(Node c) {
    c.info = c.info + 1;
    return c;
  }

  private static Node one(int k, Node a) {
    Node b = new Node(k, a);
    return two(b);
  }

  public static void main(String[] args) {
    Node a = new Node(2, new Node(3, null));
    a = one(0, a);
  }
}
