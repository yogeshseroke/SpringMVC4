package bao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MultiplicationController {
	@RequestMapping("/mul")
	public String mul()
	{
		return "multiplication";
	}
	@RequestMapping("/mullogic")
	public ModelAndView mullogic(HttpServletRequest request,HttpServletResponse response)
	{
		int num1=Integer.parseInt(request.getParameter("txtnum1"));
		int num2=Integer.parseInt(request.getParameter("txtnum2"));
		int num3=num1*num2;
		return new ModelAndView("multiplication","key",num3);	}
}
