package Day3.ExampleForInheritance;

class MyJob extends DadRestaurant {


    int MyRestaurant = TotalRestaurant;

    public boolean myFoodSupply() {
        foodSupply();
        return true;
    }
}

public class FamilyJob {
    public static void main(String[] args) {

        MyJob mj = new MyJob();
        System.out.println("My restaurant which is coming from my father's class>>> " + mj.MyRestaurant);

        System.out.println(mj.myFoodSupply());

    }

}
