package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		Song iu = new Song();
		
		iu.setTitle("좋은날");
		iu.setArtist("아이유");
		iu.setAlbum("Real");
		iu.setComposer("이민수");
		iu.setYear(2010);
		iu.setTrack(3);

		Song bigbang = new Song("거짓말", "BIGBANG", "Always", "G-DRAGON", 2008, 2);
		
//		bigbang.setTitle("거짓말");
//		bigbang.setArtist("BIGBANG");
//		bigbang.setAlbum("Always");
//		bigbang.setComposer("G-DRAGON");
//		bigbang.setYear(2008);
//		bigbang.setTrack(2);

		Song busker = new Song("벚꽃엔딩","버스커버스커","버스커버스커1집","장범준", 2012);
		
		busker.setTrack(4);
		
		
		System.out.println(iu.toString());
		System.out.println(bigbang.toString());
		System.out.println(busker.toString());
		
		iu.showInfo();
		bigbang.showInfo();
		busker.showInfo();
	}
}
