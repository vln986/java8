package com.java.strings;

import java.time.ZoneId;

public class StringJoin {
	
	public static void main(String args[]) {
		
		String str = String.join("/", "800469","tomcat","webapps");
		
		System.out.println("Path = "+str);
		
		String zoneIds = String.join("/", ZoneId.getAvailableZoneIds());
		
		System.out.println("zoneIds " +zoneIds);
	}

}
