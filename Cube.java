/*
Created on: March 12th 2018
John Bousfield        ID: 300013161
Theo Van der Burgt    ID: 300019142
Last MOdified on: March 16th 2018
*/
public class Cube{
  Color[] faces, start;
  //faces = new Color[5];

  public void Cube(Color[] faces){
    for(int i=0; i<=faces.length;i++){
      this.start[i]=this.faces[i]=faces[i];

    }
  }
  //Next method NEEDS too DEEP COPY!!!!!!!!!!!!!!!!!!
  //needs methods   hasNext, next, and reset
  public void reset(){
    for (int i=0;i<6;i++){
      faces[i]=start[i];
    }
  }

  public void rotate(){
    Color temp=getLeft();
    faces[4]=faces[3];
    faces[3]=faces[2];
    faces[2]=faces[1];
    faces[1]=temp;
  }

  public void rightRoll(){
    Color temp=getLeft();
    faces[4]=faces[5];
    faces[5]=faces[2];
    faces[2]=faces[0];
    faces[0]=temp;
  }

  public void leftRoll(){
    Color temp=getLeft();
    faces[4]=faces[0];
    faces[0]=faces[2];
    faces[2]=faces[5];
    faces[5]=temp;
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
