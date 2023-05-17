package Interface;

public class television implements remoteControl, searchable {
	private int volume;
	private String url;
	@Override
	public void turnOn() {
		System.out.println("turn on the TV");
		}

	@Override
	public void turnOff() {
		System.out.println("turn off the TV");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>remoteControl.MAX_VOLUME) {
			this.volume=remoteControl.MAX_VOLUME;
		}else if(volume<remoteControl.MIN_VOLUME) {
			this.volume=remoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("now... the volume is "+this.volume);
	}
	public void search(String url) {
		System.out.println("search "+url);
		
	}

}
