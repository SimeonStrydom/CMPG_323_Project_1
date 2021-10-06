package za.ac.nwu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"za.ac.nwu"})                // Add 'controller' and 'exceptions' packages to module, then in here

public class WebConfig {
}
