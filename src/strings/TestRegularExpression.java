package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
	private static String testString="public static void main(String[] args) {";
	public static void main(String[] args) {
		if(args.length<2){
			args=new String[2];
			args[0]="void";
			args[1]="main";
		}
		//System.out.println(args);
		for (String arg : args) {
			Pattern pattern=Pattern.compile(arg);
			Matcher matcher=pattern.matcher(testString);
			while (matcher.find()) {
				System.out.println(testString);
				System.out.println("Match \""+matcher.group()+"\""+"at positions "+
						matcher.start()+"-" +(matcher.end()-1));
				System.out.println("deal String:"+
						testString.substring(0, matcher.start())+
						testString.substring(matcher.end(),testString.length()));
			}
			
		}
	}
}
