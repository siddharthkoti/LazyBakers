package lazybakers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lazybakers.model.dto.ToppingDTO;
import lazybakers.model.entity.Topping;
import lazybakers.service.ToppingService;

@Controller
public class ToppingController {
	
	public ToppingController() {
		// TODO Auto-generated constructor stu
	}
	
	@Autowired
	ToppingService toppingService;
	
	@RequestMapping(value = "/topping", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Topping> getalltopping() {
		return toppingService.getAllTopping();
	}
	
	@RequestMapping(value = "/topping/{tId}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Topping gettopping(@PathVariable int tId){
        return toppingService.getToppingById(tId);
    }
	
	@RequestMapping(value = "/topping/{tId}", method = RequestMethod.PUT, produces = "application/json")
	@ResponseBody
	public void updatetopping(@PathVariable int tId){
        toppingService.updateTopping(tId);
    }
	
	@RequestMapping(value = "/topping", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public Integer addtopping(@RequestBody ToppingDTO toppingDTO) {
		return toppingService.createTopping(toppingDTO.gettoppingname(), toppingDTO.getPrice(), toppingDTO.getStock(), toppingDTO.isVegetarian());
	}

}
