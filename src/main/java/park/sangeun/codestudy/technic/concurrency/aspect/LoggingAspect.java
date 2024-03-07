package park.sangeun.codestudy.technic.concurrency.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Slf4j
public class LoggingAspect {
    @Around("execution(* park.sangeun.codestudy.technic.concurrency..*Controller.*(..))")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable { // Throwable 추가
        Arrays.stream(joinPoint.getArgs())
                .map(Object::toString)
                .forEach(arg -> log.info("### {} Request Param {}", joinPoint.getSignature().toShortString(), arg));

        Object result = joinPoint.proceed();


        log.info("### {} Response Param {}", joinPoint.getSignature().toShortString(), result);
        return result;
    }
}
