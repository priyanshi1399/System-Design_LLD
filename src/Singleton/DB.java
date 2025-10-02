package Singleton;

public enum DB {

    INSTANCE




    /*private static DB db;

    private DB(){
        if(db!=null){
            throw new RuntimeException("you are trying to break teh singleton pattern");
        }
    }
    public synchronized static DB getDBC(){
        //object of class
        if(db==null){
             db=new DB();
        }
        return db;


    /*
    public  static DB getDBC(){
        //object of class
        if(db==null){

            synchronized (DB.class){
                if(db==null){
                   db =new DB();
                }
            }

        }
        return db;
    }*/
}


//constructor private
//object create with the help of method
//craete field to store object is private

