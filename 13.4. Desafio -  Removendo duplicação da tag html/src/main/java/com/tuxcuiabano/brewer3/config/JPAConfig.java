package com.tuxcuiabano.brewer3.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.tuxcuiabano.brewer3.model.Cerveja;
import com.tuxcuiabano.brewer3.repository.Cervejas;

@Configuration
@EnableJpaRepositories(basePackageClasses= Cervejas.class, enableDefaultTransactions = false)
@EnableTransactionManagement
//@ComponentScan(basePackageClasses = Cerveja.class)
public class JPAConfig {

@Bean
public DataSource dataSource() {
	
	JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
	dataSourceLookup.setResourceRef(true);
	return dataSourceLookup.getDataSource("jdbc/brewerDB");
	
}

@Bean
public JpaVendorAdapter jpaVendorAdapter() {
	HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
	adapter.setDatabase(Database.MYSQL);
	adapter.setShowSql(false);
	adapter.setGenerateDdl(false);
	adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
	return adapter;
}

@Bean
public EntityManagerFactory entityManagerFactory(DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
	LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
	factory.setDataSource(dataSource);
	factory.setJpaVendorAdapter(jpaVendorAdapter);
	factory.setPackagesToScan(Cerveja.class.getPackage().getName());
	factory.afterPropertiesSet();
	return factory.getObject();
}

@Bean
public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
	JpaTransactionManager transactionManager = new JpaTransactionManager();
	transactionManager.setEntityManagerFactory(entityManagerFactory);
	return transactionManager;
}

	
	
}
