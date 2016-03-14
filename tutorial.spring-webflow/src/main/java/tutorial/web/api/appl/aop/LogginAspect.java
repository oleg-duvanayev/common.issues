package tutorial.web.api.appl.aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAspect {
	private Logger logger = Logger.getLogger(getClass());
	   @Around("execution( * tutorial.web.api.*.*(..))" )
	   public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		logger.debug("================== START:: "+joinPoint.getSignature().getName()+" ==================" );
		logger.debug("Arguments : " + Arrays.toString(joinPoint.getArgs()));
			
		Object result = joinPoint.proceed(); //continue on the intercepted method
		logger.debug("Returned value: ["+result+"]");
			
		logger.debug("================== END:: "+joinPoint.getSignature().getName()+" ==================" );
		return result;
	   }
}
