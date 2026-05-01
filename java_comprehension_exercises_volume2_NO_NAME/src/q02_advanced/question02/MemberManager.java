package q02_advanced.question02;

import java.util.List;

public class MemberManager {
	private MemberManager() {

	}

	public static void showAllMembers(List<Member> members) {
		for (Member member : members) {
			member.showMember();
		}
	}

	static void updatePassword(List<Member> members, int targetId, String newPassword) {

		boolean isNotExistMember = false;
		for (Member member : members) {
			if (member.getId() == targetId) {
				member.setPassword(newPassword);
				break;
			} else {
				isNotExistMember = true;//該当者なし
			}
		}

		if (isNotExistMember) {
			System.out.println("該当者はいませんでした。");
		}

	}

}
