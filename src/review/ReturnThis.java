public class ReturnThis {

  private class Node {
    int info;
    Node next;

    private Node(int info, Node next) {
      this.info = info;
      this.next = next;
    }

    private Node triple() {
      this.info = this.info * 3;
      return this;
    }
  }

  private void start() {
    Node a = new Node(2, null);
    Node b = new Node(3, a);
    a = a.triple();
  }

  public static void main(String[] args) {
    new ReturnThis().start();
  }
}

