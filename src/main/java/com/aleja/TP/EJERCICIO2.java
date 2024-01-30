package com.aleja.TP;

public class EJERCICIO2 {
    // Clase Personaje
    public abstract class Personaje {
        private int salud;

        public Personaje(int salud) {
            this.salud = salud;
        }

        public int getSalud() {
            return salud;
        }

        public void setSalud(int salud) {
            this.salud = salud;
        }

        public abstract void entrenar();
    }

    // Clase Espadachín
    public class Espadachin extends Personaje {
        private int ataque;

        public Espadachin(int salud, int ataque) {
            super(salud);
            this.ataque = ataque;
        }

        public int getAtaque() {
            return ataque;
        }

        public void setAtaque(int ataque) {
            this.ataque = ataque;
        }

        @Override
        public void entrenar() {
            // Incrementa el ataque en 10 al entrenar
            this.ataque += 10;
        }
    }

    // Clase Torre
    public class Torre extends Personaje {
        private int nivel;

        public Torre(int salud, int nivel) {
            super(salud);
            this.nivel = nivel;
        }

        public int getNivel() {
            return nivel;
        }

        public void setNivel(int nivel) {
            this.nivel = nivel;
        }

        @Override
        public void entrenar() {
            // Aumenta el nivel en 1 al entrenar
            this.nivel++;
        }
    }

    // Clase Mago
    public class Mago extends Personaje {
        private String magia;

        public Mago(int salud, String magia) {
            super(salud);
            this.magia = magia;
        }

        public String getMagia() {
            return magia;
        }

        public void setMagia(String magia) {
            this.magia = magia;
        }

        @Override
        public void entrenar() {
            // Los magos no ganan nada al entrenar
        }
    }
}
