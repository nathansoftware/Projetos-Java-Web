package org.apache.struts.edit.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.edit.model.Person;
import org.apache.struts.edit.model.State;
import org.apache.struts.edit.service.EditService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class EditAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private EditService editService ;
	
	private Person personBean;
	
	private String [] sports = {"futebol", "tenis de mesa", "basquete" };
	
	private String [] genders = {"masculino", "feminino"};
	
	private List<State> states ;

	private String [] carModelsAvailable = {"Ford","Chrysler","Toyota","Nissan"};

	public String execute() throws Exception {
		
	    editService.savePerson( getPersonBean() );
		
		return SUCCESS;
		
	}
	
	
	public String input() throws Exception {
		
		setPersonBean( editService.getPerson() );
		
		return INPUT;
	}
	
	public Person getPersonBean() {
		
		
		return personBean;
		
	}
	
	public void setPersonBean(Person person) {
		
		personBean = person;
		
	}


	public List<String> getSports() {
		return Arrays.asList(sports);
	}
	
	public List<String> getGenders() {
		
		return Arrays.asList(genders);
		
	}



	public List<State> getStates() {
		
		states = new ArrayList<State>();
		states.add( new State("SP", "São Paulo") );
		states.add( new State("MG", "Minas Gerais") );
		states.add( new State("RJ", "Rio de Janeiro") );
		states.add( new State("SC", "Santa Catarina") );
		states.add( new State("BA", "Bahia") );
		
		return states;
	}



	public String [] getCarModelsAvailable() {
		return carModelsAvailable;
	}


	public EditService getEditService() {
		return editService;
	}


	public void setEditService(EditService editService) {
		
		this.editService = editService;
		
	}

}