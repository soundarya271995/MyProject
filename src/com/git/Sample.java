package com.git;

public class Sample {
private void method1() {
	System.out.println("completed");
}private void method2() {
	System.out.println("completed2");
}
private void method3() {
	System.out.println("completed3");
}
private void method5() {
	System.out.println("conflict");
}
public static void main(String[] args) {
	Sample s = new Sample();
	s.method1();
	s.method2();
	s.method3();
	s.method5();
}
}
