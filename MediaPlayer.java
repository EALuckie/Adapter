public class MediaPlayer {
    // Default compatible media: .mp3, .mp4, .obj, .ovs.
    // Just for the sake of this exercise.
    //
    public void play(String mediaType, String fileName){
        if (mediaType.equals(".mp3") || mediaType.equals(".mp4") || mediaType.equals(".obj") || mediaType.equals(".ovs")) {
            System.out.println("Player media")
        }
        else if (mediaType.equals("vhs")) {
            // code to play VHS
        } else if (mediaType.equals("cd")) {
            // code to play CD
        } else {
            throw new UnsupportedOperationException("Invalid media: " + mediaType);
        }
    }
}
