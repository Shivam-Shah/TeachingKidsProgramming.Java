package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class KnottedRing
{
  public static void colorPalette(String[] args)
  {
    for (int i = 1; i <= 30; i++)
    {
      Tortoise.move(10);
      ColorWheel.addColor(Colors.Pinks.HotPink);
      ColorWheel.addColor(Colors.Reds.Red);
      ColorWheel.addColor(Colors.Pinks.Fuchsia);
      ColorWheel.addColor(Colors.Oranges.OrangeRed);
      ColorWheel.addColor(Colors.Pinks.DeepPink);
      ColorWheel.addColor(Colors.Reds.MediumVioletRed);
      ColorWheel.addColor(Colors.Reds.Crimson);
      ColorWheel.addColor(Colors.Reds.Tomato);
      Tortoise.setPenColor(ColorWheel.getRandomColorFromWheel());
      drawOctagon();
      drawOctagon();
      Tortoise.turn(360 / 30);
      Tortoise.turn(5);
    }
  }
  private static void drawOctagon()
  {
    for (int i = 1; i <= 8 + 1; i++)
    {
      Tortoise.move(110);
      Tortoise.turn(360 / 8);
    }
  }
}
