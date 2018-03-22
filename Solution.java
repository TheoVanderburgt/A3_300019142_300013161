/*
Created on: March 16th 2018
John Bousfield        ID: 300013161
Theo Van der Burgt    ID: 300019142
Last Modified: March 21st 2018
*/
public class Solution{
	Cube[] cubes = new Cube[4];
	int cubeCount = 0;

	public void Solution(Cube[] cubes){
		for(int i = 0; i < cubes.length; i++){
			this.cubes[i] = cubes[i];
			cubeCount++;
		}
	}

	public void Solution(Solution other, Cube c){
		if (other == null){
			cubes[0] = c;
			cubeCount++;
		}
		else{
			int i = 0;
			while (i < other.cubeCount){
				this.cubes[i] = other.cubes[i];
				i++;
				cubeCount++;
			}
			cubes[i] = c;
			cubeCount++;
		}
	}

	public int size(){
		return cubeCount;
	}

	public Cube getCube(int pos){
		return cubes[pos];
	}

	public boolean isValid(){
		//STILL NEEDS TO BE IMPLEMENTED
		return false;
	}

	public boolean isValid(Cube next){
		//STILL NEEDS TO BE IMPLEMENTED
		return false;

	}

	public String toString(){
		String solStr = "";
		if (cubeCount ==0){
			return "Null Solution";
		}
		else{
			for(int i=0; i < cubeCount-1; i++){
				solStr += cubes[i].toString() + ",";
			}
			solStr += cubes[cubeCount-1].toString();
			return solStr;
		}
	}
}
