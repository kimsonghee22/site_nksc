package com.precode.unitpage


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping


@Controller
class IndexController {

	@Autowired
	ExampleSql sql = new ExampleSql();
	
	@RequestMapping("/")
	public String index(Model model) {
		List board = sql.query("select * from nksc.board")
		
		model.addAttribute("board", board)
		return "index"
	}
	
	@RequestMapping("/header")
	public String header() {
		return "header"	
	}
	
	@RequestMapping("/footer")
	public String footer() {
		return "footer"
	}

}
