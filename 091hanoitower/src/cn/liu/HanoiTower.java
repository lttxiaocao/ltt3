package cn.liu;

public class HanoiTower {

	public static void moveDish(int level,char from,char inter,char to){
		if(level==1){
			System.out.println(from+"��"+to);
		}else{
			moveDish(level-1,from,to,inter);
			System.out.println(level+"��"+from+"��"+to);
			moveDish(level-1,inter,from,to);
		}
	}
	public static void main(String[] args) {
		moveDish(3,'A','B','c');
	}
}
