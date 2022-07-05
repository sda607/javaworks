package interfaceex.remotecontrol;

public class Television implements RemoteControl{
	//필드
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// 볼륨의 크기 제한
		if(volume > RemoteControl.MAX_VOLUEM) {
			this.volume = RemoteControl.MAX_VOLUEM;
		}else if(volume < RemoteControl.MIN_VOLUEM) {
			this.volume = RemoteControl.MIN_VOLUEM;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨:" + this.volume);
	}

}
