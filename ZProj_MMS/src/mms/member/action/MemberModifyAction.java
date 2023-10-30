package mms.member.action;
//7-3 회원 정보 수정 요청을 처리하는 Action 클래스 구현
import java.util.Scanner;
import mms.member.svc.MemberModifyService;
import mms.member.util.ConsoleUtil;
import mms.member.vo.Member;

public class MemberModifyAction implements Action {

	@Override
	public void execute(Scanner sc) {

		ConsoleUtil cu = new ConsoleUtil();
		String name = cu.getName("수정할 ", sc);
		MemberModifyService memberModifyService = new MemberModifyService();

		Member oldMember = memberModifyService.getOldMember(name);

		Member updateMember = cu.getUpdateMember(sc, oldMember);

		boolean isModifySuccess = memberModifyService.modifyMember(updateMember);

		if (isModifySuccess) {
			cu.printModifySuccessMessage(updateMember);
		} else {
			cu.printModifyFailMessage(updateMember);
		}
	}

}
