package factoryMethod;

public class Avion {
        private String model;
        private String capacity;
        private String brand;
        private String numberSeats;

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getCapacity() {
            return capacity;
        }

        public void setCapacity(String capacity) {
            this.capacity = capacity;
        }

        public String getModelo() {
            return model;
        }

        public void setModelo(String modelo) {
            this.model = modelo;
        }

        public String getNumberSeats() {
            return numberSeats;
        }

        public void setNumberSeats(String numberSeats) {
            this.numberSeats = numberSeats;
        }
        public void showInfo(){
            System.out.println("Brand: "+ getBrand());
            System.out.println("Model: "+getModelo());
            System.out.println("Capacity: "+ getCapacity());
            System.out.println("Number of Seats: "+ getNumberSeats());
        }
    }

