package net.twilightstudios.amex.flight.entity;

import java.util.Date;

public class Flight {
	
	private Long id;
	private String flightNumber;
	private String origin;
	private String destiny;
	private String company;
	private Date scheduledDeparture;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestiny() {
		return destiny;
	}
	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Date getScheduledDeparture() {
		return scheduledDeparture;
	}
	public void setScheduledDeparture(Date scheduledDeparture) {
		this.scheduledDeparture = scheduledDeparture;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (destiny == null) {
			if (other.destiny != null)
				return false;
		} else if (!destiny.equals(other.destiny))
			return false;
		if (flightNumber == null) {
			if (other.flightNumber != null)
				return false;
		} else if (!flightNumber.equals(other.flightNumber))
			return false;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (scheduledDeparture == null) {
			if (other.scheduledDeparture != null)
				return false;
		} else if (!scheduledDeparture.equals(other.scheduledDeparture))
			return false;
		return true;
	}
	
	

}
