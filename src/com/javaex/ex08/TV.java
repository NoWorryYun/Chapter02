package com.javaex.ex08;

public class TV {

	// 필드
	private int channel;
	private int volume;
	private boolean power;

	// 생성자
	public TV() {
	}

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	// GS

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean getPower() {
		return power;
	}

	// 일반
	// power
	public void power(boolean on) {
		if (on == true) {
			this.power = true;
		} else if (on == false) {
			this.power = false;
		}
	}

	// volume
	public void volume(int volume) {
		if(this.power==true) {
			if (volume > 100) {
				this.volume = 100;
			} else if (volume < 0) {
				this.volume = 0;
			}
		}
	}

	public void volume(boolean up) {
		if(this.power==true) {
			if (up == true) {
				this.volume = volume - 1;
			} else if (up == false) {
				this.volume = volume - 1;
			}
		}
	}
	
	// channel
	public void channel(int channel) {
		if(this.power==true) {
			if (channel > 255) {
				this.channel = 255;
			} else if (channel < 1) {
				this.channel = 1;
			}
		}
	}

	public void channel(boolean up) {
		if(this.power==true) {
			if (up == true) {
				this.channel = channel + 1;
			} else if (up == false) {
				this.channel = channel - 1;
			}
		}
	}
	
	// status
	public void status() {
		System.out.println("channel : " + channel + " / volume : " + volume + " / power : " + power);
	}

}
