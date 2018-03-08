package day14;

import java.net.*;

import javax.imageio.ImageIO;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.*;

public class URLTest3 {
	public static void main(String[] args) {
		String imageName = "c:/iotest/duke1.jpg";
		try {
			URL req = new URL(
					"http://fardamento.netshoes.net/BR/LNetshoes/production/20141031/BADGE/20141031BADGE0014096.jpg");
			InputStream is = req.openStream();
			FileOutputStream fos = new FileOutputStream(imageName);

			BufferedImage bi = ImageIO.read(is);
			for (int y = 0; y < bi.getHeight(); y++) {
				for (int x = 0; x < bi.getWidth(); x++) {
					Color colour = new Color(bi.getRGB(x, y));
					int Y = (int) (0.299 * colour.getRed() + 0.587 * colour.getGreen() + 0.114 * colour.getBlue());
					bi.setRGB(x, y, new Color(Y, Y, Y).getRGB());
				}
			}
			ImageIO.write(bi, "JPG", fos);
			fos.close();
			System.out.println(imageName + "가 성공적으로 생성되었습니다.");
		} catch (MalformedURLException e) {
			System.out.println("URL문자열 오류 :" + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO오류 :" + e.getMessage());
		}
	}
}
