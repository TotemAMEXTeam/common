package net.twilightstudios.amex.agenda.entity;

import java.util.List;

import net.twilightstudios.amex.flight.entity.FlightStatus;
import net.twilightstudios.amex.language.entity.LanguageExpression;
import net.twilightstudios.amex.places.entity.Place;
import net.twilightstudios.amex.places.entity.PlaceExtended;
import net.twilightstudios.amex.weather.entity.Forecast;

public class Agenda {
	
	private List<PlaceExtended> restaurants;
	private List<PlaceExtended> activities;
	private FlightStatus flightStatus;
	private List<LanguageExpression> expressions;
	private List<Forecast> weatherForecast;
	private byte[] map;
	
	public List<PlaceExtended> getRestaurants() {
		return restaurants;
	}
	public void setRestaurants(List<PlaceExtended> restaurants) {
		this.restaurants = restaurants;
	}
	public List<PlaceExtended> getActivities() {
		return activities;
	}
	public void setActivities(List<PlaceExtended> activities) {
		this.activities = activities;
	}
	public FlightStatus getFlightStatus() {
		return flightStatus;
	}
	public void setFlightStatus(FlightStatus flightStatus) {
		this.flightStatus = flightStatus;
	}
	public List<LanguageExpression> getExpressions() {
		return expressions;
	}
	public void setExpressions(List<LanguageExpression> expressions) {
		this.expressions = expressions;
	}
	public byte[] getMap() {
		return map;
	}
	public void setMap(byte[] map) {
		this.map = map;
	}
	public List<Forecast> getWeatherForecast() {
		return weatherForecast;
	}
	public void setWeatherForecast(List<Forecast> weatherForecast) {
		this.weatherForecast = weatherForecast;
	}
	
}
