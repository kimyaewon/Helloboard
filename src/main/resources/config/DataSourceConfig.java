import org.springframework.boot.jdbc.DataSourceBuilder;

@Configuration
public class DataSourceConfig {
	@Configurationproperties(prefix = "spring.datasource")
	@Bean
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
}
