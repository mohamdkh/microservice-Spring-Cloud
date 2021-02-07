package ehtp.medkh.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class MyCompanyConfig {
	@Value("${xParam}")
	private String xParam;
	@Value("${yParam}")
	private String yParam;
	@Value("${me}")
	private String me;
	@Value("${server.port}")
	private String port;
	@GetMapping(value = "/MyConfig")
	public Map<String,Object> GetConfig(){
		Map<String,Object> configs=new HashMap<>();
		configs.put("xParam", xParam);
		configs.put("yParam", yParam);
		configs.put("me", me);
		configs.put("port", port);
		configs.put("ThreadName", Thread.currentThread().getName());
		return configs;
	}
}
