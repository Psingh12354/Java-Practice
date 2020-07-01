import java.lang.String;
public class AccessSpecifier {
/* Three access specifier
 *Public 
 *Private
 *Protected
 *This keyword is use to diffrennte two variable with same name
 */
public String name;
public int age;
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
