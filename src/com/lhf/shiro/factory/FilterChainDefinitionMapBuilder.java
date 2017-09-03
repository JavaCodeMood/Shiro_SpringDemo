package com.lhf.shiro.factory;

import java.util.LinkedHashMap;

public class FilterChainDefinitionMapBuilder {
	
	public LinkedHashMap<String, String> buildFilterChainDefinitionMap(){
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		
		//顺序不能出错
		map.put("/login.jsp", "anon");
		map.put("/shiro/login", "anon");
		map.put("/shiro/logout", "logout");
		map.put("/user.jsp", "authc,roles[user]");  //认证之后具有user的权限
		map.put("/admin.jsp", "authc,roles[admin]"); //认证之后具有admin的权限
		map.put("/list.jsp", "user");
		
		map.put("/**", "authc");
		
		return map;
	}

}
