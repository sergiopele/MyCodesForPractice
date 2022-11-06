package com.company;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class swapStringWithoutThirdSide {
	public static void main(String[] args) {
		HashMap<String,Integer> empIds = new HashMap<>();
		empIds.put("John",12345);
		empIds.put("Jerry",23423);
		
		System.out.println(empIds);
		System.out.println(empIds.get("Jerry"));
		System.out.println(empIds.containsKey("sdfsdf"));
		System.out.println(empIds.containsValue(12345));
		System.out.println(empIds.replace("John",666));
		
		System.out.println(empIds.putIfAbsent("Je",777));
		System.out.println(empIds);
		System.out.println(empIds.remove("Je"));
		System.out.println(empIds);

		;
	}
}
