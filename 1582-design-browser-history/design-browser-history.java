class Node {
    String url;
    Node next;
    Node prev;

    Node(String url) {
        this.url = url;
    }
}

class BrowserHistory {
    Node cur;

    public BrowserHistory(String homepage) {
        Node home = new Node(homepage);
        cur = home;
    }

    public void visit(String url) {
        Node page = new Node(url);
        cur.next = page;
        page.prev = cur;
        cur = page;
    }

    public String back(int steps) {
        for (int i = 0; i < steps; i++) {
            if (cur.prev != null) {
                cur = cur.prev;
            }
        }
        return cur.url;
    }

    public String forward(int steps) {
        for (int i = 0; i < steps; i++) {
            if (cur.next != null) {
                cur = cur.next;
            }
        }
        return cur.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */