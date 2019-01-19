package com.luo.webspring.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@PropertySource("classpath:datasource/datasource.properties")
public class DataSourceConfig {

	@Value("${datasource.url}")
	private String url;
	@Value("${datasource.driverclass}")
	private String driverClass;
	@Value("${datasource.username}")
	private String userName;
	@Value("${datasource.password}")
	private String passWord;

	@Bean
	public DataSource createDataSource() throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setJdbcUrl(url);
		dataSource.setDriverClass(driverClass);
		dataSource.setUser(userName);
		dataSource.setPassword(passWord);
		dataSource.setAutoCommitOnClose(false);
		dataSource.setMaxPoolSize(100);
		dataSource.setMinPoolSize(10);
		dataSource.setInitialPoolSize(10);
		return dataSource;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
