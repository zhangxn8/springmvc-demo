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
     * 1. ʹ��RequestMappingע����ӳ�������URL
     * 2. ����ֵ��ͨ����ͼ����������Ϊʵ�ʵ�������ͼ, ����InternalResourceViewResolver��ͼ���������������½���
     * ͨ��prefix+returnVal+suffix �����ķ�ʽ�õ�ʵ�ʵ�������ͼ��Ȼ���ת������
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
        //У�� ����...
        result.put("flag", "true");
        
        return result;
    }
    
}