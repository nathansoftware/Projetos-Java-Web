package org.apache.struts.edit.service;

import org.apache.struts.edit.model.Person;


public class EditServiceInMemory implements EditService {
	

	private static Person person ;
	private static String [] carModels = {"Ford","Nissan"};

	
	static {
		
		person = new Person();
		
	}

	
	public Person getPerson() {
		
		return EditServiceInMemory.person;
	}


	public void savePerson(Person personBean) {

		EditServiceInMemory.person.setFirstName(personBean.getFirstName() );
		EditServiceInMemory.person.setLastName(personBean.getLastName() );
		EditServiceInMemory.person.setSport(personBean.getSport() );
		EditServiceInMemory.person.setGender( personBean.getGender() );
		EditServiceInMemory.person.setResidency( personBean.getResidency() );
		EditServiceInMemory.person.setOver21( personBean.isOver21() );
		EditServiceInMemory.person.setCarModels(personBean.getCarModels() );

	}

}
