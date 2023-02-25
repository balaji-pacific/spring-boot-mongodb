/**
 * 
 */
package com.springboot.mongodb.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author balajisoundarrajan
 *
 */



@Document(collection = "JobPost")
public class Post {
	
	@Id
	private int id;
	private String desc;
	private int exp;
	private String profile;
	private List<String> techs;
	
	
	/**
	 * 
	 */
	public Post() {
		super();
	}


	/**
	 * @param id
	 * @param desc
	 * @param exp
	 * @param profile
	 * @param techs
	 */
	public Post(int id, String desc, int exp, String profile, List<String> techs) {
		super();
		this.id = id;
		this.desc = desc;
		this.exp = exp;
		this.profile = profile;
		this.techs = techs;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}


	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}


	/**
	 * @return the exp
	 */
	public int getExp() {
		return exp;
	}


	/**
	 * @param exp the exp to set
	 */
	public void setExp(int exp) {
		this.exp = exp;
	}


	/**
	 * @return the profile
	 */
	public String getProfile() {
		return profile;
	}


	/**
	 * @param profile the profile to set
	 */
	public void setProfile(String profile) {
		this.profile = profile;
	}


	/**
	 * @return the techs
	 */
	public List<String> getTechs() {
		return techs;
	}


	/**
	 * @param techs the techs to set
	 */
	public void setTechs(List<String> techs) {
		this.techs = techs;
	}


	@Override
	public String toString() {
		return "Post [id=" + id + ", desc=" + desc + ", exp=" + exp + ", profile=" + profile + ", techs=" + techs + "]";
	}

	
	

}
