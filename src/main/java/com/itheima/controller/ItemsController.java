package com.itheima.controller;


import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {
@Autowired
    private ItemsService itemsService;
@RequestMapping("/findbyid")
    public String  findbyid(Model model){

        Items findbyid = itemsService.findbyid(1);
        model.addAttribute("item",findbyid);
        return "itemDetail";
    }
}
