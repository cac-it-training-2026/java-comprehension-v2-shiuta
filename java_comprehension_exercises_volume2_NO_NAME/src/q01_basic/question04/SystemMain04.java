package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		Member[] members = new Member[2];
		//TODO ここから実装する
		Member member = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);
		members[0] = member;

		member = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1);
		members[1] = member;

		MemberManager.showAllMembers(members);

	}

}
