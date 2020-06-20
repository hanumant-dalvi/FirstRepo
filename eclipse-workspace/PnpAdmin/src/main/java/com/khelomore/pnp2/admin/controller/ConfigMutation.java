package com.khelomore.pnp2.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.khelomore.pnp2.admin.response.Response;
import com.khelomore.pnp2.admin.service.ConfigManagerService;

@Component
public class ConfigMutation implements GraphQLMutationResolver {
	@Autowired
	private ConfigManagerService configService;

	public Response createConfiguration(String group, String key, String value) {
		return this.configService.createConfiguration(group, key, value);
	}

	public Response updateConfiguration(int id, String group, String key, String value) {
		return this.configService.updateConfiguration(id, group, key, value);
	}

	public Response deleteConfiguration(int id) {
		return this.configService.deleteConfiguration(id);
	}
	public Response generateOtp(String mobileNumber) {
		return this.configService.generateOtp(mobileNumber);
				 
	}

}
