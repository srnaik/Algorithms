package my.school;

public class ClassRoom {

    private int roomNumber;
    protected String teacherName;
    protected static int globalKey = 54321;
    public static int LENGTH = 5;
    public int floor = 3;

    static{
        LENGTH = 10;
    }

    public static void swing(){
        System.out.println("swing");
    }

    public ClassRoom(){

    }
    public ClassRoom(int r, String t){
        roomNumber = r;
        teacherName = t;
    }

    protected String getTeachername(){
        return teacherName;
    }
}
