package com.springmvc;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

    /**
     * 1. 使用RequestMapping注解来映射请求的URL
     * 2. 返回值会通过视图解析器解析为实际的物理视图, 对于InternalResourceViewResolver视图解析器，会做如下解析
     * 通过prefix+returnVal+suffix 这样的方式得到实际的物理视图，然后会转发操作
     * "/WEB-INF/views/success.jsp"
     * @return
     */
	 
    @RequestMapping("/helloworld")   
    public String hello(){
    	
        System.out.println("hello world");
        
        
        return "success";
    }
     
    @ResponseBody 
    @RequestMapping("/hello")
    public Map<String, String> hello2(HttpServletRequest request){
    	
        System.out.println("hello world2");
        Map<String,String> result = new HashMap<String,String>();
        String para= request.getParameter("para");
        System.out.println(para);
        //校验 代码...
        result.put("flag", "true");
        
        return result;
    }
    
}