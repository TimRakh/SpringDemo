package timurka.netology.demo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class JavaConfig {

        public JavaConfig() {
            int t = 0;
        }

        @Bean
        @ConditionalOnProperty(prefix = "netology", name = "profile.dev", havingValue = "true")
        public SystemProfile devProfile() {
            return new DevProfile();
        }

        @Bean
        @ConditionalOnProperty(prefix = "netology", name = "profile.dev", havingValue = "false")
        public SystemProfile prodProfile() {
            return new ProductionProfile();
        }
    }
}
