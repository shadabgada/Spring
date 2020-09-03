package com.spring.XML;


public class XmlPersonDAO {


	private XmlJdbcConnection xmljdbcConnection;

	public XmlJdbcConnection getJdbcConnection() {
		return xmljdbcConnection;
	}

	public void setXmlJdbcConnection(XmlJdbcConnection xmljdbcConnection) {
		this.xmljdbcConnection = xmljdbcConnection;
	}
	
}
