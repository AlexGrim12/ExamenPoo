import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import java.io.File;

public class ManejoArchivosAudio {

    public static void main(String[] args) {
        // Reproducir archivo de audio WAV
        reproducirArchivoAudio("cancion.wav");
    }

    // Método para reproducir un archivo de audio WAV
    private static void reproducirArchivoAudio(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivo);

            // Obtener un Clip y abrir la secuencia de audio
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);

            // Agregar un listener para detectar el final de la reproducción
            clip.addLineListener(new LineListener() {
                @Override
                public void update(LineEvent event) {
                    if (event.getType() == LineEvent.Type.STOP) {
                        System.out.println("Reproducción finalizada");
                        clip.close();  // Cerrar el Clip después de la reproducción
                    }
                }
            });

            // Iniciar la reproducción
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
