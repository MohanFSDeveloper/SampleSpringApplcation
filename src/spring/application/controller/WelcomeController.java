package spring.application.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import spring.application.dao.ConnectToDB;
import spring.application.vo.EmployeeDetailvo;


@Controller
public class WelcomeController {
	
	@Autowired
	private ConnectToDB connectTODB;
	
	@RequestMapping("/welcome.do")
	public ModelAndView welcome(HttpServletRequest request) throws Exception {
		System.out.println("Hiiiiiiiiiiiiii Welcomeeeeeeeeeee");
		//ServiceClass serviceObj = new ServiceClass();
		//System.out.println("In controller----->"+service.getDataSetObject().toString());
		return new ModelAndView("welcome");
	}
	
	@RequestMapping("/testRequest.do")
	public ModelAndView testRequest(HttpServletRequest request,ModelMap map) throws Exception {
		String glossaryName = request.getParameter("UserName");
		System.out.println("glossaryName:----->"+glossaryName);
		//ServiceClass serviceObj = new ServiceClass();
		//System.out.println("In controller----->"+service.getGlossaryDtls(glossaryName.trim()).toString());
		
		/*regulatoryWorkFlow.startMakerProcess("Paul", RegulatoryConstant.DEFAULT_ADMIN_ID.value() , String.valueOf("1-2"), "COREP", "BT_Rpt_Save");
		regulatoryWorkFlow.claimAndCompleteTask("Paul", RegulatoryConstant.DEFAULT_ADMIN_ID.value() , String.valueOf("1-2") , "COREP", "BT_Rpt_Save");
		*/
		map.addAttribute("Key","Welome Mohan");
		return new ModelAndView("Home");
	}
	
	@RequestMapping("/angular.do")
	public ModelAndView angular(HttpServletRequest request,ModelMap map) throws Exception {
		return new ModelAndView("Angular");
	}
	 
	@RequestMapping(value= "/testAngularAjax.do",method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<String> testAngularAjax(HttpServletRequest request,ModelMap map) throws Exception {
		List<String> sampleList = new ArrayList<String>();
		sampleList.add("Mohan");
		sampleList.add("test");
		sampleList.add("Drive");
		sampleList.add("Compile");
		System.out.println("Hi I am done here");
		return sampleList;
	}
	
	@RequestMapping(value= "/getEmployeeDtls.do",method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<EmployeeDetailvo> getEmployeeDtls(HttpServletRequest request,ModelMap map) throws Exception {
		System.out.println("connectTODb.getEmployeeDetails()::"+connectTODB.getEmployeeDetails().toString());
		return connectTODB.getEmployeeDetails();
	}
	
}
