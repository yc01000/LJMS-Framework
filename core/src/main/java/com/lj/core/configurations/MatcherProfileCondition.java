package com.lj.core.configurations;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.Assert;
import org.springframework.util.MultiValueMap;

/**
 * <pre>
 * <B>support</B>
 *     |_ MatcherProfileCondition.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @since   : 2017. 12. 22. 오전 9:18:17 
 *  @version : 1.0
 *  @desc    : @MatcherProfile 의 Condition 구현체
 */
public class MatcherProfileCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		if ((null != context) && (null != context.getEnvironment()) && (null != metadata)) {
			MultiValueMap<String, Object>	attrs	= metadata.getAllAnnotationAttributes(MatcherProfile.class.getName());

			if (null != attrs) {
				// check that all match
				for (Object value : attrs.get("value")) {
					// check that 1 set of profiles matches
					String[]	profiles	= (String[])value;

					Assert.notEmpty(profiles, "Must specify at least one profile");

					for (String profile : profiles) {
						if (!context.getEnvironment().acceptsProfiles(profile)
								&& !matchProfiles(context, profile)) {
							return false;
						}
					}
				}

				return true;
            }
        }

        return false;
	}

	/**
	 * jhbang (2017. 12. 22. 오전 9:19:01)<br/>
	 * desc   :  AntPath 타입으로 프로파일명 매칭 처리
	 * 
	 * @param context
	 * @param profile
	 * @return
	 */
	private boolean matchProfiles(ConditionContext context, String profile) {
		String[]		profileNames	= context.getEnvironment().getActiveProfiles();
		AntPathMatcher	antMatcher		= new AntPathMatcher();

		if (null != profileNames) {
			for (String profileName : profileNames) {
				if (antMatcher.match(profile, profileName) || profileName.startsWith(profile)) {
					return true;
				}
			}
		}

		return false;
	}
}
