package linkedLists;
import java.util.Scanner;

class SNode {

    SNode link = null;
    int data = 0;

    public SNode() {
        link = null;
        data = 0;
    }

    public SNode(int data, SNode link) {
        this.data = data;
        this.link = null;
    }

    public SNode getLink() {
        return link;
    }

    public void setLink(SNode link) {
        this.link = link;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}

class SinglyLinkedListImpl {

    SNode start = null;
    SNode end = null;
    int size = 0;

    public SinglyLinkedListImpl() {
        start = null;
        end = null;
        size = 0;
    }

    public void insertAtStart(int data) {
        SNode nptr = new SNode(data, null);
        if (start == null) {
            start = nptr;
            end = start;
        } else {
            nptr.setLink(start);
            start = nptr;
        }
        size++;
    }

    public void insertAtEnd(int data) {
        SNode nptr = new SNode(data, null);
        if (start == null) {
            start = nptr;
            end = nptr;
        } else {
            end.setLink(nptr);
            end = nptr;
        }
        size++;
    }

    public void insertAtPosition(int position, int data) {
        SNode nptr = new SNode(data, null);
        SNode ptr = start;
        position = position - 1;
        for (int i = 1; i < size; i++) {
            if (i == position) {
                SNode temp = ptr.getLink();
                ptr.setLink(nptr);
                nptr.setLink(temp);
                break;
            }
            ptr = ptr.getLink();
        }
        size++;
    }

    public void repleaceDataAtPosition(int position, int data) {
        if (start == null) {
            System.out.println("Empty!");
            return;
        }

        SNode ptr = start;
        for (int i = 1; i < size; i++) {
            if (i == position) {
                ptr.setData(data);
            }
            ptr = ptr.getLink();
        }
    }

    public void deleteAtPosition(int position) {
        if (start == null) {
            System.out.println("Empty!");
            return;
        }

        if (position == size) {
            SNode startPtr = start;
            SNode endPtr = start;
            while (startPtr != null) {
                endPtr = startPtr;
                startPtr = startPtr.getLink();
            }
            end = endPtr;
            end.setLink(null);
            size--;
            return;
        }

        SNode ptr = start;
        position = position - 1;
        for (int i = 1; i < size; i++) {

            if (i == position) {
                SNode temp = ptr.getLink();
                temp = temp.getLink();
                ptr.setLink(temp);
                break;
            }
            ptr = ptr.getLink();
        }
        size--;
    }

    public void deleteNodeByGivenData(int data) {
        if (start == null) {
            System.out.println("Empty!");
            return;
        }

        if (start.getData() == data && start.getLink() == null) {
            start = null;
            end = null;
            size--;
            return;
        }

        if (start.getData() == data && start.getLink() != null) {
            start = start.getLink();
            size--;
            return;
        }

        if (end.getData() == data) {
            SNode startPtr = start;
            SNode endPtr = start;

            startPtr = startPtr.getLink();
            while (startPtr.getLink() != null) {
                endPtr = startPtr;
                startPtr = startPtr.getLink();
            }
            end = endPtr;
            end.setLink(null);
            size--;
            return;
        }

        SNode startPtr = start;
        SNode prevLink = startPtr;
        startPtr = startPtr.getLink();
        while (startPtr.getData() != data && startPtr.getLink() != null) {
            prevLink = startPtr;
            startPtr = startPtr.getLink();
        }
        if (startPtr.getData() == data) {
            SNode temp = prevLink.getLink();
            temp = temp.getLink();
            prevLink.setLink(temp);
            size--;
            return;
        }

        System.out.println(data + " not found!");
    }

    public void disply() {
        if (start == null) {
            System.out.println("Empty!");
            return;
        }

        if (start.getLink() == null) {
            System.out.println(start.getData());
            return;
        }

        SNode ptr = start;
        System.out.print(ptr.getData() + "->");
        ptr = start.getLink();
        while (ptr.getLink() != null) {
            System.out.print(ptr.getData() + "->");
            ptr = ptr.getLink();
        }
        System.out.println(ptr.getData() + "\n");
    }

