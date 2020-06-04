package com.itcrazy2008.skywalking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SkywalkingApplication {
	//1.启动skywalking服务端

	//2.agent.config文件中修改配置，指向skywalking服务端
	//collector.backend_service=${SW_AGENT_COLLECTOR_BACKEND_SERVICES:10.2.0.22:11800}

//3.springboot项目启动时增加配置参数
//-javaagent:H:\github\itcrazy2008\skywalking\agent\skywalking-agent.jar
//-Dskywalking.agent.service_name=skywalking-springboot
//-Dskywalking.collector.backend_service=10.2.0.22:11800

	public static void main(String[] args) {
		SpringApplication.run(SkywalkingApplication.class, args);
	}

}
