package trainingProject;

public class FirstProgram {
	public static void main(String[] args) {
		String hello="hello";
		String world="world";
		System.out.println("new value"+hello+world);
	}
	
}

class person{
	String name;
	job job;
	void start() {
		job.start();
	}
}

class job{
	String name;
	void start() {
		System.out.println("ndoing"+name);
	}
}
