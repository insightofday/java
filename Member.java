package CF;

public class Member {
	//hashsetex와 연결됨
	protected String name;
	protected int age;
	
	public Member(String name, int age) {
		this.name=name;
		this.age =age;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member=(Member)obj;
			if(name.equals(member.name)&&age==(member.age)) {
				return true;	
			}
		}return false;
	}

}
