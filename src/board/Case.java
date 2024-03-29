package board;
/**
 * @author Eduardo Dom
 */
public class Case implements Cloneable
{
	private boolean empty;
	private boolean EdgeLeftBegin;
	private boolean EdgeLeftEnd;
	private boolean EdgeRightBegin;
	private boolean EdgeRightEnd;
	private boolean EdgeUpBegin;
	private boolean EdgeUpEnd;
	private boolean EdgeDownBegin;
	private boolean EdgeDownEnd;
	private int x;
	private int y;
	
	public Case(int x ,int y)
	{
		empty = true;//la case est vide
		EdgeLeftBegin = false;//il n'y a pas de mur à gauche de la case
		EdgeLeftEnd = false;
		EdgeRightBegin = false;
		EdgeRightEnd = false;//il n'y a pas de mur à droite de la case
		EdgeUpBegin = false;//il n'y a pas de mur en haut de la case
		EdgeUpEnd = false;
		EdgeDownBegin = false; // il n'y a pas de mur en bas de la case
		EdgeDownEnd = false;
		this.x = x;
		this.y = y;
	}
	
	public Case clone() throws CloneNotSupportedException{
		return (Case) super.clone();
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public String toString(){
		return "("+this.x+","+this.y+")";
	}

	public void setEmpty(boolean new_value) {
		this.empty = new_value;
	}

	public boolean isEdgeLeftBegin() {
		return EdgeLeftBegin;
	}

	public void setEdgeLeftBegin(boolean value_EdgeLeftBegin) {
		this.EdgeLeftBegin = value_EdgeLeftBegin;
	}

	public boolean isEdgeLeftEnd() {
		return EdgeLeftEnd;
	}

	public void setEdgeLeftEnd(boolean value_EdgeLeftEnd) {
		this.EdgeLeftEnd = value_EdgeLeftEnd;
	}

	public boolean isEdgeUpBegin() {
		return EdgeUpBegin;
	}

	public void setEdgeUpBegin(boolean value_EdgeUpBegin) {
		this.EdgeUpBegin = value_EdgeUpBegin;
	}

	public boolean isEdgeUpEnd() {
		return EdgeUpEnd;
	}
	
	public boolean isEdgeRightBegin(){
		return EdgeRightBegin;
	}
	
	public void setEdgeRightBegin(boolean new_value){
		this.EdgeRightBegin = new_value;
	}
	
	public boolean isEdgeRightEnd(){
		return EdgeRightEnd;
	}

	public void setEdgeUpEnd(boolean value_EdgeUpEnd) {
		this.EdgeUpEnd = value_EdgeUpEnd;
	}

	public boolean isEdgeDownBegin() {
		return EdgeDownBegin;
	}

	public void setEdgeDownBegin(boolean value_EdgeDownBegin) {
		this.EdgeDownBegin = value_EdgeDownBegin;
	}

	public boolean isEdgeDownEnd() {
		return EdgeDownEnd;
	}
	
	public int getX(){
		return x;
	}
	

	public int getY(){
		return y;
	}
	
	
	public void setEdgeDownEnd(boolean value_EdgeDownEnd) {
		this.EdgeDownEnd = value_EdgeDownEnd;
	}

	public void setEdgeRightEnd(boolean value_EdgeRightEnd) {
		this.EdgeRightEnd = value_EdgeRightEnd;
	}
	
	
}

