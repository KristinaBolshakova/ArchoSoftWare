package ModelElements;

import Stuff.Angle3D;
import Stuff.Point3D;

import javax.xml.stream.Location;
import java.awt.*;

public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public Float power;

    public Flash(Point3D location, Angle3D angle, Color color, Float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public void Rotate(Angle3D angle3D) {

    }

    public void Move(Point3D point3D) {

    }

}
