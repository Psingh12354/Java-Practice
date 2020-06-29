import java.lang.String;
public class CubeClassCall {

	public static void main(String[] args) {
	
		Cube object=new Cube();
		System.out.println(object.getCubeVolume());
		Cube object2=new Cube(30,32,43);
		System.out.println(object2.getCubeVolume());
		}

}
