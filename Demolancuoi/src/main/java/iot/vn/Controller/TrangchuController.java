package iot.vn.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/User")
public class TrangchuController {
	
	@RequestMapping(value={"/","/Trangchu"})
	public ModelAndView HomeTrangchu() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Trangchu/Trangchu");
		return mv;
	}
}
