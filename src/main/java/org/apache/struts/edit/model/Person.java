package org.apache.struts.edit.model;

import java.util.Arrays;



public class Person
{
	
    private String firstName;
    private String lastName;
    private String sport;
    private String gender;
    private String residency;
    private boolean over21;
    private String [] carModels;
 

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }




	public void setSport(String sport) {
		this.sport = sport;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public String getSport() {
		return sport;
	}

	public void setResidency(String residency) {
		this.residency = residency;
	}

	public String getResidency() {
		return residency;
	}

	public void setOver21(boolean over21) {
		this.over21 = over21;
	}

	public boolean isOver21() {
		return over21;
	}

	public void setCarModels(String [] carModels) {
		this.carModels = carModels;
	}

	public String [] getCarModels() {
		return carModels;
	}

	public String toString()
    {
        return "Primeiro nome: " + getFirstName() + " | " +
        " Segundo nome:  " + getLastName() + " | " +
        " Esporte favorito: " + getSport() + " | " +
        " Sexo: " + getGender() + " | " +  
        " Estado residente: " + getResidency() + " | " +
        " Mais ou igual á 21: " + isOver21()  + " | " +
        " Modelos de carro: " + Arrays.asList( getCarModels() ) ;
        
    }
}
