package Interface;

public class Audio implements remoteControl {
	private int volume;
	public Audio() {
	}

	@Override
	public void turnOn() {
	System.out.println("turn on the Audio");
	}

	@Override
	public void turnOff() {
	System.out.println("turn off the Audio");

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
		System.out.println("now the volume is..."+this.volume);//this.volume안하면 음수값도 나와<<왜???
		////////////////////search는 setVolume의 매개변수임

	}

	@Override
	public void search(String url) {
		System.out.println("connect to"+url);
		
	}

}
