package paint;

public abstract class Shape implements Drawable {
	
	private String lineColor;
	private String fillColor;
	
	// public abstract void draw(); // {} 이것도 필요없음
	
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
}
