package ParConsFinalize;

class Volume{
	float length;
	float breadth;
	float height;
	
	Volume( float a, float b, float c){
		length=a;
		breadth=b;
		height=c;
		
		System.out.println( "Volume computed is " + length*breadth*height);
		
	}
	
	protected void finalize(){
		System.out.println("Finalize to terminate");
		
	}
	
}

public class ParConsFinalize {
	public static void main(String args[]){
		
		Volume obj = new Volume(10,5,8);

	}


}
