package frc.sharklibs.IMU;

public interface Gyro<T> {

    public T getGyro();

    public double getPitch();

    public double getRoll();

    public double getYaw();

    public void setYaw(double value);

    public void reset();

    public void resetFlip();
}
