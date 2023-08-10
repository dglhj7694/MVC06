package kr.bit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberLogoutController implements Controller{

	@Override
	public String requestHandler(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String ctx=request.getContextPath();

		
		//세션 제거하는 방법
		//1.강제로 제거
		request.getSession().invalidate();
		//2 .브라우저 강제로 종료 (JSESSIONID 는 브라우저쿠키에 저장
		
		//3. 세션이 종료 될때 가지 기다리기 (세션 타임아웃 시간 : 30분 = 1800초)
		return "redirect:"+ctx+"/memberList.do";
	}

}
