public class HomeWork09 {
	public static void main(String[] args) {
		Music music = new Music("嘻嘻嘻",222);
		music.play();
		System.out.println(music.getIfo());
	}
}
class Music {
	String name;
	double times;
	public Music(String name,double times) {
		this.name = name;
		this.times = times;
	}
	public void play(){
		System.out.println("音乐" + name +"时长" + times);
	}
	public String getIfo() {
		return "音乐" + name + "时长" + times;
	}

}