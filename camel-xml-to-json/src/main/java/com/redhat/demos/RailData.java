package com.redhat.demos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RailyardData", namespace = "http://examples.bnsf.com/railyard.xsd")
@XmlAccessorType(XmlAccessType.FIELD)

public class RailData {
    
    @XmlElement(namespace="http://examples.bnsf.com/railyard.xsd", name = "yardid")
    int yardid;
    @XmlElement(namespace="http://examples.bnsf.com/railyard.xsd", name = "yardname")
    String yardname;
    @XmlElement(namespace="http://examples.bnsf.com/railyard.xsd", name = "railcarid")
    String railcarid;
    @XmlElement(namespace="http://examples.bnsf.com/railyard.xsd", name = "railcartype")
	String railcartype;
	@XmlElement(namespace="http://examples.bnsf.com/railyard.xsd", name = "linkid")
    String linkid;
    @XmlElement(namespace="http://examples.bnsf.com/railyard.xsd", name = "linkfromstation")
    String linkfromstation;
    @XmlElement(namespace="http://examples.bnsf.com/railyard.xsd", name = "linktostation")
	String linktostation;
	@XmlElement(namespace="http://examples.bnsf.com/railyard.xsd", name = "status")
    Boolean status = false;
    
	public int getYardid() {
		return yardid;
    }
	public void setYardid(final int yardid) {
		this.yardid = yardid;
	}
	public String getYardname() {
		return yardname;
	}
	public void setYardname(final String yardname) {
		this.yardname = yardname;
	}
	public String getRailcarid() {
		return railcarid;
	}
	public void setRailcarid(final String railcarid) {
		this.railcarid = railcarid;
	}
	public String getRailcartype() {
		return railcartype;
	}
	public void setRailcartype(final String railcartype) {
		this.railcartype = railcartype;
	}
	public String getLinkid() {
		return linkid;
	}
	public void setLinkid(final String linkid) {
		this.linkid = linkid;
	}
	public String getLinkfromstation() {
		return linkfromstation;
	}
	public void setLinkfromstation(final String linkfromstation) {
		this.linkfromstation = linkfromstation;
	}
	public String getLinktostation() {
		return linktostation;
	}
	public void setLinktostation(final String linktostation) {
		this.linktostation = linktostation;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(final Boolean status) {
		this.status = status;
	}
    
}