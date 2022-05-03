package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p01 = new Point(3, 3);
		Point p02 = new Point(5, 5);
		Point p03 = new Point(14, 32);
		
		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("박명수", p03);
		
		System.out.println(pMap.size());
		System.out.println(pMap.toString());
		
		System.out.println(pMap.get("박명수").getX());
		
		//같은 키값("정우성")으로 추가하는 상황 --> 수정의 형식으로 된다. (키값 중복x)
		Point p04 = new Point(100, 200);
		pMap.put("정우성", p04);
		System.out.println(pMap.toString());
		
		
		System.out.println("--------------------------------------------");
		//전체출력
		//1. 키 목록을 만든다.  ["정우성", "이효리",  "박명수"]
		//2. pMap.get("이름")
		
		Set<String> keys = pMap.keySet();
		System.out.println(keys.toString());
		
		for(String name : keys) {
			System.out.println(pMap.get(name).getX());
		}
		
		
	}

}