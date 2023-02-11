package lesson7;

public class Tv {
	// 변수 channel , volume , serialNumber 1 2 3 4 5 6 
	// 메소드 volumeUp, volumeDown, channelUp, channelDown
	

//	public static int channel ;
//	public static int volume ; 
	
	public static int count = 0  ; // static이니까 demo의 모든 객체가 같이 쓰는 애들 

	
	private int channel, volume, serialNumber=0;
	

	public Tv() { // 얘는 생성자라 초기에 항상 실행되는 애
		count++ ; // @@오오 얘를 추가하고 아래에 count를 대입하니까 시리얼넘버가 하나씩 증가하네? 원래는 tv1,2 다 1이었는데
		serialNumber = count ; // 여기에 이걸 넣어주면 객체가 t1,2, 생길 때마다 시리얼 넘버가 생김
	}
	
	
	
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}

	
	public void volumeUp() {
		volume++;
	}
	public void volumeDown() {
		volume--;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}

}
