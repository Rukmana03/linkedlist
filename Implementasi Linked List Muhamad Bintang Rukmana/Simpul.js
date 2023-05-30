class Node {
    constructor(xnim, xnama, xnilai) {
      this.nim = xnim;
      this.nama = xnama;
      this.nilai = xnilai;
      this.next = null;
    }
  
    infoData() {
      console.log("NIM : " + this.nim);
      console.log("NAMA : " + this.nama);
      console.log("NILAI : " + this.nilai);
      console.log("Pointer Next" + this.next);
      console.log("----------------");
    }
  }
  
  class LinkedList {
    constructor() {
      this.head = null;
    }
  
    insertAtEnd(xnim, xnama, xnilai) {
      let newNode = new Node(xnim, xnama, xnilai);
      if (this.head === null) {
        this.head = newNode;
        return;
      }
      let current = this.head;
      while (current.next !== null) {
        current = current.next;
      }
      current.next = newNode;
    }
  
    display() {
      let current = this.head;
      while (current !== null) {
        current.infoData();
        current = current.next;
      }
    }
  }
  
  let list = new LinkedList();
  list.insertAtEnd("20220040031", "Muhamad Bintang Rukmana", 90);
  list.insertAtEnd("20220040031", "Muhamad Bintang Rukmana", 85);
  list.insertAtEnd("20220040031", "Muhamad Bintang Rukmana", 95);
  list.display();