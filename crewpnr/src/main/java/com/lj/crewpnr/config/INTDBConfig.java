package com.lj.crewpnr.config;

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

// INTDB(stg BIDB) 연결 설정
@Configuration
@MapperScan(value={"com.lj.crewpnr.mapper.intdb"}, sqlSessionTemplateRef="sqlSessionTemplateINTDB")
public class INTDBConfig {

    @Primary
    @Bean(name="datasourceINTDB")
    @ConfigurationProperties("spring.datasource.intdb")
    public DataSource datasourceINTDB() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name="sqlSessionFactoryINTDB")
    public SqlSessionFactory sqlSessionFactoryINTDB(@Qualifier("datasourceINTDB") DataSource datasourceINTDB) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(datasourceINTDB);
        bean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:config/mybatis-config.xml"));
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mappers/intdb/*.xml"));
        return bean.getObject();
    }

    @Primary
    @Bean(name="sqlSessionTemplateINTDB")
    public SqlSessionTemplate sqlSessionTemplateINTDB(@Qualifier("sqlSessionFactoryINTDB") SqlSessionFactory sqlSessionFactoryINTDB) {
        return new SqlSessionTemplate(sqlSessionFactoryINTDB);
    }
}
