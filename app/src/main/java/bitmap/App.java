/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;

public class App {

    public static void main(String[] args) throws IOException {

     BufferedImage imgg = ImageIO.read(new File("C://Users/Computergy World/Desktop/bitmap.bmp"));
       // black and whit img
      BufferedImage test =  Bitmap.thresholdImage(imgg,100);
      // rotate img
        BufferedImage rotateImg = Bitmap.rotate(imgg,90.0);
      // color img
     BufferedImage iamg =Bitmap.colorImage(imgg);




      try{
          ImageIO.write(test,"bmp",new File("C://Users/Computergy World/Desktop/download (1).bmp"));
          ImageIO.write(rotateImg,"bmp",new File("C://Users/Computergy World/Desktop/one.png"));
          ImageIO.write(iamg, "bmp", new File("C://Users/Computergy World/Desktop/T.bmp"));
      }catch (Exception e){
          System.out.println(e.getMessage());
      }





    }






//
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//    private static BufferedImage colorImage(BufferedImage image) {
//        int width = image.getWidth();
//        int height = image.getHeight();
//        WritableRaster raster = image.getRaster();
//
//        for (int xx = 0; xx < width; xx++) {
//            for (int yy = 0; yy < height; yy++) {
//                int[] pixels = raster.getPixel(xx, yy, (int[]) null);
//                pixels[0] = 111;
//                pixels[1] = 0;
//                pixels[2] = 222;
//                raster.setPixel(xx, yy, pixels);
//            }
//        }
//        return image;
//    }
//
//
//
//
//       ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    public static BufferedImage thresholdImage(BufferedImage image, int threshold) {
//        BufferedImage result = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
//        result.getGraphics().drawImage(image, 0, 0, null);
//        WritableRaster raster = result.getRaster();
//        int[] pixels = new int[image.getWidth()];
//        for (int y = 0; y < image.getHeight(); y++) {
//            raster.getPixels(0, y, image.getWidth(), 1, pixels);
//            for (int i = 0; i < pixels.length; i++) {
//                if (pixels[i] < threshold) pixels[i] = 0;
//                else pixels[i] = 255;
//            }
//            raster.setPixels(0, y, image.getWidth(), 1, pixels);
//        }
//        return result;
//    }
//
//      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    public static BufferedImage rotate1(BufferedImage image, double angle) {
//        double sin = Math.abs(Math.sin(angle)), cos = Math.abs(Math.cos(angle));
//        int w = image.getWidth(), h = image.getHeight();
//        int neww = (int)Math.floor(w*cos+h*sin), newh = (int) Math.floor(h * cos + w * sin);
//        GraphicsConfiguration gc = getDefaultConfiguration();
//        BufferedImage result = gc.createCompatibleImage(neww, newh, Transparency.TRANSLUCENT);
//        Graphics2D g = result.createGraphics();
//        g.translate((neww - w) / 2, (newh - h) / 2);
//        g.rotate(angle, w / 2, h / 2);
//        g.drawRenderedImage(image, null);
//        g.dispose();
//        return result;
//    }
//
//    private static GraphicsConfiguration getDefaultConfiguration() {
//        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//        GraphicsDevice gd = ge.getDefaultScreenDevice();
//        return gd.getDefaultConfiguration();
//    }
//
//      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    public static BufferedImage rotate(BufferedImage image, double angle) {
//        double sin = Math.abs(Math.sin(angle)), cos = Math.abs(Math.cos(angle));
//        int w = image.getWidth(), h = image.getHeight();
//        int neww = (int)Math.floor(w*cos+h*sin);
//        int newh = (int) Math.floor(h * cos + w * sin);
//        BufferedImage result = deepCopy(image, false);
//        Graphics2D g = result.createGraphics();
//        g.translate((neww - w) / 2, (newh - h) / 2);
//        g.rotate(angle, w / 2, h / 2);
//        g.drawRenderedImage(image, null);
//        g.dispose();
//        return result;
//    }
//
//    public static BufferedImage deepCopy(BufferedImage bi, boolean copyPixels) {
//        ColorModel cm = bi.getColorModel();
//        boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
//        WritableRaster raster = bi.getRaster().createCompatibleWritableRaster();
//        if (copyPixels) {
//            bi.copyData(raster);
//        }
//        return new BufferedImage(cm, raster, isAlphaPremultiplied, null);
//    }
}

