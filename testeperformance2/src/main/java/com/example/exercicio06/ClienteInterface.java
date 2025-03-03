package com.example.exercicio06;

import java.awt.Color;
import java.util.List;

public class ClienteInterface {
  public List<Color> getFlagColors(Nationality nationality) {
    return nationality.getFlagColors();
  }
}
