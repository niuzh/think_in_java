package ch04;

import static java.lang.System.out;
public class LabledWhile {

	public static void main(String[] args) {
		int i=0;
		outer://标签用于迭代语句之前
			while (true) {
				out.println("out while loop");
				while (true) {
					i++;
					out.println("i="+i);
					if(i==1){
						out.println("continue");
						//退回最内层循环的开头，继续执行。
						continue;
					}
					if(i==3){
						out.println("continue out");
						//到达标签的位置，继续执行
						continue outer;
					}
					if(i==5){
						out.println("break");
//						中断并退出当前循环
						break;
					}
					if(i==7){
						out.println("break outer");
//						跳出标签所指的循环
						break outer;
					}
				}
			}
	}

}
