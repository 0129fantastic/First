package com.zhiyou.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

// 我的拦截器
public class MyInterceptor implements HandlerInterceptor {

	// 在请求controller方法前调用
	// 如果返回true 代表放行
	// 如果返回false 代表拦截
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		// System.out.println("我的拦截器");
		return true;
	}

	// controller 方法执行完 ，在视图结合之前调用
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		// ModelMap modelMap = modelAndView.getModelMap();
		// System.out.println("controller 方法执行完 ，在视图结合之前调用" + modelMap.get("msg"));
	}

	// 视图结合之后调用
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		// Thread.sleep(5000L);
		// System.out.println("视图结合之后调用");
	}

}
