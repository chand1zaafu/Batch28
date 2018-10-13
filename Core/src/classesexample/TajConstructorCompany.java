package classesexample;

public class TajConstructorCompany {

    private final String clientName;

    public TajConstructorCompany(String clientName){
        this.clientName = clientName;
    }

    public void createHouse() {
        System.out.println("This is Taj construction Company");

        System.out.println("Hi "+clientName+" I am going to create a house for you");
        TajKitchenCompany tajKitchenCompany = new TajKitchenCompany();
        tajKitchenCompany.createDesignerKitchen();

        System.out.println("Congratulations "+ clientName +" Your house is created !!!");
    }

    public class TajKitchenCompany {

        public void createDesignerKitchen(){
            createLayout();
            startMakingFloorPlans();
            layoutTiles();
        }

        private void createLayout(){
            System.out.println("Create Layout By "+ clientName);
        }

        private void startMakingFloorPlans(){
            System.out.println("Start Making FloorPlans");
        }

        private void layoutTiles(){
            System.out.println("Buy Tiles");
            cutTiles();
        }

        private void cutTiles(){
            System.out.println("Cut Tiles");
        }

    }

    public static class TajLivingRoomCompany {

        public void createDesignerLivingRoom(){
            createLayout();
            startMakingFloorPlans();
            layoutTiles();
        }

        private void createLayout(){
            System.out.println("Create Layout");
        }

        private void startMakingFloorPlans(){
            System.out.println("Start Making FloorPlans");
        }

        private void layoutTiles(){
            System.out.println("Buy Tiles");
            cutTiles();

        }

        private void cutTiles(){
            System.out.println("Cut Tiles");
        }

    }

}





