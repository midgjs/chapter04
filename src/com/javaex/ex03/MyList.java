package com.javaex.ex03;

public class MyList<T> {

	// 필드
	private T[] oArray;
	private int crtPos; // 다음에 추가해줄 방번호

	// 생성자
	public MyList() {
		//배열3개 --> 원래는 만들지 않음
		oArray = (T[])new Object[3];
		crtPos = 0;
	}

	// 메소드 gs

	// 메소드 일반
	public void add(T obj) {
		// 현재배열갯수+1
		// 기존배열의 내용은 그대로 복사
		// 마지막방에 point를 대입
		oArray[crtPos] = obj;
		crtPos = crtPos + 1; // crtPos++
	}

	public int size() {
		return crtPos;
	}

	public T get(int index) {

		return oArray[index];
	}

}