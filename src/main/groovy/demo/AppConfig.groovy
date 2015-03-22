package demo

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource

@Configuration
@ImportResource("classpath:/ldapContext.xml")
class AppConfig {

}
