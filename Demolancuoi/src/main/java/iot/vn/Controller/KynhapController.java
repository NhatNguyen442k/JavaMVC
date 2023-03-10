package iot.vn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import CNPM.Entity.Khachhang;
import CNPM.Service.User.ItfKynhap;


@Controller
@RequestMapping("/User")
public class KynhapController {
	
	@Autowired
	private ItfKynhap kynhapDao;
	
	
	@RequestMapping(value ="/Dangky",method = RequestMethod.GET )
	public ModelAndView Dangky(ModelAndView mv) {
		mv.addObject("users",new Khachhang());
		mv.setViewName("DK-DN/Dangky");
		return mv;
	}
	
	@RequestMapping(value ="/save",method = RequestMethod.POST)
	public ModelAndView Taotaikhoan(@ModelAttribute("users") Khachhang users) {
		ModelAndView mv = new ModelAndView();
		int check = kynhapDao.Addtaikhoan(users);
		if(check >0 ) {
			mv.setViewName("redirect:/Dangnhap");
		}
		else {
			mv.setViewName("redirect:/Dangky");
		}
		return mv;	
	}
	
	@RequestMapping(value ="/Dangnhap",method = RequestMethod.GET )
	public ModelAndView Dangnhap(ModelAndView mv) {
		mv.addObject("account",new Khachhang());
		mv.setViewName("DK-DN/Dangnhap");
		return mv;
	}
	
	@RequestMapping(value ="/Dangnhap",method = RequestMethod.POST)
	public ModelAndView Dangnhaptaikhoan(@ModelAttribute("account") Khachhang account,HttpSession session ) {
		ModelAndView mv = new ModelAndView();
		account = kynhapDao.Checktaikhoan(account);
		if(account != null) {	
			mv.setViewName("redirect:/User/Trangchu");
			session.setAttribute("Logininfo", account);
		}
		else {
			mv.addObject("loginstatus","Tài khoản hoặc mật khẩu sai. Vui lòng thử lại");
		}
		return mv;
	}
	
	@RequestMapping(value="/Dangxuat", method = RequestMethod.GET)
	public String Dangxuat(HttpSession session, HttpServletRequest request) {
		session.removeAttribute("Logininfo");
		session.removeAttribute("Dathang");
		return "redirect:/User/Trangchu";
	}
	
	
//	private static Logger logger = Logger.getLogger(KynhapController.class);
//	@RequestMapping(value ="/Dangnhap",method = RequestMethod.GET )
//	public ModelAndView Dangnhap(@RequestParam(name="error") String error) {
//		mv.addObject("insertdangnhap",new Ky_NhapDto());
//		logger.error(error);
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("DK-DN/Dangnhap");
//		return mv;
//	}
//	
//	
//	@RequestMapping(value ="/Dangnhap",method = RequestMethod.POST)
//	public ModelAndView Dangnhaptaikhoan(@ModelAttribute("insertdangnhap") Ky_NhapDto insertdangnhap ) {
//		ModelAndView mv = new ModelAndView();
//		boolean check = kynhapDao.CheckAccount(insertdangnhap);
//		if(check) {
//			mv.setViewName("redirect:/Trangchu");
//		}
//		else {
//			mv.setViewName("redirect:/Dangky");
//		}
//		return mv;
//	}	
}
