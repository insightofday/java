package API;

public class member {
	public String id;
	public member(String id){
		this.id=id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof member) {
			member member=(member)obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return id.hashCode();//id는 string이라 int타입으로return불가능하기때문에 id.hashcode()
	}
	
	
	
	
}
