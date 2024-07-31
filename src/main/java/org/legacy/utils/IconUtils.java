package org.legacy.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class IconUtils {
    public static BufferedImage loadImage(String ImageName) {
        try (InputStream is = IconUtils.class.getClassLoader().getResourceAsStream(ImageName)) {
            if (is == null) {
                throw new IllegalArgumentException("Resource not found: "+ImageName);
            }
            return ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
