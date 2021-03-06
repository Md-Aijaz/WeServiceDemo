
package com.aijaz.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.cxf.feature.Features;

@WebService
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class HelloWs {

	@WebMethod
	public String hello() {
		return "Hello";
	}
	@WebMethod
	public String sayHello(String name)
	{
		return "Hi....!"+name;
	}

}
