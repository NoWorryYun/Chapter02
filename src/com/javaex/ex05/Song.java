package com.javaex.ex05;

public class Song {

//필드

	private String title, artist, album, composer;
	private int year, track;
	
//생성자
	public Song() {	}
	
	public Song(String title, String artist, String album, String composer, int year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
	}
	
	public Song(String title, String artist, String album, String composer, int year, int track) {
		//메모리에 올리는 일
		this(title, artist, album, composer, year); // 파라미터 5개짜리 생성자를 실행,  앞에거에서 따옴(?)
		
		this.track = track;
		
	}	

//G-S
	//setter
	public void setTitle(String t) {
		title = t;
	}
	public void setArtist(String arti) {
		artist = arti;
	}
	public void setAlbum(String al) {
		album = al;
	}
	public void setComposer(String c) {
		composer = c;
	}
	public void setYear(int y) {
		year = y;
	}
	public void setTrack(int tr) {
		track = tr;
	}
	
	//getter
	public String getTitle() {
		return title;
	}
	public String getArti() {
		return artist;
	}
	public String getAlbum() {
		return album;
	}
	public String getComposer() {
		return composer;
	}
	public int getYear() {
		return year;
	}
	public int getTrack() {
		return track;
	}
	
//일반
	
	public void showInfo() {
		System.out.println(artist + ", " + title + " ( " + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡 )");
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	
	
}
