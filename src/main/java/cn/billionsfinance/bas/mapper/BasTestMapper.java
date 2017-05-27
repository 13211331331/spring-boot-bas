package cn.billionsfinance.bas.mapper;

import cn.billionsfinance.bas.entity.BasTest;

/**
 * Created by hanlin.huang on 2017/5/26.
 */
public interface BasTestMapper {
    BasTest getById(long l);

    long insert(BasTest bas);

    void delete(long id);
}
