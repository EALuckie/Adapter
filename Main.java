public class main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = null; // initialize with null
        if ("vhs".equalsIgnoreCase(mediaType)) {
            mediaPlayer = new AdaptedMediaPlayer("vhs") {
                private AdvancedMediaPlayer advancedMediaPlayer = new VHSAdvancedMediaPlayer();
            };
        } else if ("cd".equalsIgnoreCase(mediaType)) {
            mediaPlayer = new AdaptedMediaPlayer("cd") {
                private AdvancedMediaPlayer advancedMediaPlayer = new CDAdvancedMediaPlayer();
            };
        }

        mediaPlayer.play("cd", "Michael Jackson - Thriller.mp3"); // call play method on the MediaPlayer interface
    }
}
