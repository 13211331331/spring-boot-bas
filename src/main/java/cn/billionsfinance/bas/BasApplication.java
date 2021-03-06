package cn.billionsfinance.bas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("cn.billionsfinance.bas.mapper")
@EnableTransactionManagement // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
public class BasApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasApplication.class, args);
	}
}
