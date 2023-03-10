package iot.vn.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import CNPM.Entity.Loaisp;
//import CNPM.Dao.ThucphamDao;
import CNPM.Entity.Thucpham;
import CNPM.Service.User.ItfIndex;



@Controller
@RequestMapping("/User")
public class UserController{
	
	@Autowired
	private ItfIndex indexDao;
	
	
	@RequestMapping(value = {"/Index"}, method = RequestMethod.GET)
	public ModelAndView IndexTP(ModelAndView mv) {
		List<Thucpham> indextphome = indexDao.list();
		List<Loaisp> indexmenuloaisp = indexDao.Menuloaisp();
		mv.addObject("indextphome",indextphome);
		mv.addObject("indexmenuloaisp", indexmenuloaisp);
		mv.setViewName("User/Index");
		return mv;
	}
	
	@RequestMapping(value = {"/Detail"}, method = RequestMethod.GET)
	public ModelAndView DetailTP(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		Thucpham tpdetail = indexDao.get(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("detailtp",tpdetail);
		mv.setViewName("User/Detail");
		return mv;
	}
	
}
