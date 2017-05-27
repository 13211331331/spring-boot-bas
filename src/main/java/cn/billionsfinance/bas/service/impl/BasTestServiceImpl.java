package cn.billionsfinance.bas.service.impl;

import cn.billionsfinance.bas.entity.BasTest;
import cn.billionsfinance.bas.mapper.BasTestMapper;
import cn.billionsfinance.bas.service.BasTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by hanlin.huang on 2017/5/26.
 */
@Service
public class BasTestServiceImpl implements BasTestService {

    @Autowired
    private BasTestMapper basTestMapper;

    @Override
    public BasTest getOne(long l) {
        return basTestMapper.getById(l);
    }

    @Override
    public Long save(BasTest bas) {
        return basTestMapper.insert(bas);
    }

    @Transactional
    @Override
    public void transactionTest() {

        basTestMapper.delete(1);
        System.out.println(1/0);
    }

}
