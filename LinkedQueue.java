/*
Created on: March 12th 2018
John Bousfield        ID: 300013161
Theo Van der Burgt    ID: 300019142
Last MOdified on: March 16th 2018
*/
public class LinkedQueue<E> implements Queue{

  public static Element<T>{
    private T val;
    private Element<T> next;

    private Element(T val, Element<T> next){
      this.val=val;
      this.next=next;
    }
  }
  private int size;
  private Element<E> front;
  private Element<E> rear;
  public void LinkedQueue(){
    this.size==0;
  }

  public void enqueue(){
    Element<E> thing;
    thing=new Element<E>(val,null);

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
