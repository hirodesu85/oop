public class SumView implements RobotView {
  private double totalDistance = 0.0;
  private double totalAngle = 0.0;

  @Override
  public void turn(double oldHeading, double newHeading) {
      // 角度の変化の絶対値を合計に加える
      totalAngle += Math.abs(newHeading - oldHeading);
  }

  @Override
  public void move(double oldX, double oldY, double newX, double newY) {
      // 移動距離を計算し、合計に加える
      double distance = Math.sqrt(Math.pow(newX - oldX, 2) + Math.pow(newY - oldY, 2));
      totalDistance += distance;
  }

  public double totalMove() {
      return totalDistance;
  }

  public double totalAngle() {
      return totalAngle;
  }
}
