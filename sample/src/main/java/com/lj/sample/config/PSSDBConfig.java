package com.lj.sample.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

// PSSDB 연결 설정
@Configuration
@MapperScan(value={"com.lj.sample.mapper.pssdb", "com.lj.core.commoncode.mapper"}, sqlSessionTemplateRef="sqlSessionTemplatePSSDB")
public class PSSDBConfig {

    @Primary
    @Bean(name="datasourcePSSDB")
    @ConfigurationProperties("spring.datasource.pssdb")
    public DataSource datasourcePSSDB() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name="sqlSessionFactoryPSSDB")
    public SqlSessionFactory sqlSessionFactoryPSSDB(@Qualifier("datasourcePSSDB") DataSource datasourcePSSDB) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(datasourcePSSDB);
        bean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:config/mybatis-config.xml"));
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mappers/pssdb/*.xml"));
        return bean.getObject();
    }

    @Primary
    @Bean(name="sqlSessionTemplatePSSDB")
    public SqlSessionTemplate sqlSessionTemplatePSSDB(@Qualifier("sqlSessionFactoryPSSDB") SqlSessionFactory sqlSessionFactoryPSSDB) {
        return new SqlSessionTemplate(sqlSessionFactoryPSSDB);
    }
}
