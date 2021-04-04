package quiz01;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 임의의 멤버를 3명 저장하고,
// 사용자로부터 회원번호를 입력 받아서 해당 회원의 삭제를 진행하시오

public class MainClass {

	public static void main(String[] args) {
		
		// 임의의 멤버 3명 저장
		Member m1=new Member(1000, "user1", new Date(System.currentTimeMillis()));
		Member m2=new Member(1001, "user2", new Date(System.currentTimeMillis()));
		Member m3=new Member(1002, "user3", new Date(System.currentTimeMillis()));
		
		// 리스트 생성 및 추가
		List<Member> members=new ArrayList<Member>();
		members.add(m1);
		members.add(m2);
		members.add(m3);
		
		// 삭제할 회원번호 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 회원번호를 입력하세요 >>> ");
		int mNo=sc.nextInt();
		
		// 리스트 삭제
		int removeIdx=-1; // 삭제할 회원의 인덱스, 존재하지 않는 것으로 초기화(-1)
		int length=members.size(); // size() 메소드 호출을 1번만 진행하도록 변수에 저장한다
		for(int i=0; i<length; i++) {
			// members.get(0)==m1 과 같다
			if(members.get(i).getMNo()==mNo) { // 입력받은 회원번호와 일치하는지
				removeIdx=i;
				break;
			}
		}	
		if(removeIdx==-1) {
			System.out.println(mNo+" 회원번호를 가진 회원이 없습니다");
		} else {
			members.remove(removeIdx);
			System.out.println(mNo+" 회원번호를 가진 회원 정보를 삭제했습니다");
		}
		
		// member클래스는 toString() 메소드가 오버라이드 되어 있으므로
		// System.out.println(m1); 처럼 출력이 가능하다
		System.out.println("한 번에 확인: "+members);
		System.out.println("순회");
		for(Member member:members) {
			System.out.println(member);
		}
		
		sc.close();

	}

}
