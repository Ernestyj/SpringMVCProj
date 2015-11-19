package com.eugene.controller;

import com.eugene.model.db.SpittleRepository;
import com.eugene.model.entity.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by DCLab on 11/19/2015.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public String spittles(Model model) {       //Model���滻ΪMap��ModelMap
//        //��ָ��key����Ĭ��Ϊ"spittleList"����ΪfindSpittles����List<Spittle>
//        model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
//        return "spittles";
//    }
    //��һ��ʵ�ַ�����convention preferred��
//    @RequestMapping(method=RequestMethod.GET)
//    public List<Spittle> spittles() {
//        return spittleRepository.findSpittles(Long.MAX_VALUE, 20));
//    }
    @RequestMapping(method=RequestMethod.GET)
    public List<Spittle> spittles(
            @RequestParam(value="max", defaultValue = "999") long max,
            @RequestParam(value="count", defaultValue="20") int count) {
        return spittleRepository.findSpittles(max, count);
    }

}
