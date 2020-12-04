package OCA_QA_Practice;

public class Q13 {

    class Vehicle {
        int x;

        Vehicle() {
            this(10); //line1
        }

        Vehicle(int x) {
            this.x = x;
        }
    }
        class Car extends Vehicle{
            int y;
            Car(){
                super(10); // line 2
            }
            Car(int y){
                super(y);
                this.y=y;
        }
        public String toString(){
                return super.x + ":" + this.y;
        }

    }



}
