package ex6_interface;

public class Kitchen implements Menu3{

	@Override
	public String jjajang() {
		return "Áß¸é + ÃáÀå + ¿ÏµÎÄá";
	}

	@Override
	public String jjambbong() {
		return "Áß¸é + È«ÇÕ + ¾ßÃ¤";
	}

	@Override
	public String tangsuyuck() {
		return "µÅÁö°í±â + ´ç±Ù + °®Àº¾ç³ä";
	}

	@Override
	public String boggembab() {
		return "ÃáÀå¼Ò½º  + ´Þ°¿ + ÀÌÃµ½Ò";
	}

	@Override
	public String yusanseul() {
		return "À¯Àç¼® Â¯";
	}	
}











