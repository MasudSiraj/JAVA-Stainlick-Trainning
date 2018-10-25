import javafx.scene.image.Image;

import javax.swing.text.Document;

public abstract class Printer {

    public abstract void print(Document doc);
    public abstract void print(Image image);
    public abstract void print(Document doc, Image image);
}
