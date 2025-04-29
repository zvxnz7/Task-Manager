package org.zvxnz;

import java.util.Objects;

public class Graphics {

    public void printGraphic(String graphic) {
        if (Objects.equals(graphic, "loadingScreen")){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n  _____         _      __  __                                     _   ___  ");
            System.out.println(" |_   _|_ _ ___| | __ |  \\/  | __ _ _ __   __ _  __ _  ___ _ __  / | / _ \\ ");
            System.out.println("   | |/ _` / __| |/ / | |\\/| |/ _` | '_ \\ / _` |/ _` |/ _ \\ '__| | || | | |");
            System.out.println("   | | (_| \\__ \\   <  | |  | | (_| | | | | (_| | (_| |  __/ |    | || |_| |");
            System.out.println("   |_|\\__,_|___/_|\\_\\ |_|  |_|\\__,_|_| |_|\\__,_|\\__, |\\___|_|    |_(_)___/ ");
            System.out.println("                                                |___/                      ");
        }
    }
}
