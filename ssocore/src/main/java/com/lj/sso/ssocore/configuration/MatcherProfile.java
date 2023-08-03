package com.lj.sso.ssocore.configuration;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Conditional;

/**
 * <pre>
 * <B>support</B>
 *     |_ MatcherProfile.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @since   : 2017. 12. 22. 오전 8:26:11 
 *  @version : 1.0
 *  @desc    : 서버별 고정 환경 설정 프로파일 적용을 위한 @Profile 커스터마이징
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Conditional(MatcherProfileCondition.class)
public @interface MatcherProfile {
	String[] value();
}
