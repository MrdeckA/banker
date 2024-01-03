package bj.ifri.banker;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "bj.ifri.banker")
public class CustomProperties {

	private String apiUrl;

}
