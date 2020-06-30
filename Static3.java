import java.lang.String;
public class Static3 {
String name;
int age;
static int NoOfStudent=0;
Static3()
{
	NoOfStudent++;
}
public static int getNoOfStudent(){
	return NoOfStudent;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
