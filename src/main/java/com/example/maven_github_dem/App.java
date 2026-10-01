package com.example.maven_github_dem;

/**
 * Hello world!
 */
public class App {
	
	public int AverageofTwo(int a,int b) {
		return(a+b)/2;
	}
	public int AverageofThree(int a,int b,int c) {
		return(a+b+c)/3;
	}
	public static void main(String[]args) {
		App app=new App();
		app.AverageofThree(1, 2, 3);
		app.AverageofTwo(1, 2);
	}
}