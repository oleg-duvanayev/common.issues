package tutorial.web.api;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

/**
 * is used to declare the DispatcherServlet 
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan("tutorial")
public class WebConfig extends WebMvcConfigurerAdapter {
	
//	@Bean
//	public ViewResolver internalResourceViewResolver(){
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		
//		resolver.setPrefix("/WEB-INF/views/");
//		resolver.setSuffix(".jsp");
//		resolver.setExposeContextBeansAsAttributes(true);
//		return resolver;
//	}

//	@Bean
//	public ViewResolver viewResolver(){
//		TilesViewResolver resolver = new TilesViewResolver();
//		return resolver;
//	}
	
//	@Bean
//	public TilesConfigurer tilesConfigurer(){
//		TilesConfigurer tilesConfigurer = new TilesConfigurer();
//		tilesConfigurer.setDefinitions(new String[]{
//				"/WEB-INF/layout/tiles.xml"
//		});
//		tilesConfigurer.setCheckRefresh(true);
//		return tilesConfigurer;
//	}
	
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource bundleMessageSource = new ResourceBundleMessageSource();
		bundleMessageSource.setBasename("messages");
		return bundleMessageSource;
	}
	
	
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
