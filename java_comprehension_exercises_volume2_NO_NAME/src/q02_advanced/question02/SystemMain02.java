package q02_advanced.question02;

import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		List<Member> members = new ArrayList<>();

		members.add(Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2));
		members.add(Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1));

		System.out.println("===会員情報を表示します===");
		MemberManager.showAllMembers(members);

		ConsoleReader cr = new ConsoleReader();

		try {
			System.out.println("===パスワードを変更します===");
			int targetId = cr.inputNumber("input target id>>");
			String newPassword = cr.inputString("input new password>>");

			MemberManager.updatePassword(members, targetId, newPassword);

		} catch (NumberFormatException e) {

			System.out.println("不正な入力です");
			e.printStackTrace();
			return;

		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		System.out.println("---SHOW DATA---");
		MemberManager.showAllMembers(members);

	}

}
