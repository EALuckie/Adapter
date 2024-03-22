# Adapter implementation
by Ing. Ernesto Luckie.
---

**Exercise**: In this case, let's assume we have two classes: "MediaPlayer" and "AdvancedMediaPlayer".

"MediaPlayer" has a method called "play()", which is used by clients. However, "AdvancedMediaPlayer" supports additional advanced features like "playVHS()" and "playCD()". Clients cannot directly use "AdvancedMediaPlayer", but they need its functionality with the simpler interface of "MediaPlayer".

To solve this problem, we create an adapter class called "AdapterMediaPlayer" that extends "MediaPlayer" and has a reference to an "AdvacedMediaPlayer" instance. In the "AdapterMediaPlayer" class, there is a method "play()", which calls the corresponding method in "AdvancedMediaPlayer" based on the media type.
