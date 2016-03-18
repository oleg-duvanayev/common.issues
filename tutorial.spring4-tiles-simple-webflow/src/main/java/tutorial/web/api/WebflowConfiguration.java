package tutorial.web.api;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.webflow.config.AbstractFlowConfiguration;
import org.springframework.webflow.definition.registry.FlowDefinitionRegistry;
import org.springframework.webflow.engine.builder.support.FlowBuilderServices;
import org.springframework.webflow.executor.FlowExecutor;
import org.springframework.webflow.mvc.builder.MvcViewFactoryCreator;
import org.springframework.webflow.mvc.servlet.FlowHandlerAdapter;
import org.springframework.webflow.mvc.servlet.FlowHandlerMapping;

@Configuration
@EnableWebMvc
public class WebflowConfiguration extends AbstractFlowConfiguration{
	
	@Autowired
	private WebConfig webConfig;
	
	@Bean
	public FlowHandlerAdapter getFlowAdapter(){
		FlowHandlerAdapter adapter = new FlowHandlerAdapter();
		adapter.setFlowExecutor(flowExecutor());
		return adapter;
	}
	
	@Bean
	public FlowHandlerMapping getFlowMapping(){
		FlowHandlerMapping mapping = new FlowHandlerMapping();
		mapping.setFlowRegistry(flowRegistry());
		mapping.setOrder(-1);
		return mapping;
	}
	
	@Bean
	public FlowExecutor flowExecutor() {
		return getFlowExecutorBuilder(flowRegistry())
//				.addFlowExecutionListener(new SecurityFlowExecutionListener(), "*")
				.build();
	}
	
	@Bean
	public FlowDefinitionRegistry flowRegistry() {
		return getFlowDefinitionRegistryBuilder(flowBuilderServices())
				.setBasePath("/WEB-INF/flows")
				.addFlowLocation("createGroup-flow.xml", "creategroup")
//				.addFlowLocationPattern("/**/*-flow.xml")
				.build();
	}

	@Bean
	public FlowBuilderServices flowBuilderServices() {
		return getFlowBuilderServicesBuilder()
				.setViewFactoryCreator(mvcViewFactoryCreator())
//				.setValidator(validator())
				.setDevelopmentMode(true)
				.build();
	}
	
	@Bean
	public MvcViewFactoryCreator mvcViewFactoryCreator() {
		MvcViewFactoryCreator factoryCreator = new MvcViewFactoryCreator();
		factoryCreator.setViewResolvers(Arrays.<ViewResolver>asList(webConfig.viewResolver()));
		factoryCreator.setUseSpringBeanBinding(true);
		return factoryCreator;
	}
	
//	@Bean
//	public LocalValidatorFactoryBean validator() {
//		return new LocalValidatorFactoryBean();
//	}
	
}
