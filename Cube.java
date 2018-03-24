/*
Created on: March 12th 2018
John Bousfield        ID: 300013161
Theo Van der Burgt    ID: 300019142
Last MOdified on: March 16th 2018
*/
public class Cube{
  private Color[] faces, start;
  private int nextCounter;
  //faces = new Color[5];


  public void Cube(Color[] faces){
    nextCounter=0;
    for(int i=0; i<=faces.length;i++){
      this.faces[i]=faces[i];
      this.start[i]=faces[i];
    }
  }
  public void Cube(Cube other){ //cube copies other cube
    nextCounter=other.nextCounter;
    for(int i=0; i<=faces.length;i++){
      this.start[i]=other.faces[i];
      this.start[i]=other.faces[i];
    }
  }


  public Cube copy(){//TODO Fix this
    Cube cubeCopy = new Cube();
    for (int i=0;i<=faces.length;i++){
      cubeCopy.faces[i]=faces[i];
    }
    return cubeCopy;
  }



public void reset(){//to original form
  for (int i=0;i<6;i++){
    faces[i]=start[i];
  }
}


private void rotate(){
  Color temp=getLeft();
  faces[4]=faces[3];
  faces[3]=faces[2];
  faces[2]=faces[1];
  faces[1]=temp;
}


private void rightRoll(){
  Color temp=getLeft();
  faces[4]=faces[5];
  faces[5]=faces[2];
  faces[2]=faces[0];
  faces[0]=temp;
}


private void leftRoll(){
  Color temp=getLeft();
  faces[4]=faces[0];
  faces[0]=faces[2];
  faces[2]=faces[5];
  faces[5]=temp;
}


public boolean hasNext(){
  return nextCounter<23;
}


public void next(){
  if (hasNext()){
    if (nextCounter==4 || nextCounter==8 ||nextCounter==20){
      this.rightRoll();
    }else if (nextCounter==12||nextCounter==16){
      this.leftRoll();
    }else{
      this.rotate();
    }
  }else{
     throw new IllegalStateException("has no new states");
  }
}



public Color getUp(){
  return faces[0];
}
public Color getFront(){
  return faces[1];
}
public Color getRight(){
  return faces[2];
}
public Color getBack(){
  return faces[3];
}
public Color getLeft(){
  return faces[4];
}
public Color getDown(){
  return faces[5];
}
public String toString(){
  return "[" +getUp()+","+getFront()+","+getRight()+","+getBack()+","+getLeft()+","+getDown()+"]";
}
}
