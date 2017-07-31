package com.atguigu.day01_ws.ws;

import javax.jws.WebService;

/**
 * SEI的实现
 * @author zzd
 *
 */
@WebService
public class HelloWSImpl implements HelloWS {

	public HelloWSImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayHello(String name) {
		System.out.println("server sayHello()"+name);
		
		return "Hello " +name;
	}

}
