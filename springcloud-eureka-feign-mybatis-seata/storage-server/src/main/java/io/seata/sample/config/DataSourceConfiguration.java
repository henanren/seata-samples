package io.seata.sample.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.transaction.SpringManagedTransactionFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.alibaba.druid.pool.DruidDataSource;

import io.seata.rm.datasource.DataSourceProxy;
import io.seata.sample.utils.SeataXidFilter;
import io.seata.spring.annotation.GlobalTransactionScanner;

/**
 * 数据源代理
 * 
 * @author wangzhongxiang
 */
@Configuration
public class DataSourceConfiguration {

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource druidDataSource() {
		DruidDataSource druidDataSource = new DruidDataSource();
		return druidDataSource;
	}

	@Primary
	@Bean("dataSource")
	public DataSourceProxy dataSource(DataSource druidDataSource) {
		return new DataSourceProxy(druidDataSource);
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSourceProxy dataSourceProxy) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSourceProxy);
		sqlSessionFactoryBean
				.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:/mapper/*.xml"));
		sqlSessionFactoryBean.setTransactionFactory(new SpringManagedTransactionFactory());
		return sqlSessionFactoryBean.getObject();
	}

	/**
	 * 初始化seataXid过滤器
	 * 
	 * @return
	 * @author sly
	 * @time 2019年6月12日
	 */
	@Bean
	public SeataXidFilter fescarXidFilter() {
		return new SeataXidFilter();
	}

	/**
	 * 初始化全局事务扫描
	 * 
	 * @return
	 * @author sly
	 * @time 2019年6月11日
	 */
	// @Bean
	public GlobalTransactionScanner globalTransactionScanner() {
		return new GlobalTransactionScanner("seata-springcloud-storage", "my_test_tx_group");
	}

}
