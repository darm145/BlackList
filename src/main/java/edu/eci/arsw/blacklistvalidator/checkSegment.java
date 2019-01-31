package edu.eci.arsw.blacklistvalidator;

import java.util.LinkedList;

public class checkSegment extends Thread{
	int a,b;
	LinkedList<Integer> ocurrences;
	public checkSegment(int a,int b,LinkedList<Integer> ocurrences) {
		this.a=a;
		this.b=b;
		this.ocurrences=ocurrences;
	}
	public void run() {
		for(int i=a;i<=b;i++) {
			
		}
	}
}
