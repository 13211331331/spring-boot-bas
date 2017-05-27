package cn.billionsfinance.bas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hanlin.huang on 2017/5/26.
 */
@Controller
public class PageController {

    @RequestMapping("/testFM")
    public String testFM(ModelMap map) {
        map.addAttribute("msg", "Hello, rensanning! @FreeMarker");
        return "test_fm";
    }

}