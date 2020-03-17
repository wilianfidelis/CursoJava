package entities;

public class Comment {

	private String text;

	
	// ----- Contrutores
	public Comment() {
	}
	
	public Comment(String text) {
		this.text = text;
	}


	// --- Get e set
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
