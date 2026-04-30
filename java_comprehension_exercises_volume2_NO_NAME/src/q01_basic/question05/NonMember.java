package q01_basic.question05;

class NonMember extends AbstMember {

	protected NonMember(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void showMember() {
		System.out.println("---SHOW MEMEBERS---");
		System.out.println("***MEMBER DATA***");
		System.out.println("Sato Kensuke is a non-member");
	}

	@Override
	public void buyItem() {
		System.out.println("---BUY ITAM---");
		System.out.println("Sato Kensuke purchased the item at a fixed price");
	}
}
