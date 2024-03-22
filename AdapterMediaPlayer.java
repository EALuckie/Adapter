public class AdapterMediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public AdaptedMediaPlayer(String mediaType) {
        if (mediaType.equalsIgnoreCase("vhs")) {
            this.advancedMediaPlayer = new VHSAdvancedMediaPlayer();
        } else if (mediaType.equalsIgnoreCase("cd")) {
            this.advancedMediaPlayer = new CDAdvancedMediaPlayer();
        } else {
            throw new IllegalArgumentException("Invalid media type: " + mediaType);
        }
    }

    @Override
    public void play(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase("vhs")) {
            advancedMediaPlayer.playVHS(fileName);
        } else if (mediaType.equalsIgnoreCase("cd")) {
            advancedMediaPlayer.playCD(fileName);
        } else {
            super.play(mediaType, fileName); // call the superclass's play method for unsupported media types
        }
    }
}
