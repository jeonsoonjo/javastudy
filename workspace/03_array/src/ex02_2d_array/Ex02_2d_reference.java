package ex02_2d_array;

public class Ex02_2d_reference {

	public static void main(String[] args) {
		
		int[][] a = {
				{1,2},
				{3,4,5,6},
				{7,8,9}
		};
		System.out.println(a); // [[ 2차원 배열을 뜻함
		
		System.out.println(a[0]); // [ 1차원 배열 3개를 가지고 있음을 뜻함 // a[0] {1,2}
		System.out.println(a[1]); // a[1] {3,4,5,6}
		System.out.println(a[2]); // a[2] {7,8,9}

		System.out.println(a.length); // 3 (a[0], a[1], a[2])
		
		System.out.println(a[0].length); // 2
		System.out.println(a[1].length); // 4
		System.out.println(a[2].length); // 3
		
		// for문으로 순회(무조건 암기)
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
