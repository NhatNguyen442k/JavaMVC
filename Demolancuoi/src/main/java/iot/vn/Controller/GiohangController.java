package iot.vn.Controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import CNPM.Dto.BillDetailDto;
import CNPM.Dto.BillDto;
import CNPM.Dto.GiohangDto;
import CNPM.Entity.Khachhang;
import CNPM.Service.User.ItfBill;
import CNPM.Service.User.ItfGiohang;

@Controller
@RequestMapping("/User")
public class GiohangController {
	@Autowired
	private ItfGiohang giohangDao;
	
	@RequestMapping(value={"/Giohang"})
	public ModelAndView HomeTrangchu() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("User/Giohang");
		return mv;
	}
	
	@RequestMapping(value = "AddGiohang/{id}",method = RequestMethod.GET)
	public String AddGiohang(HttpServletRequest request,HttpSession sesion,@PathVariable("id") long id) {
		HashMap<Long, GiohangDto> cart = (HashMap<Long, GiohangDto>) sesion.getAttribute("Dathang");
		if(cart == null) {
			cart = new HashMap<Long, GiohangDto>();
		}
		cart = giohangDao.addCart(id, cart);
		sesion.setAttribute("Dathang",cart );
		sesion.setAttribute("totaltongsl",giohangDao.Tongsoluongsp(cart));
		sesion.setAttribute("totaltongtien", giohangDao.Tongtiensp(cart));
		return "redirect:/User/Detail?id="+id ;
//		return "redirect:"+request.getHeader("Referer");
	}
	
	@RequestMapping(value = "/EditGiohang/{id}/{tongsl}")
	public String SuaGiohang(HttpServletRequest request,HttpSession sesion,@PathVariable("id") long id,@PathVariable("tongsl") int tongsl) {
//		long id = Integer.parseInt(request.getParameter("id"));
//		int tongsl = Integer.parseInt(request.getParameter("tongsl"));
		HashMap<Long, GiohangDto> cart = (HashMap<Long, GiohangDto>) sesion.getAttribute("Dathang");
		if(cart == null) {
			cart = new HashMap<Long, GiohangDto>();
		}
		
		cart = giohangDao.EditCart(id,tongsl, cart);	
		sesion.setAttribute("Dathang",cart );
		sesion.setAttribute("totaltongsl",giohangDao.Tongsoluongsp(cart));
		sesion.setAttribute("totaltongtien", giohangDao.Tongtiensp(cart));
		return "redirect:"+request.getHeader("Referer");
	}
	
	@RequestMapping(value = "/DeleteGiohang",method = RequestMethod.GET)
	public String XoaGiohang(HttpServletRequest request,HttpSession sesion) {
		long id = Integer.parseInt(request.getParameter("id"));
		HashMap<Long, GiohangDto> cart = (HashMap<Long, GiohangDto>) sesion.getAttribute("Dathang");
		if(cart == null) {
			cart = new HashMap<Long, GiohangDto>();
		}
		cart = giohangDao.DeleteCart(id, cart);
		sesion.setAttribute("Dathang",cart );
		sesion.setAttribute("totaltongsl",giohangDao.Tongsoluongsp(cart));
		sesion.setAttribute("totaltongtien", giohangDao.Tongtiensp(cart));
		return "redirect:"+request.getHeader("Referer");
	}
	
	
	@Autowired
	private ItfBill billDao;
	
	@RequestMapping(value="/Bill", method = RequestMethod.GET)
	public ModelAndView CheckBill(HttpServletRequest request, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("User/Thanhtoan");
		BillDto bill = new BillDto();
		Khachhang login = (Khachhang)session.getAttribute("Logininfo");
		if(login!= null) {
			bill.setTaikhoan(login.getTaikhoan());
			bill.setDiachi(login.getDiachi());
			bill.setSdt(login.getSdt());
		}
		mv.addObject("bill",bill);
		return mv;
	}
	
	@RequestMapping(value="/Bill", method = RequestMethod.POST)
	public String Thanhtoan(HttpServletRequest request, HttpSession session,@ModelAttribute("bill") BillDto bill) {
		if(billDao.Addbill(bill) >0) {
			HashMap<Long, GiohangDto> cart =(HashMap<Long, GiohangDto>)session.getAttribute("Dathang");
//			billDao.AddbillDetail(cart);
		}
		session.removeAttribute("Dathang");
		return "redirect:/User/Giohang";
	}
}
