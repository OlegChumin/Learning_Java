package JetBrains;

public class Bitwize {
    public static void main(String[] args) {
        boolean b2 = true;
        boolean b1 = false;
        System.out.println(b1^b2);
    }

}

class Obj {
    void method() {
    }

    int method(int x) {
        return 9;
    }
}

class Hotel {
    String name;
    String address;
    int rating;
}

class Testing {
    public static void main(String[] args) {
        Hotel h1 = new Hotel();
        Hotel h2 = new Hotel();
        Hotel h3 = h2;

        h2.rating =9;
        h3.rating =8;
        h1.rating =7;
        System.out.println(h2.rating + " " + h3.rating + " " + h1.rating);
    }
}

class Account {

    private long balance;
    private String ownerName;
    private boolean locked;

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}