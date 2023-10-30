package mms.member.util;
//5. 사용자로부터의 입력을 콘솔에서 읽어 들이거나 콘솔로 메시지를 출력하는 역할을 하는 클래스 구현
import java.util.ArrayList;
import java.util.Scanner;
import mms.member.vo.Member;

public class ConsoleUtil {
	//1. insert(Add)
	public Member getNewMember(Scanner sc) {
		System.out.println("등록할 회원 정보를 입력하세요");
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("주소 : ");
		String addr = sc.next();
		
		System.out.print("국가 : ");
		String nation = sc.next();
		
		System.out.print("이메일 : ");
		String email = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		return new Member(name, addr, nation, email, age);
	}

	public void printAddSuccessMessage(Member newMember) {
		System.out.println(newMember.getName() + " 회원 정보 추가 성공");
	}
	
	public void printAddFailMessage(Member newMember) {
		System.out.println(newMember.getName() + " 회원 정보 추가 실패");
	}

	
	//2.select all
	public void printMemberList(ArrayList<Member> memberList) {
		//size() : 컬렉션에 저장되어 있는 요소의 개수를 리턴하는 메소드
		for(int i=0;i<memberList.size();i++){
			System.out.println(memberList.get(i));
			//자바 에서 객체에 + 연산이 이루어 지거나 객체가 print 메소드의 파라미터로 지정되면 해당 객체의 toString() 메소드가 자동으로 호출됨.
		}
	}

	public String getName(String msgKind, Scanner sc) {
		System.out.println(msgKind + " 회원이름을 입력하세요");
		System.out.print("회원이름 : ");
		return sc.next();
	}

	
	//4.update
	public Member getUpdateMember(Scanner sc, Member oldMember) {	
		System.out.println("수정할 회원 정보를 입력하세요");
		System.out.print("이전 국가 : " + oldMember.getNation());
		System.out.print("수정할 국가 : ");
		String nation = sc.next();
		
		System.out.print("이전 주소 : " + oldMember.getAddr());
		System.out.print("수정할 주소 : ");
		String addr = sc.next();
		
		System.out.print("이전 이메일 : " + oldMember.getEmail());
		System.out.print("수정할 이메일 : ");
		String email = sc.next();
		
		System.out.print("이전 나이 : " + oldMember.getAge());
		System.out.print("수정할 나이 : ");
		int age = sc.nextInt();
		
		return new Member(oldMember.getName(), addr, nation, email, age);
	}

	public void printModifySuccessMessage(Member updateMember) {
		System.out.println(updateMember.getName() + " 회원 정보 수정 성공.");	
	}
	
	public void printModifyFailMessage(Member updateMember) {	
		System.out.println(updateMember.getName() + " 회원 정보 수정 실패.");	
	}

	//5.
	public void printRemoveSuccessMessage(String name) {	
		System.out.println(name + " 회원의 정보 삭제 성공.");
	}

	public void printRemoveFailMessage(String name) {	
		System.out.println(name + " 회원의 정보 삭제 실패.");
	}	
}
