package com.lj.core.mail.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

// EMSDB 연결 설정
@Configuration
@MapperScan(value="com.lj.core.mail.mapper", sqlSessionTemplateRef="sqlSessionTemplateEMSDB")
public class EMSDBConfig {

    @Bean(name="datasourceEMSDB")
    @ConfigurationProperties("spring.datasource.emsdb")
    public DataSource datasourceEMSDB() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name="sqlSessionFactoryEMSDB")
    public SqlSessionFactory sqlSessionFactoryEMSDB(@Qualifier("datasourceEMSDB") DataSource datasourceEMSDB) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(datasourceEMSDB);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:/mappers/emsdb/*.xml"));
        return bean.getObject();
    }

    @Bean(name="sqlSessionTemplateEMSDB")
    public SqlSessionTemplate sqlSessionTemplateEMSDB(@Qualifier("sqlSessionFactoryEMSDB") SqlSessionFactory sqlSessionFactoryEMSDB) {
        return new SqlSessionTemplate(sqlSessionFactoryEMSDB);
    }
}
