import java.lang.*;
public class Cube {
int height;
int breadth;
int length;
public int getCubeVolume(){
	return(length*breadth*height);
}
//Constructor never return any value
Cube()
{
	length=10;
	breadth=20;
	height=30;
}
Cube(int l,int b,int h)
{
	length=l;
	breadth=b;
	height=h;
}
}