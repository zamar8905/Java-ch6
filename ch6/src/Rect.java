
public class Rect {
	int width;
	int height;
	public Rect(int w, int h){
		width = w;
		height = h;
	}
	public boolean equals(Rect p){
		if(width*height == p.width * p.height)
			return true;
		else 
			return false;
	}
}
