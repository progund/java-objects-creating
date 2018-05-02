package se.juneday.mp3;

import javazoom.jl.player.Player;

import java.nio.file.*;
import static java.nio.file.StandardOpenOption.READ;

public class Mp3Player {

  public static void main(String[] args) throws Exception {
    Path file = Paths.get("ChopinWaltzEMinor.mp3");
    new Player(Files.newInputStream(file,READ)).play();
  }

}
