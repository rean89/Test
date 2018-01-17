package de.hs_heilbronn.stud.areinsch.dronecontrol.drone.message;

import de.hs_heilbronn.stud.areinsch.dronecontrol.drone.Drone;

/**
 * Created by AnAnd on 22.12.2017.
 */

public class ImuData extends DroneData {

    /**
     * Accel values of the drone for 3 axes.
     */
    private float[] accel;

    /**
     * Gyro values of the drone for 3 axes.
     */
    private float[] gyro;

    /**
     * Mag values of the dron for 3 axes;
     */
    private float[] mag;

    /**
     * Create a new imu data pkg.
     */
    public ImuData() {
        id = Drone.IMU;

        accel = new float[3];
        gyro = new float[3];
        mag = new float[3];
    }

    /**
     * Set the acceleration for the three axes.
     * @param accel Float array of length 3. [Ax, Ay, Az]
     */
    public void setAccel(float[] accel) {
        this.accel = accel;
    }

    /**
     * Get the acceleration for the three axes.
     * @return Float array of length 3 [Ax, Ay, Az].
     */
    public float[] getAccel() {
        return accel;
    }

    /**
     * Set the gyro for the three axes.
     * @param gyro Float array of length 3. [Gx, Gy, Gz]
     */
    public void setGyro(float[] gyro) {
        this.gyro = gyro;
    }

    /**
     * Get the gyro for the three axes.
     * @return Float array of length 3 [Gx, Gy, Gz].
     */
    public float[] getGyro() {
        return gyro;
    }

    /**
     * Set the magnet values for the three axes.
     * @param mag Float array of length 3. [Mx, My, Mz]
     */
    public void setMag(float[] mag) {
        this.mag = mag;
    }

    /**
     * Get the magnet values for the three axes.
     * @return Float array of length 3 [Mx, My, Mz].
     */
    public float[] getMag() {
        return mag;
    }

}
