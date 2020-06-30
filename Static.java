import java.lang.String;
public class Static {
public static int age;
	public static String DoSomeThing(String message){
		return message;
	}
	/*public String DoSomethingElse(String message){
		return message;
	}*/
	public static String DoSomethingElse(String message){
		return message;
		// declare it as staitc to make it accessible
	}
}
// This static member is accessible by static function non static member cann't be call through it.