package iot.vn.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import CNPM.Dto.*;
import CNPM.Entity.Khachhang;
import CNPM.Entity.Loaisp;
import CNPM.Entity.Role;
import CNPM.Entity.Thucpham;
import CNPM.Service.Admin.*;
import CNPM.Service.User.ItfIndex;

@Controller
@RequestMapping("/Admin")
public class AdminController {
	
	@Autowired
	private ItfIndexTPAdmin indexAdminDao;
	@Autowired
	private ItfIndex indexUserDao;
	
	@RequestMapping(value={"QT-IndexTP"},method = RequestMethod.GET )
	public ModelAndView QTindexTP(ModelAndView mv) {
//		List<Thucpham> qtlisttp = indexUserDao.list();
//		List<Loaisp> indexmenuloaisp = indexUserDao.Menuloaisp();
		List<QTthucphamDto> qtlisttp = indexAdminDao.listthucpham();
		mv.addObject("quantriindexthucpham",qtlisttp);
//		mv.addObject("quantriloaisp", indexmenuloaisp);
		mv.setViewName("Admin/QTthucpham");
		return mv;
	}
	
	@RequestMapping(value = {"QT-InsertTP"}, method = RequestMethod.GET)
	public ModelAndView QTinsertTP(ModelAndView mv) {
		List<Loaisp> loaisplist = indexUserDao.Menuloaisp();
		mv.addObject("loaisplist",loaisplist);
		mv.addObject("themtp",new Thucpham());
		mv.setViewName("Admin/InsertTP");
		return mv;
	}
	
	@RequestMapping(value = {"/them"}, method = RequestMethod.POST)
	public ModelAndView Themtp(@ModelAttribute("themtp") Thucpham tp) {
		ModelAndView mv = new ModelAndView();
		int tf = indexAdminDao.taomoithucpham(tp);
		if(tf > 0) {
			mv.setViewName("redirect:/Admin/QT-IndexTP");
		}
		else {
			mv.setViewName("redirect:/Admin/QT-InsertTP");
		}
		return mv;
	}
	
	@RequestMapping(value= {"/DetailTP"},method = RequestMethod.GET)
	public ModelAndView Editthucpham(HttpServletRequest request) {
		Integer id = Integer.parseInt(request.getParameter("id"));
		Thucpham tp = indexAdminDao.Detailthucpham(id);
		ModelAndView mv = new ModelAndView();
		List<Loaisp> editloaisp = indexUserDao.Menuloaisp();
		mv.addObject("selectloaisp", editloaisp);
		mv.addObject("findthucpham",tp);
		mv.setViewName("Admin/EditQTthucpham");
		return mv;
	}
	
	@RequestMapping(value= {"/editthucpham"},method = RequestMethod.POST)
	public ModelAndView Editthucpham(@ModelAttribute Thucpham findthucpham) {
		if(findthucpham.getiDthucpham() == 0) {
			
		}
		else {
			indexAdminDao.Editthucpham(findthucpham);
		}
		return new ModelAndView("redirect:/Admin/QT-IndexTP");
	}
	
	@RequestMapping(value= {"/DeleteTP"},method = RequestMethod.GET)
	public ModelAndView Deletethucpham(@RequestParam Integer id) {
		indexAdminDao.Deletethucpham(id);
		return new ModelAndView("redirect:/Admin/QT-IndexTP");
	}
	
	
	
	
	
	
	
	
	
	
	@Autowired
	private ItfIndexACAdmin accountAdminDao;
	
	@RequestMapping(value = {"QT-IndexAC"},method = RequestMethod.GET)
	public ModelAndView QTindexAC(ModelAndView mv) {
		List<AccountQTDto> qtlistac = accountAdminDao.listaccountAdmin();
		mv.addObject("accountquantri",qtlistac);
		mv.setViewName("Admin/QTaccount");
		return mv;
	}
	
	@RequestMapping(value= {"/Thongtin"},method = RequestMethod.GET)
	public ModelAndView Thongtintaikhoan(HttpServletRequest request) {
		Integer id = Integer.parseInt(request.getParameter("id"));
		AccountQTDto kh = accountAdminDao.DetailTaikhoan(id);
		ModelAndView mv = new ModelAndView();
		List<Role> listrole = accountAdminDao.listrole();
		mv.addObject("showrole", listrole);
		mv.addObject("khachhangtaikhoan",kh);
		mv.setViewName("Admin/EditQTaccount");
		return mv;
	}
	@RequestMapping(value= {"/edittaikhoan"},method = RequestMethod.POST)
	public ModelAndView Chinhsuataikhoan(@ModelAttribute AccountQTDto khachhangtaikhoan) {
		if(khachhangtaikhoan.getiDuser() == 0) {
			
		}
		else {
			accountAdminDao.EditTaikhoan(khachhangtaikhoan);
		}
		return new ModelAndView("redirect:/Admin/QT-IndexAC");
	}
	
	
	@RequestMapping(value= {"/Deletetaikhoan"},method = RequestMethod.GET)
	public ModelAndView XoaAccount(@RequestParam Integer id) {
		accountAdminDao.DeleteTaikhoan(id);
		return new ModelAndView("redirect:/Admin/QT-IndexAC");
	}
}
