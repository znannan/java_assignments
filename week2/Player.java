public class Player {
    private String name;
    private String player_number;
    private int age;
    private int height;
    private int weight;
    //最大跑步速度
    private int max_speed;
    //踢的角色
    private String origin_position;
    //当前位置
    private String current_position;
    
    void cick(Ball ball){
        System.out.println( name+"kicks"+ball);
    }
}
