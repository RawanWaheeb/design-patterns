package creational.singleton;

     class DatabaseConfig {

    private  static   DatabaseConfig  instance;

    private  DatabaseConfig(){

    }
    public static  DatabaseConfig getInstance(){
        if (instance == null) {
            instance = new DatabaseConfig();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to Database");
    }
}











