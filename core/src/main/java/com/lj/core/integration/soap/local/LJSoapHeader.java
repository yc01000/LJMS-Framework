package com.lj.core.integration.soap.local;

import com.lj.core.integration.soap.local.ljcertificationheader.Userinfo;
import com.lj.core.integration.soap.local.ljprocessheader.Processinfo;
import com.lj.core.integration.soap.local.ljresponseheader.Status;

public class LJSoapHeader {

	private Userinfo userinfo = null;
	private Processinfo processinfo = null;
	private Status status = null;
	
	public Userinfo getUserinfo() {
		if( userinfo == null ){
			this.userinfo = new Userinfo(); 
		}
		return userinfo;
	}
	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}
	public Processinfo getProcessinfo() {
		if( processinfo == null){
			this.processinfo = new Processinfo();
		}
		return processinfo;
	}
	public void setProcessinfo(Processinfo processinfo) {
		this.processinfo = processinfo;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
}
