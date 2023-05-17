package prj01;

public class PortableNotebook implements Notebook, Tablet {
	int mode;
	String pg;
	String internet;
	String video;
	String app;
	PortableNotebook(String pg, String internet, String video, String app){
		mode=NOTEBOOK_MODE;
		System.out.println(mode);
		this.pg=pg;
		this.internet=internet;
		this.video=video;
		this.app=app;
	}
	

	@Override
	public void watchVideo() {
		System.out.println(video+"을/를 시청");
		
	}

	@Override
	public void useApp() {
		if(mode==NOTEBOOK_MODE) {
			mode=TABLET_MODE;
			System.out.println("TABLET_MODE");
			System.out.println(app+"을/를 실행");
		}else {
			System.out.println(app+"을/를 실행");
		}
		
		
	}

	@Override
	public void writeDocumentaion() {
		System.out.println(pg+"을/를 통해 문서를 작성");
		
	}

	@Override
	public void searchInternet() {
		System.out.println(internet+"을/를 통해 인터넷을 검색");
		
	}
	public void changeMode() {
		if(mode==1) {
			mode=2;
			System.out.println("tabletmode로 변환되었습니다");
		}else if(mode==2) {
			mode=1;
			System.out.println("notebookmode로 변환되었습니다");
		}
	}
}
