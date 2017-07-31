package com.atguigu.day01_ws.ws.server;

import javax.xml.ws.Endpoint;

import com.atguigu.day01_ws.ws.HelloWSImpl;

/**
 * 发布WebService
 * @author zzdr
 *
 */
public class ServerTest {

	public static void main(String[] args) {
		//端口号后面(8989)随意写
		//改路径加?wsdl在浏览器查看sdl文档
//		String address = "http://10.21.27.36:8989/zzd_ws/hellozzdws";
		String address = "http://192.168.181.1:8888/zzd_ws/hellozzdws";
		Endpoint.publish(address, new HelloWSImpl());
		System.out.println("发布webservice成功");
	}

}
