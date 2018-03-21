/*
Created on: March 12th 2018
John Bousfield        ID: 300013161
Theo Van der Burgt    ID: 300019142
Last MOdified on: March 16th 2018
*/
public class LinkedQueue<E> implements Queue<E>{

  private int size;
  private element<E> front;
  private element<E> rear;

  public class element<E>{
    private E val;
    private element<E> next;

    private element(E val, element<E> next){
      this.val=val;
      this.next=next;
    }
  }

  public void LinkedQueue(){
    size=0;
  }

  public void enqueue(){

    element<E> thing;
    thing =new element<E>(val,null);
    if (isEmpty()){
      front = thing;
      rear = thing;
    }else{
      rear.next() = thing;
      rear = thing;
    }
    //TODO Not DONE!

  }
  public E dequeue(){
    //TODO Not Done.
  }
  public boolean isEmpty(){
    return this.size==0;
  }
  public int size(){
    return this.size;
  }
}
