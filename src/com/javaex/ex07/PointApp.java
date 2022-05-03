package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		Set<Point> pSet = new HashSet<Point>();
		
		Point p01 = new Point(1, 2);
		Point p02 = new Point(3, 6);
		Point p03 = new Point(5, 10);
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		/*
		for(Point p :pSet) {
			
			//System.out.println(p.getX());
			System.out.println(p.toString());
			
		}
		*/
		System.out.println(pSet.toString());
		System.out.println(pSet.size());
		System.out.println("---------------------------");
		
		Point p04 = new Point(3, 6); // p02 중복 
		pSet.add(p04);
		System.out.println(pSet.toString()); // 중복인데 들어가있다 why --> 강의자료 17번
		
		//hashCode()
		
		for(Point p :pSet) {
			System.out.println(p.hashCode());
		}
		
		
	}

}
