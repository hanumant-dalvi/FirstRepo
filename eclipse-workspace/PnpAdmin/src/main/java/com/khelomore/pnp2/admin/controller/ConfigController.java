//package com.khelomore.pnp2.admin.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.khelomore.pnp2.admin.model.ConfigurationManager;
//import com.khelomore.pnp2.admin.response.Response;
//import com.khelomore.pnp2.admin.service.ConfigManagerService;
//
//@RestController
//@RequestMapping("/manage")
//public class ConfigController {
//	@Autowired
//	private ConfigManagerService configService;
//
//	@PostMapping("/create")
//	public Response createConfiguration(@RequestBody String group, String key, String value) {
//		return this.configService.createConfiguration(group, key, value);
//	}
//
//	@GetMapping("/get")
//	public List<ConfigurationManager> getConfiguartion() {
//		return this.configService.getConfiguration();
//	}
//
//}
