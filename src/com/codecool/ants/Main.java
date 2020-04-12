package com.codecool.ants;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void displayAntMatrix(Ant[][] antMatrix) {
        String[][] antMatrixDisplay = new String[100][100];
        for (int line = 0; line < antMatrix.length; line++) {
            for (int column = 0; column < antMatrix.length; column++) {
                if (antMatrix[line][column] != null) {
                    String antSubclass = antMatrix[line][column].getClass().toGenericString().replace("public class com.codecool.ants.", "");
                    switch (antSubclass) {
                        case "Queen":
                            antMatrixDisplay[line][column] = "Q";
                            break;

                    }
                } else {
                    antMatrixDisplay[line][column] = "*";
                }

            }
        }

        for (int line = 0; line < antMatrix.length; line++) {
            for (int column = 0; column < antMatrix.length; column++) {
                System.out.print(" " + antMatrixDisplay[line][column]+ " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        // write your code here
        Ant[][] colony = new Ant[100][100];
        System.out.println(colony[0][0]);
        Ant queenAnt = new Queen("Queen Ant");
        ((Queen) queenAnt).setPosition(colony);
        displayAntMatrix(colony);


    }
}
