package tutorial.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.webflow.context.servlet.DefaultFlowUrlHandler;
import org.springframework.webflow.context.servlet.FlowUrlHandler;
import org.springframework.webflow.definition.registry.FlowDefinitionRegistry;
import org.springframework.webflow.executor.FlowExecutor;
import org.springframework.webflow.mvc.servlet.FlowHandlerAdapter;
import org.springframework.webflow.mvc.servlet.FlowHandlerMapping;

@Configuration
@ImportResource("classpath:webflow-config.xml")
public class WebflowContextConfiguration {
	@Autowired
	private FlowExecutor flowExecutor;
	@Autowired
	private FlowDefinitionRegistry flowDefinitionRegistry;

	@Bean
	public FlowHandlerAdapter getFlowHandlerAdapter(){
		FlowHandlerAdapter adapter = new FlowHandlerAdapter();
		adapter.setFlowExecutor(flowExecutor);
		return adapter;
	}
	
	@Bean
	public FlowHandlerMapping getFlowHandlerMapping(){
		FlowHandlerMapping handler = new FlowHandlerMapping();
		handler.setFlowRegistry(flowDefinitionRegistry);
		return handler;
	}
}
