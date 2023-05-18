package API;

public class key {
	public int key;
	public key(int key) { 
		this.key=key;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof key) {
			key compare=(key)obj;
			if(this.key==compare.key) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return this.key;
}
}