    public void searchElementByPosition(int position) {
        if (position == 1) {
            System.out.println("Element at " + position + " is : " + start.getData());
            return;
        }

        if (position == size) {
            System.out.println("Element at " + position + " is : " + end.getData());
            return;
        }

        SNode ptr = start;
        for (int i = 1; i < size; i++) {
            if (i == position) {
                System.out.println("Element at " + position + " is : " + ptr.getData());
                break;
            }
            ptr = ptr.getLink();
        }
    }

    public void searchElementIteratively(int data) {

        if (isEmpty()) {
            System.out.println("Empty!");
            return;
        }

        if (start.getData() == data) {
            System.out.println(data + " found at " + 1 + " position");
            return;
        }

        if (start.getLink() != null && end.getData() == data) {
            System.out.println(data + " found at " + size + " position");
            return;
        }

        SNode startPtr = start;
        int position = 0;
        while (startPtr.getLink() != null) {
            ++position;
            if (startPtr.getData() == data) {
                break;
            }
            startPtr = startPtr.getLink();
        }
        if (startPtr.getData() == data) {
            System.out.println(data + " found at " + position);
            return;
        }

        System.out.println(data + " No found!");
    }

    public void searchElementRecursively(SNode start, int data, int count) {

        if (isEmpty()) {
            System.out.println("Empty!");
            return;
        }
        if (start.getData() == data) {
            System.out.println(data + " found at " + (++count));
            return;
        }
        if (start.getLink() == null) {
            System.out.println(data + " not found!");
            return;
        }
        searchElementRecursively(start.getLink(), data, ++count);
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return start == null;
    }
}

public class SinglyLinkedList {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        SinglyLinkedListImpl listImpl = new SinglyLinkedListImpl();
        System.out.println("Singly Linked list : ");
        boolean yes = true;
        do {
            System.out.println("1 Insert At Start :");
            System.out.println("2 Insert At End :");
            System.out.println("3 Insert At any Position :");
            System.out.println("4 Delete At any Position :");
            System.out.println("5 Display :");
            System.out.println("6 Get Size");
            System.out.println("7 Empty Status");
            System.out.println("8 Replace data at given postion");
            System.out.println("9 Search Element by position ");
            System.out.println("10 Delete a Node by Given Data");
            System.out.println("11 Search Element Iteratively");
            System.out.println("12 Search Element Recursively");
            System.out.println("13 Exit :");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
            case 1:
                listImpl.insertAtStart(scanner.nextInt());
                break;

            case 2:
                listImpl.insertAtEnd(scanner.nextInt());
                break;

            case 3:
                int position = scanner.nextInt();
                if (position <= 1 || position > listImpl.getSize()) {
                    System.out.println("invalid position!");
                } else {
                    listImpl.insertAtPosition(position, scanner.nextInt());
                }
                break;

            case 4:
                int deletePosition = scanner.nextInt();
                if (deletePosition <= 1 || deletePosition > listImpl.getSize()) {
                    System.out.println("invalid position!");
                } else {
                    listImpl.deleteAtPosition(deletePosition);
                }
                break;

            case 5:
                listImpl.disply();
                break;

            case 6:
                System.out.println(listImpl.getSize());
                break;

            case 7:
                System.out.println(listImpl.isEmpty());
                break;

            case 8:
                int replacePosition = scanner.nextInt();
                if (replacePosition < 1 || replacePosition > listImpl.getSize()) {
                    System.out.println("Invalid position!");
                } else {
                    listImpl.repleaceDataAtPosition(replacePosition, scanner.nextInt());
                }
                break;

            case 9:
                int searchPosition = scanner.nextInt();
                if (searchPosition < 1 || searchPosition > listImpl.getSize()) {
                    System.out.println("Invalid position!");
                } else {
                    listImpl.searchElementByPosition(searchPosition);
                }
                break;

            case 10:
                listImpl.deleteNodeByGivenData(scanner.nextInt());
                break;

            case 11:
                listImpl.searchElementIteratively(scanner.nextInt());
                break;

            case 12:
                listImpl.searchElementRecursively(listImpl.start, scanner.nextInt(), 0);
                break;

            default:
                System.out.println("invalid choice");
                break;
            }
        } while (yes);
    }
}