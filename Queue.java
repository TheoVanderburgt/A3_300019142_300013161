/*
Created on: March 12th 2018
John Bousfield        ID: 300013161
Theo Van der Burgt    ID: 300019142
Last MOdified on: March 16th 2018
*/
public interface Queue<E>{
  void enqueue(E obj);
  E dequeue();
  boolean isEmpty();
  int size();
}
