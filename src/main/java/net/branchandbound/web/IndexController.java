package net.branchandbound.web;

import net.branchandbound.product.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
        List<Product> productList = new ArrayList<Product>();
        for (int i =0; i< 5; i++)
           productList.add(new Product("product " + i, i*15, "Fabulous product " + i));

        model.addAttribute("products", productList);
		return "index";
	}
}
