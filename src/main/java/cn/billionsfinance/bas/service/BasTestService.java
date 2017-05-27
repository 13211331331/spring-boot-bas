package cn.billionsfinance.bas.service;

import cn.billionsfinance.bas.entity.BasTest;

/**
 * Created by hanlin.huang on 2017/5/26.
 */
public interface BasTestService {
    BasTest getOne(long l);

    Long save(BasTest bas);

    void transactionTest();
}
