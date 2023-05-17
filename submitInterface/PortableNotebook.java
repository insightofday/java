package submitInterface;

public class PortableNotebook implements Notebook, Tablet {
	int mode;
	String pg;
	String internet;
	String video;
	String app;
	PortableNotebook(){
		mode=NOTEBOOK_MODE;
	}
	

	@Override
	public void watchVideo() {
		
		
	}

	@Override
	public void useApp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeDocumentaion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchInternet() {
		// TODO Auto-generated method stub
		
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
