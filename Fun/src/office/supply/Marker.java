package office.supply;

import java.awt.*;
import java.util.Objects;

public class Marker {

    private Color color;
    private boolean scented;
    private boolean eraseable;

    public Marker(Color color, boolean scented, boolean eraseable) {
        this.color = color;
        this.scented = scented;
        this.eraseable = eraseable;
    }


    @Override
    public boolean equals(Object o) {
        return isSameColorAndErasable(o);
    }

    private boolean isSameColorAndErasable(Object o) {
        if (this == o) return true;
        if (!(o instanceof Marker)) return false;
        Marker marker = (Marker) o;
        return color.equals(marker.color) &&
                eraseable == marker.eraseable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, scented, eraseable);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Marker{");
        sb.append("color=").append(color);
        sb.append(", scented=").append(scented);
        sb.append(", eraseable=").append(eraseable);
        sb.append('}');
        return sb.toString();
    }
}
