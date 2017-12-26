package ch02;
//引用程序使用到的类，程序默认倒入java.lang类库
import java.util.Date;
//命令行执行：cd src目录$ java ch02.HelloDate
/**
 * the first thinking in java example program.
 * Displays a string and today' date
 * @author niuzhihuan
 * @version 4.0
 *
 */
public class HelloDate {
	
	/**
	 * Entry point to class
	 * @param args	array of String arguments
	 * @throws exceptions no exceptions throw
	 */
	public static void main(String[] args) {
		System.out.println("Hello,it's :");
		System.out.println(new Date());
	}

}
