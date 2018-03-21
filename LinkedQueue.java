/*
Created on: March 12th 2018
John Bousfield        ID: 300013161
Theo Van der Burgt    ID: 300019142
Last MOdified on: March 16th 2018
*/
public class LinkedQueue<E> implements Queue<E>{

  private int size;
  private element<E> first;
  private element<E> last;

  public class element<E>{
    private E value;
    private element<E> next;

    private element(E value, element<E> next){
      this.value=value;
      this.next=next;
    }
  }

  public void LinkedQueue(){
    size=0;
  }

  public void enqueue(E obj){

    element<E> thing;
    size++;
    thing =new element<E>(obj,null);
    if (isEmpty()){
      first = thing;
      last = thing;
    }else{
      last.next = thing;
      last = thing;
    }
    //TODO Not DONE!

  }
  public E dequeue(){
    if (!isEmpty()){
      E temp;
      temp=first.value;
      first=first.next;
      size--;
      return temp;
    }
    return null;//TODO add actuall ending THIS IS NOT A 
  }
  public boolean isEmpty(){
    return this.size==0;
  }
  public int size(){
    return size;
  }
}
