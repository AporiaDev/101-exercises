package AreaPolygon;

public class Triagle implements Interface{

        float n;
        float n1;
        float n2;

        public Triagle(float n, float n1, float n2){

            this.n = n;
            this.n1 = n1;
            this.n2 = n2;
        }

        @Override
        public float calcArea(){
        // Calculo semipero
            float s = (n + n1 + n2) / 2;
        // Calculo area
            double area = Math.sqrt((s) * (s - n) * (s - n1) * (s - n2));
            return (float) area;
        }

    }

