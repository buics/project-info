package project_traker.project_traker;

import java.util.List;

import org.springframework.data.annotation.Id;

public class ProjectInfo {

	@Id
	String id;
	String name;
	String description;
	String dateStart;
	
	List<Sponsor> sponsorList;
	
	
	
	/**
	 * 
	 * @return
	 */
	public List<Sponsor> getSponsorList() {
		return sponsorList;
	}
	public void setSponsorList(List<Sponsor> sponsorList) {
		this.sponsorList = sponsorList;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDateStart() {
		return dateStart;
	}
	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}
	
	
	
}
