import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class AspectRatioCalculator {

    public static void main(String[] args) {
        try {
            // URL de la imagen
            String imageUrl = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.fundacion-affinity.org%2Fes%2Fbiblioteca%2Flos-8-sonidos-principales-del-perro&psig=AOvVaw391xz6Iozkn-SqjqtiwXBa&ust=1751900654097000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCJCuz9LAqI4DFQAAAAAdAAAAABAE";
            URL url = new URL(imageUrl);

            // Leer la imagen desde la URL
            BufferedImage image = ImageIO.read(url);

            // Obtener dimensiones
            int width = image.getWidth();
            int height = image.getHeight();

            // Calcular aspect ratio
            float aspectRatio = (float) width / height;

            // Mostrar resultados
            System.out.println("Ancho: " + width);
            System.out.println("Alto: " + height);
            System.out.println("Aspect Ratio: " + aspectRatio);

        } catch (IOException e) {
            System.out.println("Error al cargar la imagen: " + e.getMessage());
        }
    }
}


