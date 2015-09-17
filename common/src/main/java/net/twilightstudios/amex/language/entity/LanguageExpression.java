package net.twilightstudios.amex.language.entity;

public class LanguageExpression {
	
	private Long id;
	private String originLanguage;
	private String destinyLanguage;
	private String originExpression;
	private String destinyExpression;
	private String explanation;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOriginLanguage() {
		return originLanguage;
	}
	public void setOriginLanguage(String originLanguage) {
		this.originLanguage = originLanguage;
	}
	public String getDestinyLanguage() {
		return destinyLanguage;
	}
	public void setDestinyLanguage(String destinyLanguage) {
		this.destinyLanguage = destinyLanguage;
	}
	public String getOriginExpression() {
		return originExpression;
	}
	public void setOriginExpression(String originExpression) {
		this.originExpression = originExpression;
	}
	public String getDestinyExpression() {
		return destinyExpression;
	}
	public void setDestinyExpression(String destinyExpression) {
		this.destinyExpression = destinyExpression;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	
}
