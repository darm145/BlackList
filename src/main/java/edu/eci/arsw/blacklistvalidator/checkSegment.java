package edu.eci.arsw.blacklistvalidator;

import java.util.LinkedList;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;

public class checkSegment extends Thread{
	int a,b,found;
	String host;
	
	public checkSegment(int a,int b,String host) {
		this.a=a;
		this.b=b;
		this.host=host;
		found=0;
	}
	public void run() {
		HostBlacklistsDataSourceFacade skds=HostBlacklistsDataSourceFacade.getInstance();
		for(int i=a;i<=b;i++) {
			if (skds.isInBlackListServer(i, host)){
				found++;
			}
		} 
	}
	public int found() {
		return found;
	}
}
