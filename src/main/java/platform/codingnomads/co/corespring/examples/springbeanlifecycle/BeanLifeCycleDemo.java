package platform.codingnomads.co.corespring.examples.springbeanlifecycle;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BeanLifeCycleDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(BeanLifeCycleConfig.class);
        ctx.refresh();
        final CodeWarrior codeWarrior = ctx.getBean(CodeWarrior.class);
        ctx.close();
    }
}
