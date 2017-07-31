package com.atguigu.day01_ws.ws.server;

import javax.xml.ws.Endpoint;

import com.atguigu.day01_ws.ws2.DataTypeWSImpl;


public class ServerTest2 {

	public static void main(String[] args) {
		String address = "http://192.168.181.1:8888/zzd_ws/datatypews";
		Endpoint.publish(address, new DataTypeWSImpl());
		System.out.println("发布webservice成功!");

	}

}
