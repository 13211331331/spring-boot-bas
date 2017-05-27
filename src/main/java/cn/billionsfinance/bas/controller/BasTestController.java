package cn.billionsfinance.bas.controller;

import cn.billionsfinance.bas.entity.BasTest;
import cn.billionsfinance.bas.service.BasTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hanlin.huang on 2017/5/26.
 */
@RestController
@RequestMapping(value = "/bas-test")
public class BasTestController {

    @Autowired
    private BasTestService basTestService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public BasTest get(@RequestParam(value = "id") String id) {
        return basTestService.getOne(Long.parseLong(id));
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public BasTest save(BasTest bas) {
        Long id = basTestService.save(bas);
        return basTestService.getOne(id);
    }


    @RequestMapping(value = "/transaction", method = RequestMethod.GET)
    public String transactionTest() {
       basTestService.transactionTest();
       return "transactionTest";
    }


}
