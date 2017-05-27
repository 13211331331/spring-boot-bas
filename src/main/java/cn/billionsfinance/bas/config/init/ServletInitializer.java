package cn.billionsfinance.bas.config.init;

import cn.billionsfinance.bas.BasApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by hanlin.huang on 2017/5/26.
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BasApplication.class);
    }
}

