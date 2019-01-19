package com.luo.webspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
@ComponentScan(basePackages = { "com.luo.webspring.service", "com.luo.webspring.components" }
// , excludeFilters =
// {@Filter(type=FilterType.ANNOTATION,classes=EnableWebMvc.class) }
)
public class RootConfig {

	// 创建过滤器
	@Bean
	public CharacterEncodingFilter createEncodingFilter() {
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		encodingFilter.setForceEncoding(true);
		return encodingFilter;
	}
	// 加载打印日志

}
