package com.khelomore.pnp2.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "config_manager", uniqueConstraints = @UniqueConstraint(columnNames = { "group_name", "key" }))
public class ConfigurationManager {
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "group_name")
	private String group;
	@Column(name = "key")
	private String key;
	@Column(name = "value")
	private String value;

	public ConfigurationManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ConfigurationManager [id=" + id + ", group=" + group + ", key=" + key + ", value=" + value + "]";
	}

}
