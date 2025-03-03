package com.example.exercicio06;

import java.awt.Color;
import java.util.List;

public enum Nationality {

  DUTCH(List.of(Color.RED, Color.WHITE, Color.BLUE)),
  GERMAN(List.of(Color.BLACK, Color.RED, Color.YELLOW)),
  BELGIAN(List.of(Color.BLACK, Color.YELLOW, Color.RED)),
  FRENCH(List.of(Color.BLUE, Color.WHITE, Color.RED)),
  ITALIAN(List.of(Color.GREEN, Color.WHITE, Color.RED)),
  UNCLASSIFIED(List.of(Color.GRAY));

  private final List<Color> flagColors;

  Nationality(List<Color> flagColors) {
      this.flagColors = flagColors;
  }

  public List<Color> getFlagColors() {
      return flagColors;
  }
}
