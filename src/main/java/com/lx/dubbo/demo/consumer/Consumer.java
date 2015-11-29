package com.lx.dubbo.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lx.dubbo.demo.service.ICxfWebService;
import com.lx.dubbo.demo.service.IRmiService;

/**
 * 服务消费者
 * @author lx
 * @date 2015年9月9日 上午12:44:06
 */
public class Consumer {
	
	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext-dubbo-consumer.xml"});
        context.start();
        
        /**
         * 1、基于dubbo协议：调用标准 dubbo 协议的远程接口服务
         */
//        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
//        String hello = demoService.sayHello("dubbo service"); // 执行远程方法
//        System.out.println( hello ); // 显示调用结果
        
        /**
         * 注意：需要部署启动 hessian服务发布web项目： hessian_1_server 来发布IHelloService远程接口服务
         * 2、基于标准hessian协议：调用标准  hessian 协议的远程接口服务
         */
//        IHelloService helloService = (IHelloService)context.getBean("helloService"); // 获取纯hessian协议的远程服务
//        String hello2 = helloService.sayHello("hessian service"); // 执行远程方法
//        System.out.println( hello2 ); // 显示调用结果

        /**
         * 调用rmi协议远程接口服务
         */
//        IRmiService rmiService = (IRmiService) context.getBean("rmiService"); // 获取基于dubbo的rmi协议远程接口服务
//        String hello3 = rmiService.sayHello("dubbo rmi service"); // 执行远程方法
//        System.out.println( hello3 ); // 显示调用结果
        
        /**
         * 调用http协议远程接口服务
         */
//        IHttpInvokerService httpInvokerService = (IHttpInvokerService) context.getBean("httpInvokerService"); // 获取基于dubbo的httpInvoker协议远程接口服务
//        String hello4 = httpInvokerService.sayHello("dubbo httpInvokerService service"); // 执行远程方法
//        System.out.println( hello4 ); // 显示调用结果
        
        /**
         * 调用Cxf webservice 协议远程接口服务
         */
        ICxfWebService cxfWebService = (ICxfWebService) context.getBean("cxfWebService"); // 获取基于dubbo的WebService协议远程接口服务
        String hello5 = cxfWebService.sayHello("dubbo cxfWebService service"); // 执行远程方法
        System.out.println( hello5 ); // 显示调用结果        
        
    }
}
