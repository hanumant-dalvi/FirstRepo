package com.khelomore.pnp2.admin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.khelomore.pnp2.admin.model.ConfigurationManager;
import com.khelomore.pnp2.admin.service.ConfigManagerService;

@Component
public class ConfigQuery implements GraphQLQueryResolver{
	@Autowired
	private ConfigManagerService configService;
	
	
	public List<ConfigurationManager> getConfiguartion(){
		return this.configService.getConfiguration();
	}

	public List<ConfigurationManager> getConfigurationByGroup(String group){
		return this.configService.getConfigurationByGroup(group);
	}
}
