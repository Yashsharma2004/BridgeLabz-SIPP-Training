class Item {
    String itemName;
    int itemId;
    int quantity;
    double price;
    Item next;

    Item(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryLinkedList {
    Item head;

    void addAtBeginning(Item newItem) {
        newItem.next = head;
        head = newItem;
    }

    void addAtEnd(Item newItem) {
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    void addAtPosition(Item newItem, int position) {
        if (position <= 1 || head == null) {
            addAtBeginning(newItem);
            return;
        }
        Item temp = head;
        for (int i = 1; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        newItem.next = temp.next;
        temp.next = newItem;
    }

    void removeByItemId(int itemId) {
        if (head == null) return;
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    boolean updateQuantity(int itemId, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    Item searchById(int itemId) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) return temp;
            temp = temp.next;
        }
        return null;
    }

    Item searchByName(String name) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) return temp;
            temp = temp.next;
        }
        return null;
    }

    double calculateTotalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        return total;
    }

    void displayAll() {
        Item temp = head;
        while (temp != null) {
            System.out.println("Item Name: " + temp.itemName + ", ID: " + temp.itemId + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }

    void sortByName() {
        head = mergeSortByName(head);
    }

    void sortByPrice() {
        head = mergeSortByPrice(head);
    }

    Item mergeSortByName(Item head) {
        if (head == null || head.next == null) return head;
        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;
        Item left = mergeSortByName(head);
        Item right = mergeSortByName(nextOfMiddle);
        return sortedMergeByName(left, right);
    }

    Item mergeSortByPrice(Item head) {
        if (head == null || head.next == null) return head;
        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;
        Item left = mergeSortByPrice(head);
        Item right = mergeSortByPrice(nextOfMiddle);
        return sortedMergeByPrice(left, right);
    }

    Item sortedMergeByName(Item a, Item b) {
        if (a == null) return b;
        if (b == null) return a;
        if (a.itemName.compareToIgnoreCase(b.itemName) < 0) {
            a.next = sortedMergeByName(a.next, b);
            return a;
        } else {
            b.next = sortedMergeByName(a, b.next);
            return b;
        }
    }

    Item sortedMergeByPrice(Item a, Item b) {
        if (a == null) return b;
        if (b == null) return a;
        if (a.price < b.price) {
            a.next = sortedMergeByPrice(a.next, b);
            return a;
        } else {
            b.next = sortedMergeByPrice(a, b.next);
            return b;
        }
    }

    Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addAtEnd(new Item("Mouse", 1, 50, 250));
        inventory.addAtBeginning(new Item("Keyboard", 2, 30, 500));
        inventory.addAtPosition(new Item("Monitor", 3, 10, 8000), 2);

        System.out.println("All Items:");
        inventory.displayAll();

        System.out.println("\nTotal Inventory Value: " + inventory.calculateTotalValue());

        System.out.println("\nSorted by Name:");
        inventory.sortByName();
        inventory.displayAll();

        System.out.println("\nSorted by Price:");
        inventory.sortByPrice();
        inventory.displayAll();

        System.out.println("\nUpdating Quantity of Item ID 2:");
        inventory.updateQuantity(2, 40);
        inventory.displayAll();

        System.out.println("\nRemoving Item ID 1:");
        inventory.removeByItemId(1);
        inventory.displayAll();
    }
}
