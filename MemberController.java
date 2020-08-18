package board;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {
	
	Member loginedMember = null; // 로그인한 유저 저장 변수

	Scanner sc = new Scanner(System.in);
	ArrayList<Member> members = new ArrayList<>();

	void doCommand(String cmd) {
		if(cmd.equals("signup")) {
			
			Member member = new Member();
			Member member1 = new Member("hong123","h1234","홍길동" );
			members.add(member1);
			
			
			System.out.println("아이디를 입력해주세요");
			member.setLoginId(sc.nextLine());

			System.out.println("비밀번호를 입력해주세요");
			member.setLoginPw(sc.nextLine());
			
			System.out.println("이름을 입력해주세요");
			member.setUserName(sc.nextLine());

			members.add(member);
						
		} else if(cmd.equals("login")) {
			System.out.println("아이디를 입력해주세요.");
			String loginId = sc.nextLine();
			

			int targetIndex = getMemberIndexById(loginId);

			if (targetIndex == -1) {
				System.out.println("없는 회원입니다.");
			} else {
				
				Member member = members.get(targetIndex);
				if(loginPw.equals(member.getLoginPw())) {
					System.out.println(member.getUserName() + "님반갑습니다.");
					logined
				}else {
					System.out.println("로그인실패");
					
				}		
//				System.out.println("아이디 :" + member.getLoginId);
//				System.out.println("비밀번호 :"+ member.getLoginPw);
//				System.out.println("이름 :" + member.uerName);
			}
				
			// 해당 유저 정보 모두 출력 
		}
	}
	
	int getArticleIndexById(int loginId) {
		int targetIndex = -1; // 찾는게 없을 때 -1

		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getLoginId() == loginId) {
				targetIndex = i;
			}
		}	

		return targetIndex;
	}
}	
	
			
			