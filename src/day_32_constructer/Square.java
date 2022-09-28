package day_32_constructer;

public class Square {
    public int sideLenght;

    public Square (){
        }
        public Square (int sideLenght){
            this.sideLenght=sideLenght;
        }

        public int calculateArea (){
            return (int) Math.pow(this.sideLenght,2);
        }
        public static double calculateArea (int sideLenght){
            return Math.pow(sideLenght, 2);

        }

            public int calculatePerimeter (){
                return (int) 4*this.sideLenght;
            }
            public double calculatePerimeter (int sideLenght){
                return 4*sideLenght;

            }
}
