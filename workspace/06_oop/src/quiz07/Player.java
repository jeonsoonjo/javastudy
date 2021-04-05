package quiz07;

import java.util.Scanner;

public class Player {

	// field
	private String name;
	private Scanner sc=new Scanner(System.in);
	
	// constructor
	public Player(String name) {
		this.name=name;
	}
	
	// method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int play() {
		System.out.println(name+"'s game start!");
		System.out.println("Press Enter!");
		// Enter입력 : nextLine()
		sc.nextLine();
		long start=System.currentTimeMillis(); // Enter 눌렀을 때 start시간을 잰다
		System.out.println("After 10seconds Press Enter!");
		sc.nextLine();
		long end=System.currentTimeMillis(); // Enter 눌렀을 때 end시간을 잰다. 즉, start-end 시간이 10초에 가까우면 이기는 게임
		return (int)(end-start)/1000; // 경과시간 반환, 밀리초니까 1000으로 나눠준다
	}
	
}
