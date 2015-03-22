package demo

import org.springframework.context.annotation.AnnotationConfigApplicationContext

class EmbeddedLdapApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext()
        ctx.register(AppConfig.class)
        ctx.refresh()

        System.out.println("Ready!")
        System.out.println("Try to connect!")
        while(true) {
        }
    }
}
