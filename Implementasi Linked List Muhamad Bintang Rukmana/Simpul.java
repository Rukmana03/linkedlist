public class Simpul {
    private Node head;

    private class Node {
        String nim;
        String nama;
        int nilai;
        Node next;

        Node(String xnim, String xnama, int xnilai) {
            nim = xnim;
            nama = xnama;
            nilai = xnilai;
            next = null;
        }

        void infoData() {
            System.out.println("NIM : " + nim);
            System.out.println("NAMA : " + nama);
            System.out.println("NILAI : " + nilai);
            System.out.println("Pointer Next" + next);
            System.out.println("----------------");
        }
    }

    public void insertAtEnd(String xnim, String xnama, int xnilai) {
        Node newNode = new Node(xnim, xnama, xnilai);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            current.infoData();
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Simpul list = new Simpul();
        list.insertAtEnd("20220040031", "Muhamad Bintang Rukmana", 90);
        list.insertAtEnd("20220040031", "Muhamad Bintang Rukmana", 85);
        list.insertAtEnd("20220040031", "Muhamad Bintang Rukmana", 95);
        list.display();
    }
}