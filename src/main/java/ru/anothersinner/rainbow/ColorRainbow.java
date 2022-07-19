package ru.anothersinner.rainbow;

import java.util.Scanner;

public class ColorRainbow {
        public static void main(String[] args) {
            while (true) {
                Scanner rainbow = new Scanner(System.in);
                System.out.println("Your world is mine");
                System.out.println("Введите цвет: ");
                String color = rainbow.nextLine();
                String colorInsensitive = color.toLowerCase();
                switch (colorInsensitive) {
                    case "красный":
                    case "ораньжевый":
                    case "желтый":
                    case "жёлтый":
                    case "зелёный":
                    case "зеленый":
                    case "голубой":
                    case "синий":
                    case "фиолетовый":
                    case "red":
                    case "orange":
                    case "yellow":
                    case "green":
                    case "blue":
                    case "cyan":
                    case "purple":
                        System.out.println(color + " является одним из цветов радуги.");
                        break;
                    default:
                        System.out.println("Не верно указан цвет или нет в списке цветов радуги.");
                        break;
                }
            }
        }
    }


