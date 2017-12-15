package com.niit.collaboration.DBconfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

import com.niit.collaboration.model.Blog;

public class DBConfig
{
	public DataSource getOracleDataSource()
	{
		DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("");
		driverManagerDataSource.setUrl("");
		driverManagerDataSource.setUsername("");
		driverManagerDataSource.setPassword("");
		return driverManagerDataSource;
	}
	public Properties getHibernateProperties()
	{
		Properties properties=new Properties();
		 properties.setProperty("hibernate.hbn2ddl.auto", "update");
		 properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle11gDialect");
		 return  properties;
	}
	@Bean
	public SessionFactory getSessionFactory()
	{
		LocalSessionFactoryBuilder localSessionFactoryBuilder=new LocalSessionFactoryBuilder(null);
		localSessionFactoryBuilder.addProperties(getHibernateProperties());
		localSessionFactoryBuilder.addAnnotatedClass(Blog.class);
		System.out.println("SessionFactory Bean Created");
		return localSessionFactoryBuilder.buildSessionFactory();
	}
	@Bean
	public HibernateTransactionManager getHibernateTransactionManager()
	{
		return new HibernateTransactionManager(getSessionFactory());
	}
	}
