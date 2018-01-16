package strings;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle {
	private String name;
	private Formatter formatter;
	public Turtle(String name,Formatter formatter) {
		this.name=name;
		this.formatter=formatter;
	}
	public void move(int x,int y) {
		formatter.format("%s The Turtle is at  (%d,%d)\n", name,x,y);
	}
	public static void main(String[] args) {
		PrintStream oStream=System.out;
		Turtle tommy=new Turtle("Tommy", new Formatter(System.err));
		Turtle terry=new Turtle("Terry", new Formatter(oStream));
		tommy.move(0,0);
		terry.move(4,8);
		tommy.move(3,4);
		terry.move(2,5);
		tommy.move(3,3);
		terry.move(3,3);
	}

}
