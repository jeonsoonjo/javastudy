package ex02_loop;

// 4. 아래와 같은 모습으로 출력해보기
// 2x1=2	3x1=3 ...	9x1=9
// 2x2=4	3x2=6 ...	9x2=18
// ...
// 2x9=18	3x9=27...	9x9=81

public class Quiz04 {

	public static void main(String[] args) {
		
		for(int n=1; n<=9; n++) {
			for(int dan=2; dan<=9; dan++) {
				System.out.print(dan + "x" + n + "=" + (dan*n) + "\t");
			}
			System.out.println(); // 줄 바꿈
		}

	}

}
