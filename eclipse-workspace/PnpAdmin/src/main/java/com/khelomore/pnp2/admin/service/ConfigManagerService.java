package com.khelomore.pnp2.admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.khelomore.pnp2.admin.model.ConfigurationManager;
import com.khelomore.pnp2.admin.model.OtpStore;
import com.khelomore.pnp2.admin.repository.ConfigManagerRepository;
import com.khelomore.pnp2.admin.response.Response;

import kotlin.OptIn;

@Service
public class ConfigManagerService {
	private ConfigManagerRepository configRepository;

	public ConfigManagerService(final ConfigManagerRepository configRepository) {
		this.configRepository = configRepository;
	}

	public List<ConfigurationManager> getConfiguration() {
		return this.configRepository.findAll();
	}

	public Response createConfiguration(String group, String key, String value) {
		final ConfigurationManager configManger = new ConfigurationManager();
		if (group.isEmpty()) {
			return new Response("unable to create", "failed", "field not present");
		}
		configManger.setGroup(group);
		configManger.setKey(key);
		configManger.setValue(value);
		configRepository.save(configManger);
		return new Response("record created successfully", "success", "null");

	}

	public Response updateConfiguration(int id, String group, String key, String value) {
		Optional<ConfigurationManager> configManager = configRepository.findById(id);
		if (configManager.isPresent()) {
			configManager.get().setGroup(group);
			configManager.get().setKey(key);
			configManager.get().setValue(value);
			configRepository.save(configManager.get());
			return new Response("Record updated successfully", "success", "null");
		}
		return new Response("Unable to update", "failed", "id is not present");

	}

	public Response deleteConfiguration(int id) {
		Optional<ConfigurationManager> configId = configRepository.findById(id);
		if (configId.isPresent()) {
			configRepository.delete(configId.get());
			return new Response("Record deleted successfully", "sucess", "null");
		}
		return new Response("Unable to delete", "failed", "id is not present");
	}

	public List<ConfigurationManager> getConfigurationByGroup(String group) {
		return this.configRepository.findByGroup(group);
	}

	public Response generateOtp(String mobileNumber) {
		return new Response("generate", "success","null");
	}

}
