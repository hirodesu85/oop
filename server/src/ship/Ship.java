package ship;

public class Ship {
  public interface View {
      void changed(Ship s);
  }
  private double x, y;
  public Ship(double x, double y) { this.x = x; this.y = y; }
  private View view;
	public void step(double dx, double dy) {
      x += dx;
      y += dy;
      view.changed(this);
  }
  public void setView(View view) {
      this.view = view;
  }
  public double getX() { return x; }
  public double getY() { return y; }
}
