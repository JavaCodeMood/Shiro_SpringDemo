package com.lhf.shiro.factory;

import java.util.LinkedHashMap;

public class FilterChainDefinitionMapBuilder {
	
	public LinkedHashMap<String, String> buildFilterChainDefinitionMap(){
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		
		//˳���ܳ���
		map.put("/login.jsp", "anon");
		map.put("/shiro/login", "anon");
		map.put("/shiro/logout", "logout");
		map.put("/user.jsp", "authc,roles[user]");  //��֤֮�����user��Ȩ��
		map.put("/admin.jsp", "authc,roles[admin]"); //��֤֮�����admin��Ȩ��
		map.put("/list.jsp", "user");
		
		map.put("/**", "authc");
		
		return map;
	}

}
