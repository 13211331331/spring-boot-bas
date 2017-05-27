package cn.billionsfinance.bas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("cn.billionsfinance.bas.mapper")
@EnableTransactionManagement // ��ע�����������ͬ��xml���÷�ʽ�� <tx:annotation-driven />
public class BasApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasApplication.class, args);
	}
}
